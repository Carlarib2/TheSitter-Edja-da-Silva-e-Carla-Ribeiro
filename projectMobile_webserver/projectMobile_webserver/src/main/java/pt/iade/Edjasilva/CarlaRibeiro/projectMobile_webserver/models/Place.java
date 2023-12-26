package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="pla_id")
    private int pla_id;

    @Column(name="pla_address")
    private String pla_address;

    @Column(name="pla_longitude")
    private double pla_logitude;

    @Column(name="pla_altitude")
    private double pla_altitude;
}
