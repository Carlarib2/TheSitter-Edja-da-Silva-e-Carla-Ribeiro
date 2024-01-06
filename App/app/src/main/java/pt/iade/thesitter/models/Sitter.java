package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;

import java.io.Serializable;
import java.net.URL;
import java.util.HashMap;

import pt.iade.thesitter.utilities.WebRequest;

public class Sitter implements Serializable {
    private int sitId;
    private int sitUserId;
    private String sitExperience;
    private String sitEducation;
    private String sitAboutMe;
    private int sitReliability;

    private int sitResponseTime;

    private int sitResponseRate;

    public Sitter(){

    }

    public Sitter(int sitId, int sitUserId, String sitExperience, String sitEducation, String sitAboutMe, int sitBooId, int sitReliability, int sitResponseTime, int sitResponseRate) {
        this.sitId = sitId;
        this.sitUserId = sitUserId;
        this.sitExperience = sitExperience;
        this.sitEducation = sitEducation;
        this.sitAboutMe = sitAboutMe;
        this.sitReliability = sitReliability;
        this.sitResponseTime = sitResponseTime;
        this.sitResponseRate = sitResponseRate;
    }

    public void register(User user, RegisterResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                user.register(new User.RegisterResponse() {
                    @Override
                    public void response() {
                        sitUserId = user.getUserId();
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
            }
        });
        thread.start();
    }

    public static void GetByUserId(int userId, GetByUserIdResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/sitters/user/"+userId));
                    String resp = request.performGetRequest();

                    Sitter sitter = new Gson().fromJson(resp, Sitter.class);

                    response.response(sitter);

                } catch (Exception e){
                    Log.e("Sitter.GetByUserId", e.toString());
                }
            }
        });
        thread.start();
    }

    public int getSitId() {return sitId;}

    public int getSitUserId() {return sitUserId;}

    public String getSitExperience() {return sitExperience;}

    public String getSitEducation() {return sitEducation;}

    public String getSitAboutMe() {return sitAboutMe;}



    public int getSitReliability() {
        return sitReliability;
    }

    public int getSitResponseTime() {
        return sitResponseTime;
    }

    public int getSitResponseRate() {
        return sitResponseRate;
    }

    public void setSitUserId(int sitUserId) {
        this.sitUserId = sitUserId;
    }

    public void setSitExperience(String sitExperience) {
        this.sitExperience = sitExperience;
    }

    public void setSitEducation(String sitEducation) {
        this.sitEducation = sitEducation;
    }

    public void setSitAboutMe(String sitAboutMe) {
        this.sitAboutMe = sitAboutMe;
    }


    public void setSitReliability(int sitReliability) {
        this.sitReliability = sitReliability;
    }

    public void setSitResponseTime(int sitResponseTime) {
        this.sitResponseTime = sitResponseTime;
    }

    public void setSitResponseRate(int sitResponseRate) {
        this.sitResponseRate = sitResponseRate;
    }


    public interface RegisterResponse{
        public void response();
    }

    public interface GetByUserIdResponse{
        public void response(Sitter returnedSitter);
    }
}
