package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import pt.iade.thesitter.Register;
import pt.iade.thesitter.utilities.WebRequest;

public class Client implements Serializable {
    private int cliId;
    private User user;
    private int cliSitNum;
    ArrayList<Booking> bookings;
    ArrayList<FamilyMember> familyMembers;

    public Client(){
        this(0, null, 0, new ArrayList<Booking>(), new ArrayList<FamilyMember>());
    }

    public Client(int cliId, User user, int cliSitNum, ArrayList<Booking> bookings,
                  ArrayList<FamilyMember> familyMembers) {
        this.cliId = cliId;
        this.user = user;
        this.cliSitNum = cliSitNum;
        this.bookings = bookings;
        this.familyMembers = familyMembers;
    }


    public static void Login(String userEmail, String userPassword, LoginResponse response){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/clients"));

                    HashMap<String, String> params = new HashMap<String, String>();
                    params.put("userPassword", userPassword);
                    params.put("userEmail", userEmail);

                    String resp = request.performGetRequest(params);
                    Client client = new Gson().fromJson(resp, Client.class);

                    response.response(client);

                } catch (Exception e){
                    Log.e("Client.Login", e.toString());
                }
            }
        });
        thread.start();
    }

    public void register(RegisterResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
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
        thread.start();
    }

    public int getCliId() {
        return cliId;
    }

    public void setCliId(int cliId) {
        this.cliId = cliId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCliSitNum() {
        return cliSitNum;
    }

    public void setCliSitNum(int cliSitNum) {
        this.cliSitNum = cliSitNum;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public ArrayList<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(ArrayList<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }


    public interface RegisterResponse{
        public void response();
    }

    public interface LoginResponse{
        public void response(Client returnedClient);
    }
}
