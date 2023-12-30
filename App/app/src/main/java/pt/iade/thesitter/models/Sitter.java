package pt.iade.thesitter.models;

public class Sitter {


    private int sitId;


    private int sitUserId;


    private String sitExperience;


    private String sitEducation;


    private String sitAboutMe;


    private int sitBooId;


    private int sitReability;


    private int sitResponseTime;


    private int sitResponseRate;

    public Sitter(){

    }

    public Sitter(int sitId, int sitUserId, String sitExperience, String sitEducation, String sitAboutMe, int sitBooId, int sitReability, int sitResponseTime, int sitResponseRate) {
        this.sitId = sitId;
        this.sitUserId = sitUserId;
        this.sitExperience = sitExperience;
        this.sitEducation = sitEducation;
        this.sitAboutMe = sitAboutMe;
        this.sitBooId = sitBooId;
        this.sitReability = sitReability;
        this.sitResponseTime = sitResponseTime;
        this.sitResponseRate = sitResponseRate;
    }

    public int getSitId() {return sitId;}

    public int getSitUserId() {return sitUserId;}

    public String getSitExperience() {return sitExperience;}

    public String getSitEducation() {return sitEducation;}

    public String getSitAboutMe() {return sitAboutMe;}

    public int getSitBooId() {return sitBooId;}

    public int getSitReability() {
        return sitReability;
    }

    public int getSitResponseTime() {
        return sitResponseTime;
    }

    public int getSitResponseRate() {
        return sitResponseRate;
    }
}
