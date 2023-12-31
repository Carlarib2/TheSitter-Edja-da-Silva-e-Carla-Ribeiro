package pt.iade.thesitter.models;

public class Access {

    private int acId;

    private String acName;

    public Access() {
    }

    public Access(int acId, String acName) {
        this.acId = acId;
        this.acName = acName;
    }

    public int getAcId() {
        return acId;
    }

    public String getAcName() {
        return acName;
    }
}
