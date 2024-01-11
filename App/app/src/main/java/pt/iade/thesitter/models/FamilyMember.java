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

import pt.iade.thesitter.utilities.DateJsonAdapter;
import pt.iade.thesitter.utilities.WebRequest;

public class FamilyMember implements Serializable {
    private int faId;
    private String faName;
    @JsonAdapter(DateJsonAdapter.class)
    private LocalDate faBdate;
    private String faSchool;
    private String faAllergies;
    private String faAboutMe;
    private String faGender;
    private Client client;


    public FamilyMember(){
        this(0, "", LocalDate.now(), "", "", "", "", null);
    }

    public FamilyMember(int faId, String faName, LocalDate faBdate, String faSchool,
                        String faAllergies, String faAboutMe, String faGender, Client client ) {
        this.faId = faId;
        this.faName = faName;
        this.faBdate = faBdate;
        this.faSchool = faSchool;
        this.faAllergies = faAllergies;
        this.faAboutMe = faAboutMe;
        this.faGender = faGender;
        this.client = client;
    }



    public void create (CreateResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+ "/api/familyMembers"));
                    String resp = request.performPostRequest(FamilyMember.this);

                    FamilyMember familyMember = new Gson().fromJson(resp, FamilyMember.class);

                    faId = familyMember.getFaId();
                    response.response();

                } catch (Exception e){
                    Log.e("FamilyMember.create", e.toString());
                }
            }
        });
        thread.start();
    }


    public int getFaId() {
        return faId;
    }

    public void setFaId(int faId) {
        this.faId = faId;
    }

    public String getFaName() {
        return faName;
    }

    public void setFaName(String faName) {
        this.faName = faName;
    }

    public LocalDate getFaBdate() {
        return faBdate;
    }

    public void setFaBdate(LocalDate faBdate) {
        this.faBdate = faBdate;
    }

    public String getFaSchool() {
        return faSchool;
    }

    public void setFaSchool(String faSchool) {
        this.faSchool = faSchool;
    }

    public String getFaAllergies() {
        return faAllergies;
    }

    public void setFaAllergies(String faAllergies) {
        this.faAllergies = faAllergies;
    }

    public String getFaAboutMe() {
        return faAboutMe;
    }

    public void setFaAboutMe(String faAboutMe) {
        this.faAboutMe = faAboutMe;
    }

    public String getFaGender() {
        return faGender;
    }

    public void setFaGender(String faGender) {
        this.faGender = faGender;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public interface GetAllByParentIdResponse{
        public void response(ArrayList<FamilyMember> familyMembers);
    }

    public interface CreateResponse{
        public void response();
    }
}
