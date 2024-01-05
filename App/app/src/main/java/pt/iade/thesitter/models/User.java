package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;

import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.HashMap;

import pt.iade.thesitter.utilities.DateJsonAdapter;

import pt.iade.thesitter.utilities.WebRequest;


public class User implements Serializable{
    @JsonAdapter(DateJsonAdapter.class)
    private LocalDate userBdate;

    private byte[]  userUploadDc;

    private String userAddress;

    private String userMobile;

    private String userEmail;

    private String userPassword;

    private String userGender;

    private int userId;

    private String userName;

    private byte [] userUploadIm;

    public User() {
        this(0, "", "", "", "", "", "", null, null, null);
    }

    public User(int userId, String userName, String userGender, String userPassword, String userEmail, String userMobile, String userAddress, byte[] userUpload, LocalDate userBdate, byte[] userUploadIm) {
        this.userName = userName;
        this.userId= userId;
        this.userGender=userGender;
        this.userPassword=userPassword;
        this.userEmail=userEmail;
        this.userMobile=userMobile;
        this.userAddress=userAddress;
        this.userUploadDc=userUploadDc;
        this.userBdate=userBdate;
        this.userUploadIm=userUploadIm;
    }


    public LocalDate getUserBdate() {
        return userBdate;
    }


    public void register (RegisterResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/users"));
                    String resp = request.performPostRequest(User.this);

                    User user = new Gson().fromJson(resp, User.class);

                    userId = user.getUserId();
                    response.response();

                } catch (Exception e){
                    Log.e("User.register", e.toString());
                }
            }
        });
        thread.start();
    }

    public static void Login(String userEmail, String userPassword, LoginResponse response){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/users"));

                    HashMap<String, String> params = new HashMap<String, String>();
                    params.put("userPassword", userPassword);
                    params.put("userEmail", userEmail);

                    String resp = request.performGetRequest(params);
                    User user = new Gson().fromJson(resp, User.class);

                    response.response(user);

                } catch (Exception e){
                    Log.e("User.Login", e.toString());
                }
            }
        });
        thread.start();
    }


    public void setUserBdate(LocalDate userBdate) {
        this.userBdate = userBdate;
    }

    public byte[] getUserUpload() {
        return userUploadDc;
    }

    public void setUserUpload(byte[] userUpload) {
        this.userUploadDc = userUpload;
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

    public int getUserId() {
        return userId;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public byte[] getUserUploadIm() {
        return userUploadIm;
    }

    public void setUserUploadIm(byte[] userUploadIm) {
        this.userUploadIm = userUploadIm;
    }


    public interface LoginResponse {
        public void response(User user);
    }

    public interface RegisterResponse{
        public void response();
    }



}