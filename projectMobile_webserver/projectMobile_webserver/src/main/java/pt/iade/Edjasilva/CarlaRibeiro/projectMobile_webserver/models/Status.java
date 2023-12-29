package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="sta_id")
    private int staId;

    @Column(name="sta_name")
    private String staName;

    public Status (){
    }

    public int getStaId(){return staId;}
    public String getStaName(){return staName;}




}
