package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="creatures")
public class Creatures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="cre_id")
    private int creId;

    @Column(name="cre_type")
    private String creType;

    @Column(name="cre_info")
    private String creInfo;

    public Creatures(){

    }


    public int getCreId() {
        return creId;
    }

    public String getCreType() {
        return creType;
    }

    public void setCreType(String creType) {
        this.creType = creType;
    }

    public String getCreInfo() {
        return creInfo;
    }

    public void setCreInfo(String creInfo) {
        this.creInfo = creInfo;
    }
}
