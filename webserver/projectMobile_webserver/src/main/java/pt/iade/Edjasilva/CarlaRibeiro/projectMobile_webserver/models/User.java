package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="user_id")
    private int userId;
    @Column(name="user_name")
    private String userName;
    @Column(name="user_gender")
    private String userGender;
    @Column(name="user_email")
    private String userEmail;
    @Column(name="user_password")
    private String userPassword;
    @Column(name="user_bdate")
    private LocalDate userBdate;
    @Column(name="user_mobile")
    private String userMobile;
    @Column(name="user_address")
    private String userAddress;
    @Column(name="user_uploadDc")
    private int  userUploadDc;
    @Column(name="user_uploadIm")
    private int userUploadIm;



    public User() {
    }


    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
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

    public LocalDate getUserBdate() {
        return userBdate;
    }

    public void setUserBdate(LocalDate userBdate) {
        this.userBdate = userBdate;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserUploadDc() {
        return userUploadDc;
    }

    public void setUserUploadDc(int userUploadDc) {
        this.userUploadDc = userUploadDc;
    }

    public int getUserUploadIm() {
        return userUploadIm;
    }

    public void setUserUploadIm(int userUploadIm) {
        this.userUploadIm = userUploadIm;
    }


}
