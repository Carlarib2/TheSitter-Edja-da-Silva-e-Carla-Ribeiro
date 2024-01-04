package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.Set;

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


    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public int getStaId() {
        return staId;
    }
}
