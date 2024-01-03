package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="sitter")
public class Sitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="sit_id")
    private int sitId;

    @OneToOne
    @JoinColumn(name="sit_user_id", referencedColumnName = "user_id")
    @JsonBackReference("user-sitter")
    private User user;



    @Column(name="sit_experience")
    private String sitExperience;

    @Column(name="sit_education")
    private String sitEducation;

    @Column(name="sit_aboutMe")
    private String sitAboutMe;


    @Column(name="sit_reability")
    private int sitReability;

    @Column(name="sit_responseTime")
    private int sitResponseTime;

    @Column(name="sit_responseRate")
    private int sitResponseRate;

    @OneToMany(mappedBy = "sitter")
    @JsonManagedReference("sitter-sitterRating")
    private Set<SitterRating> sitterRatings;


    @OneToMany(mappedBy = "sitter")
    @JsonManagedReference("sitter-booking")
    private Set<Booking> booking;

    public Sitter(){

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

    public int getSitReability() {
        return sitReability;
    }

    public void setSitReability(int sitReability) {
        this.sitReability = sitReability;
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

    public Set<SitterRating> getSitterRatings() {
        return sitterRatings;
    }

    public void setSitterRatings(Set<SitterRating> sitterRatings) {
        this.sitterRatings = sitterRatings;
    }

    public Set<Booking> getBooking() {
        return booking;
    }

    public void setBooking(Set<Booking> booking) {
        this.booking = booking;
    }

    public int getSitId() {
        return sitId;
    }
}
