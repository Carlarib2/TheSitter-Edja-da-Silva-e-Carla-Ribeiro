package pt.iade.thesitter.models;

import java.time.LocalDate;

public class FamilyMember {



    private int faId;

    private String faName;

    private LocalDate faBdate;

    private String faSchool;

    private String faAllergies;

    private String faAboutMe;

    private String faGender;

    private int faCliId;

    private int faCreId;


    public FamilyMember(){

    }

    public FamilyMember(int faId, String faName, LocalDate faBdate, String faSchool, String faAllergies, String faAboutMe, String faGender, int faCliId, int faCreId) {
        this.faId = faId;
        this.faName = faName;
        this.faBdate = faBdate;
        this.faSchool = faSchool;
        this.faAllergies = faAllergies;
        this.faAboutMe = faAboutMe;
        this.faGender = faGender;
        this.faCliId = faCliId;
        this.faCreId = faCreId;
    }

    public int getFaId() {
        return faId;
    }

    public String getFaName() {
        return faName;
    }

    public LocalDate getFaBdate() {
        return faBdate;
    }

    public String getFaSchool() {
        return faSchool;
    }

    public String getFaAllergies() {
        return faAllergies;
    }

    public String getFaAboutMe() {
        return faAboutMe;
    }

    public String getFaGender() {
        return faGender;
    }

    public int getFaCliId() {
        return faCliId;
    }

    public int getFaCreId() {
        return faCreId;
    }

    public void setFaName(String faName) {
        this.faName = faName;
    }

    public void setFaBdate(LocalDate faBdate) {
        this.faBdate = faBdate;
    }

    public void setFaSchool(String faSchool) {
        this.faSchool = faSchool;
    }

    public void setFaAllergies(String faAllergies) {
        this.faAllergies = faAllergies;
    }

    public void setFaAboutMe(String faAboutMe) {
        this.faAboutMe = faAboutMe;
    }

    public void setFaGender(String faGender) {
        this.faGender = faGender;
    }

    public void setFaCliId(int faCliId) {
        this.faCliId = faCliId;
    }

    public void setFaCreId(int faCreId) {
        this.faCreId = faCreId;
    }
}
