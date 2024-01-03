package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="cli_id")
    private int cliId;

    @OneToOne
    @JoinColumn(name="cli_user_id", referencedColumnName = "user_id")
    @JsonManagedReference("user-client")
    private User user;

    @OneToMany(mappedBy = "client")
    @JsonManagedReference("familyMember-client")
    private Set<FamilyMember> familyMembers;

    @OneToMany(mappedBy = "client")
    @JsonManagedReference("client-booking")
    private Set<Booking> booking;




    public Client(){

    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<FamilyMember> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Set<FamilyMember> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }

    public int getCliId() {
        return cliId;
    }
}
