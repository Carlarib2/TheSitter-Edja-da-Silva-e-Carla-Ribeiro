package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="user_id")
    private int userId;

    @Column(name="user_bdate")
    private LocalDate userBdate;

    @Column(name="user_upload")
    private byte[]  userUpload;


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

    @Column(name="user_name")
    private String userName;

    //@Column(name="user_pla_id")
    //private int userPlaId;

   // @Column(name="user_ac_id")
   // private int userAcId;

    @ManyToOne
    @JoinColumn(name="user_ac_id", referencedColumnName = "ac_id")
    @JsonBackReference("access-user")
    private Access access;


    @OneToOne
    @JoinColumn(name="user_pla_id", referencedColumnName = "pla_id")
    @JsonBackReference("place-user")
    private Place place;



    public User() {
    }


    public int getUserId() {
        return userId;
    }

    public LocalDate getUserBdate() {
        return userBdate;
    }

    public void setUserBdate(LocalDate userBdate) {
        this.userBdate = userBdate;
    }

    public byte[] getUserUpload() {
        return userUpload;
    }

    public void setUserUpload(byte[] userUpload) {
        this.userUpload = userUpload;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /*public int getUserPlaId() {
        return userPlaId;
    }

    public void setUserPlaId(int userPlaId) {
        this.userPlaId = userPlaId;
    }

    public int getUserAcId() {
        return userAcId;
    }

    /*public void setUserAcId(int userAcId) {
        this.userAcId = userAcId;
    }*/

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
