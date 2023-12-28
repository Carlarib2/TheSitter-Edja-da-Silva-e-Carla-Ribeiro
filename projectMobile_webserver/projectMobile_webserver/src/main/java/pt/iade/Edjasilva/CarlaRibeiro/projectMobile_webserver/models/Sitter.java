package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="sitter")
public class Sitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="sit_id")
    private int sit_id;

    @Column(name="sit_user_id")
    private int sit_user_id;

    @Column(name="sit_name")
    private String sit_name;

    @Column(name="sit_bdate")
    private LocalDate sit_bdate;

    @Column(name="sit_experience")
    private String sit_experience;

    @Column(name="sit_address")
    private String sit_address;

    @Column(name="sit_education")
    private String sit_education;

    @Column(name="sit_mobile")
    private String sit_mobile;

    @Column(name="sit_gender")
    private String sit_gender;

    @Column(name="sit_aboutMe")
    private int sit_aboutMe;

    @Column(name="sit_password")
    private String sit_password;

    @Column(name="sit_boo_id")
    private int sit_boo_id;

    @Column(name="sit_email")
    private String sit_email;

    @Column(name="sit_reability")
    private int sit_reability;

    @Column(name="sit_responseTime")
    private int sit_responseTime;

    @Column(name="sit_responseRate")
    private int sit_responseRate;
}
