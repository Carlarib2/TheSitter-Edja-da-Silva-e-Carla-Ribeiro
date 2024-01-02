package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name="place")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="pla_id")
    private int plaId;

    @Column(name="pla_address")
    private String plaAddress;

    @Column(name="pla_longitude")
    private double plaLogitude;

    @Column(name="pla_altitude")
    private double plaAltitude;

    @OneToOne(mappedBy = "place")
    @JsonManagedReference("place-user")
    private User user;

    // getters e setters para user
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Place(){

    }


    public int getPlaId() {
        return plaId;
    }

    public String getPlaAddress() {
        return plaAddress;
    }

    public void setPlaAddress(String plaAddress) {
        this.plaAddress = plaAddress;
    }

    public double getPlaLogitude() {
        return plaLogitude;
    }

    public void setPlaLogitude(double plaLogitude) {
        this.plaLogitude = plaLogitude;
    }

    public double getPlaAltitude() {
        return plaAltitude;
    }

    public void setPlaAltitude(double plaAltitude) {
        this.plaAltitude = plaAltitude;
    }
}
