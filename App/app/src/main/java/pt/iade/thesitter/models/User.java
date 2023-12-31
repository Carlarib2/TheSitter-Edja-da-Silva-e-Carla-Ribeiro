package pt.iade.thesitter.models;

import java.time.LocalDate;

public class User {

    private LocalDate userBdate;

    private byte[]  userUpload;

    private String userAddress;

    private String userMobile;

    private String userEmail;

    private String userPassword;

    private String userGender;

    private int userId;

    private String userName;

    private int userPlaId;

    public User() {
    }

    public User(String userName, int userPlaId, int userId, String userGender, String userPassword, String userEmail, String userMobile, String userAddress, byte[] userUpload, LocalDate userBdate) {
        this.userName = userName;
        this.userPlaId = userPlaId;
        this.userId= userId;
        this.userGender=userGender;
        this.userPassword=userPassword;
        this.userEmail=userEmail;
        this.userMobile=userMobile;
        this.userAddress=userAddress;
        this.userUpload=userUpload;
        this.userBdate=userBdate;
    }


    public LocalDate getUserBdate() {
        return userBdate;
    }

    public byte[] getUserUpload() {
        return userUpload;
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
