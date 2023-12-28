package pt.iade.thesitter.models;

public class Sitter_rating {


    private int raId;

    private int raSitId;

    private int raValue;

    private String raComment;

    public Sitter_rating(){
    }

    public Sitter_rating(int raId, int raSitId, int raValue, String raComment) {
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
