package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

import pt.iade.thesitter.utilities.WebRequest;

public class Sitter implements Serializable {
    private int sitId;
    private User user;
    private String sitExperience;
    private String sitEducation;
    private String sitAboutMe;
    private int sitReliability;

    private int sitResponseTime;

    private int sitResponseRate;

    private ArrayList<Booking> bookings;

    public Sitter(){
        this(0, null, "", "", "", 0,0,0, new ArrayList<Booking>());
    }

    public Sitter(int sitId, User user, String sitExperience, String sitEducation, String sitAboutMe,
                  int sitReliability, int sitResponseTime, int sitResponseRate, ArrayList<Booking> bookings) {
        this.sitId = sitId;
        this.user = user;
        this.sitExperience = sitExperience;
        this.sitEducation = sitEducation;
        this.sitAboutMe = sitAboutMe;
        this.sitReliability = sitReliability;
        this.sitResponseTime = sitResponseTime;
        this.sitResponseRate = sitResponseRate;
        this.bookings = bookings;
    }


    public static void GetSitters(GetSittersResponse response) {
        ArrayList<Sitter> sitters = new ArrayList<Sitter>();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/sitters/all"));
                    String resp = request.performGetRequest();

                    JsonArray array = new Gson().fromJson(resp, JsonArray.class);


                    for (JsonElement element : array) {
                        sitters.add(new Gson().fromJson(element, Sitter.class));
                    }

                    response.response(sitters);

                } catch (Exception e) {
                    Log.e("Sitter.GetSitters", e.toString());
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
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/sitters"));

                    HashMap<String, String> params = new HashMap<String, String>();
                    params.put("userPassword", userPassword);
                    params.put("userEmail", userEmail);

                    String resp = request.performGetRequest(params);
                    Sitter sitter = new Gson().fromJson(resp, Sitter.class);

                    response.response(sitter);

                } catch (Exception e){
                    Log.e("Sitter.Login", e.toString());
                }
            }
        });
        thread.start();
    }

    public void register(RegisterResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/sitters"));
                    String resp = request.performPostRequest(Sitter.this);

                    Sitter sitter = new Gson().fromJson(resp, Sitter.class);

                    sitId = sitter.getSitId();
                    response.response();

                } catch (Exception e){
                    Log.e("Sitter.register", e.toString());
                }
            }
        });
        thread.start();
    }


    public int getSitId() {
        return sitId;
    }

    public void setSitId(int sitId) {
        this.sitId = sitId;
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

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }


    public interface GetSittersResponse{
        public void response(ArrayList<Sitter> sitters);
    }

    public interface RegisterResponse{
        public void response();
    }

    public interface LoginResponse{
        public void response(Sitter returnedSitter);
    }
}
