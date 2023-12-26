package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="family_member")
public class Family_member {

    @Column(name="fa_id")
    private int fa_id;

    @Column(name="fa_name")
    private String fa_name;

    @Column(name="fa_bdate")
    private LocalDate fa_bdate;

    @Column(name="fa_school")
    private String fa_school;

    @Column(name="fa_allergies")
    private String fa_allergies;

    @Column(name="fa_aboutMe")
    private String fa_aboutMe;

    @Column(name="fa_gender")
    private String fa_gender;

    @Column(name="fa_cli_id")
    private int fa_cli_id;

    @Column(name="fa_cre_id")
    private int fa_cre_id;
}
