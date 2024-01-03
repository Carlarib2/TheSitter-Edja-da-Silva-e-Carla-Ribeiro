package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Set;

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

    @OneToMany(mappedBy = "creatures")
    @JsonBackReference("familyMember-creatures")
    private Set<Creatures> creatures;

    public Creatures(){

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

    public Set<Creatures> getCreatures() {
        return creatures;
    }

    public void setCreatures(Set<Creatures> creatures) {
        this.creatures = creatures;
    }

    public int getCreId() {
        return creId;
    }
}
