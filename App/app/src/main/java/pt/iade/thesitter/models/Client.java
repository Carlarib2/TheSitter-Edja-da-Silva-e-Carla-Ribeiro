package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;

import java.io.Serializable;
import java.net.URL;

import pt.iade.thesitter.Register;
import pt.iade.thesitter.utilities.WebRequest;

public class Client implements Serializable {
    private int cliId;
    private int cliUserId;

    public Client(){
        this(0, 0);
    }

    public Client(int cliId, int cliUserId) {
        this.cliId = cliId;
        this.cliUserId = cliUserId;

    }

    public void register(User user, RegisterResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                user.register(new User.RegisterResponse() {
                    @Override
                    public void response() {
                        cliUserId = user.getUserId();
                        try {
                            WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/clients"));
                            String resp = request.performPostRequest(Client.this);

                            Client client = new Gson().fromJson(resp, Client.class);

                            cliId = client.getCliId();
                            response.response();

                        } catch (Exception e){
                            Log.e("Client.register", e.toString());
                        }
                    }
                });
            }
        });
        thread.start();
    }

    public static void GetByUserId(int userId, GetByUserIdResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/clients/user/"+userId));
                    String resp = request.performGetRequest();

                    Client client = new Gson().fromJson(resp, Client.class);

                    response.response(client);

                } catch (Exception e){
                    Log.e("Client.GetByUserId", e.toString());
                }
            }
        });
        thread.start();
    }

    public int getCliId() {
        return cliId;
    }

    public int getCliUserId() {
        return cliUserId;
    }

    public void setCliUserId(int cliUserId) {
        this.cliUserId = cliUserId;
    }


    public interface RegisterResponse{
        public void response();
    }

    public interface GetByUserIdResponse{
        public void response(Client returnedClient);
    }
}
