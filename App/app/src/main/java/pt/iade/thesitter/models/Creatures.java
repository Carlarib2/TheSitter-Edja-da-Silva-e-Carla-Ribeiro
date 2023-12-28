package pt.iade.thesitter.models;

public class Creatures {


    private int creId;

    private String creType;

    private String creInfo;

    public Creatures(){

    }

    public Creatures(int creId, String creType, String creInfo) {
        this.creId = creId;
        this.creType = creType;
        this.creInfo = creInfo;
    }

    public int getCreId() {
        return creId;
    }

    public String getCreType() {
        return creType;
    }

    public String getCreInfo() {
        return creInfo;
    }
}
