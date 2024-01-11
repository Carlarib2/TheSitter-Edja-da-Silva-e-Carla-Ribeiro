package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="sitter")
public class Sitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="sit_id")
    private int sitId;


    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "sit_user_id")
    private User user;

    @Column(name="sit_experience")
    private String sitExperience;

    @Column(name="sit_education")
    private String sitEducation;

    @Column(name="sit_aboutMe")
    private String sitAboutMe;

    @Column(name="sit_reliability")
    private int sitReliability;

    @Column(name="sit_responseTime")
    private int sitResponseTime;

    @Column(name="sit_responseRate")
    private int sitResponseRate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "sitter")
    @JsonManagedReference("booking-sitter")
    private List<Booking> bookings;


    public Sitter(){

    }


    public int getSitId() {
        return sitId;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSitExperience() {
        return sitExperience;
    }

    public void setSitExperience(String sitExperience) {
        this.sitExperience = sitExperience;
    }

    public String getSitEducation() {
        return sitEducation;
    }

    public void setSitEducation(String sitEducation) {
        this.sitEducation = sitEducation;
    }

    public String getSitAboutMe() {
        return sitAboutMe;
    }

    public void setSitAboutMe(String sitAboutMe) {
        this.sitAboutMe = sitAboutMe;
    }

    public int getSitReliability() {
        return sitReliability;
    }

    public void setSitReliability(int sitReliability) {
        this.sitReliability = sitReliability;
    }

    public int getSitResponseTime() {
        return sitResponseTime;
    }

    public void setSitResponseTime(int sitResponseTime) {
        this.sitResponseTime = sitResponseTime;
    }

    public int getSitResponseRate() {
        return sitResponseRate;
    }

    public void setSitResponseRate(int sitResponseRate) {
        this.sitResponseRate = sitResponseRate;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
