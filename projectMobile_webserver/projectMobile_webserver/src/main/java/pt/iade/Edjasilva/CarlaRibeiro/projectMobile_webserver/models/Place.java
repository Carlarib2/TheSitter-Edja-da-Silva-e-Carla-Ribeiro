package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="place")
public class Place {


    @Column(name="pla_id")
    private int pla_id;

    @Column(name="pla_address")
    private String pla_address;

    @Column(name="pla_longitude")
    private double pla_logitude;

    @Column(name="pla_altitude")
    private double pla_altitude;
}
