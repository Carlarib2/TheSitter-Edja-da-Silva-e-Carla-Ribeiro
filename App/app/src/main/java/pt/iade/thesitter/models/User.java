package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;

import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

import pt.iade.thesitter.utilities.DateJsonAdapter;

import pt.iade.thesitter.utilities.WebRequest;


public class User implements Serializable{
    private int userId;
    private String userName;
    private String userGender;
    private String userEmail;
    private String userPassword;
    @JsonAdapter(DateJsonAdapter.class)
    private LocalDate userBdate;
    private String userMobile;
    private String userAddress;
    private int userUploadIm;
    private int userUploadDc;

    public User() {
        this(0, "", "", "", "", LocalDate.now(), "", "", 0, 0);
    }

    public User(int userId, String userName, String userGender, String userEmail, String userPassword, LocalDate userBdate, String userMobile, String userAddress, int userUploadDc, int userUploadIm) {
        this.userId= userId;
        this.userName = userName;
        this.userGender=userGender;
        this.userEmail=userEmail;
        this.userPassword=userPassword;
        this.userBdate=userBdate;
        this.userAddress=userAddress;
        this.userMobile=userMobile;
        this.userUploadDc=userUploadDc;
        this.userUploadIm=userUploadIm;
    }


    public static void GetAllById(ArrayList<Integer> userIds, GetAllByIdResponse response) {
        ArrayList<User> users = new ArrayList<User>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/users/allbyid"));
                    String resp = request.performPostRequest(userIds);

                    JsonArray array = new Gson().fromJson(resp, JsonArray.class);

                    for (JsonElement element : array) {
                        users.add(new Gson().fromJson(element, User.class));
                    }

                    response.response(users);

                } catch (Exception e) {
                    Log.e("Sitter.GetAllById", e.toString());
                }
            }
        });
        thread.start();
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

    public int getUserUploadIm() {
        return userUploadIm;
    }

    public void setUserUploadIm(int userUploadIm) {
        this.userUploadIm = userUploadIm;
    }

    public int getUserUploadDc() {
        return userUploadDc;
    }

    public void setUserUploadDc(int userUploadDc) {
        this.userUploadDc = userUploadDc;
    }

    public interface GetAllByIdResponse{
        public void response(ArrayList<User> users);
    }

    public interface LoginResponse {
        public void response(User user);
    }

    public interface RegisterResponse{
        public void response();
    }



}