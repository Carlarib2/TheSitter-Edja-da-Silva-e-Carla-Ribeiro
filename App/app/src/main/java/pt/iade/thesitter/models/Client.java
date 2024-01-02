package pt.iade.thesitter.models;

public class Client {


    private int cliId;

    private int cliUserId;

    private int cliStaId;

    public Client(){

    }

    public Client(int cliId, int cliUserId, int cliStaId) {
        this.cliId = cliId;
        this.cliUserId = cliUserId;
        this.cliStaId = cliStaId;
    }

    public int getCliId() {
        return cliId;
    }

    public int getCliUserId() {
        return cliUserId;
    }

    public int getCliStaId() {
        return cliStaId;
    }

    public void setCliUserId(int cliUserId) {
        this.cliUserId = cliUserId;
    }

    public void setCliStaId(int cliStaId) {
        this.cliStaId = cliStaId;
    }
}
