package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="cli_id")
    private int cliId;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cli_user_id")
    private User user;
    @Column(name = "cli_sitNum")
    private int cliSitNum;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
    @JsonManagedReference("booking-client")
    private List<Booking> bookings;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "client")
    @JsonManagedReference("member-client")
    private List<FamilyMember> familyMembers;


    public Client() {
    }


    public int getCliId() {
        return cliId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCliSitNum() {
        return cliSitNum;
    }

    public void setCliSitNum(int cliSitNum) {
        this.cliSitNum = cliSitNum;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public List<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }
}
