package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="family_member")
public class FamilyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="fa_id")
    private int faId;

    @Column(name="fa_name")
    private String faName;

    @Column(name="fa_bdate")
    private LocalDate faBdate;

    @Column(name="fa_school")
    private String faSchool;

    @Column(name="fa_allergies")
    private String faAllergies;

    @Column(name="fa_aboutMe")
    private String faAboutMe;

    @Column(name="fa_gender")
    private String faGender;

    @Column(name="fa_cli_id")
    private int faCliId;

    @Column(name="fa_cre_id")
    private int faCreId;


    public FamilyMember(){

    }


    public int getFaId() {
        return faId;
    }


    public String getFaName() {
        return faName;
    }

    public void setFaName(String faName) {
        this.faName = faName;
    }

    public LocalDate getFaBdate() {
        return faBdate;
    }

    public void setFaBdate(LocalDate faBdate) {
        this.faBdate = faBdate;
    }

    public String getFaSchool() {
        return faSchool;
    }

    public void setFaSchool(String faSchool) {
        this.faSchool = faSchool;
    }

    public String getFaAllergies() {
        return faAllergies;
    }

    public void setFaAllergies(String faAllergies) {
        this.faAllergies = faAllergies;
    }

    public String getFaAboutMe() {
        return faAboutMe;
    }

    public void setFaAboutMe(String faAboutMe) {
        this.faAboutMe = faAboutMe;
    }

    public String getFaGender() {
        return faGender;
    }

    public void setFaGender(String faGender) {
        this.faGender = faGender;
    }

    public int getFaCliId() {
        return faCliId;
    }

    public void setFaCliId(int faCliId) {
        this.faCliId = faCliId;
    }

    public int getFaCreId() {
        return faCreId;
    }

    public void setFaCreId(int faCreId) {
        this.faCreId = faCreId;
    }
}
