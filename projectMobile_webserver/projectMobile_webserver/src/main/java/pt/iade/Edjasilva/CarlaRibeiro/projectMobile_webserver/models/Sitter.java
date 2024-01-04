package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.*;

@Entity
@Table(name="sitter")
public class Sitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="sit_id")
    private int sitId;

    @Column(name = "sit_user_id")
    private int sitUserId;

    @Column(name="sit_experience")
    private String sitExperience;

    @Column(name="sit_education")
    private String sitEducation;

    @Column(name="sit_aboutMe")
    private String sitAboutMe;

    @Column(name="sit_reliability")
    private int sitReliability;

    @Column(name="sit_responseTime")
    private int sitResponseTime;

    @Column(name="sit_responseRate")
    private int sitResponseRate;


    public Sitter(){

    }

    public int getSitId() {
        return sitId;
    }


    public int getSitUserId() {
        return sitUserId;
    }

    public void setSitUserId(int sitUserId) {
        this.sitUserId = sitUserId;
    }

    public String getSitExperience() {
        return sitExperience;
    }

    public void setSitExperience(String sitExperience) {
        this.sitExperience = sitExperience;
    }

    public String getSitEducation() {
        return sitEducation;
    }

    public void setSitEducation(String sitEducation) {
        this.sitEducation = sitEducation;
    }

    public String getSitAboutMe() {
        return sitAboutMe;
    }

    public void setSitAboutMe(String sitAboutMe) {
        this.sitAboutMe = sitAboutMe;
    }

    public int getSitReliability() {
        return sitReliability;
    }

    public void setSitReliability(int sitReliability) {
        this.sitReliability = sitReliability;
    }

    public int getSitResponseTime() {
        return sitResponseTime;
    }

    public void setSitResponseTime(int sitResponseTime) {
        this.sitResponseTime = sitResponseTime;
    }

    public int getSitResponseRate() {
        return sitResponseRate;
    }

    public void setSitResponseRate(int sitResponseRate) {
        this.sitResponseRate = sitResponseRate;
    }
}
