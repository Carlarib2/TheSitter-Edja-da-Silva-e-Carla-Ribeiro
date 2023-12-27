package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="user_bdate")
    private LocalDate userBdate;


    @Column(name="user_address")
    private String userAddress;

    @Column(name="user_mobile")
    private String userMobile;

    @Column(name="user_email")
    private String userEmail;

    @Column(name="user_password")
    private String userPassword;

    @Column(name="user_gender")
    private String userGender;

    @Column(name="user_id")
    private int userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="user_pla_id")
    private int userPlaId;

    public User() {
    }


    public LocalDate getUserBdate() {
        return userBdate;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserPlaId() {
        return userPlaId;
    }
}
