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

    @OneToMany(mappedBy = "status")
    @JsonManagedReference("status-booking")
    private Set<Booking> booking;

    public Status (){
    }


    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }

    public int getStaId() {
        return staId;
    }
}
