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
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="cli_id")
    private int cli_id;

    @Column(name="cli_user_id")
    private int cli_user_id;

    @Column(name="cli_name")
    private String cli_name;

    @Column(name="cli_bdate")
    private LocalDate cli_bdate;

    @Column(name="cli_address")
    private String cli_addres;

    @Column(name="cli_mobile")
    private String cli_mobile;

    @Column(name="cli_email")
    private String cli_email;

    @Column(name="cli_password")
    private String cli_password;

    @Column(name="cli_gender")
    private String cli_gender;

    @Column(name="cli_sta_id")
    private int cli_sta_id;
}
