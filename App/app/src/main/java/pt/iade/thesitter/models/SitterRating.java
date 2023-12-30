package pt.iade.thesitter.models;

public class SitterRating {


    private int raId;

    private int raSitId;

    private int raValue;

    private String raComment;

    public SitterRating(){
    }

    public SitterRating(int raId, int raSitId, int raValue, String raComment) {
        this.raId = raId;
        this.raSitId = raSitId;
        this.raValue = raValue;
        this.raComment = raComment;
    }

    public int getRaId(){return raId; }

    public int getRaSitId(){return raSitId;}

    public int getRaValue(){return raValue;}

    public String getRaComment(){return raComment;}
}
