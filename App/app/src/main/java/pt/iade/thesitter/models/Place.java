package pt.iade.thesitter.models;

public class Place {

    private int plaId;

    private String plaAddress;


    private double plaLogitude;


    private double plaAltitude;

    public Place(){

    }

    public Place(int plaId, String plaAddress, double plaLogitude, double plaAltitude) {
        this.plaId = plaId;
        this.plaAddress = plaAddress;
        this.plaLogitude = plaLogitude;
        this.plaAltitude = plaAltitude;
    }

    public int getPlaId() {
        return plaId;
    }

    public String getPlaAddress() {
        return plaAddress;
    }

    public double getPlaLogitude() {
        return plaLogitude;
    }

    public double getPlaAltitude() {
        return plaAltitude;
    }
}
