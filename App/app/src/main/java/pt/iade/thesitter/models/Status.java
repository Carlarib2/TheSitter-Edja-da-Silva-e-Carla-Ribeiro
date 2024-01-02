package pt.iade.thesitter.models;

public class Status {


    private int staId;


    private String staName;

    public Status (){
    }

    public Status(int staId, String staName) {
        this.staId = staId;
        this.staName = staName;
    }

    public int getStaId(){return staId;}
    public String getStaName(){return staName;}

    public void setStaName(String staName) {
        this.staName = staName;
    }
}
