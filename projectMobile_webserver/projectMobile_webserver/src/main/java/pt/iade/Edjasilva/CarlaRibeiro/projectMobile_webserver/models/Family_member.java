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
public class Family_member {
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


    public Family_member(){

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
}
