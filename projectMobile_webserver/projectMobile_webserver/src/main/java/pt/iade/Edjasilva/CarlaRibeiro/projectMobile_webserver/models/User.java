package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {


    @Column(name="user_id")
    private int user_id;

    @Column(name="user_name")
    private String user_name;

    @Column(name="user_pla_id")
    private int user_pla_id;
}
