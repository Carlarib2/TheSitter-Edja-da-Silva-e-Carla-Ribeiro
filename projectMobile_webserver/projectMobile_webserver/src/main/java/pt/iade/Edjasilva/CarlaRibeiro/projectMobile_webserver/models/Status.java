package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="status")
public class Status {


    @Column(name="sta_id")
    private int sta_id;

    @Column(name="sta_name")
    private String sta_name;
}
