package pt.iade.thesitter.models;

public class Client {


    private int cliId;

    private int cliUserId;



    public Client(){

    }

    public Client(int cliId, int cliUserId, int cliStaId) {
        this.cliId = cliId;
        this.cliUserId = cliUserId;

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


}
