package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="sitter")
public class Sitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="sit_id")
    private int sitId;

    @Column(name="sit_user_id")
    private int sitUserId;

    @Column(name="sit_experience")
    private String sitExperience;

    @Column(name="sit_education")
    private String sitEducation;

    @Column(name="sit_aboutMe")
    private String sitAboutMe;

    @Column(name="sit_boo_id")
    private int sitBooId;

    @Column(name="sit_reability")
    private int sitReability;

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

    public int getSitBooId() {
        return sitBooId;
    }

    public void setSitBooId(int sitBooId) {
        this.sitBooId = sitBooId;
    }

    public int getSitReability() {
        return sitReability;
    }

    public void setSitReability(int sitReability) {
        this.sitReability = sitReability;
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
