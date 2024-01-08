package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;

import java.lang.reflect.Array;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import pt.iade.thesitter.utilities.DateJsonAdapter;
import pt.iade.thesitter.utilities.WebRequest;

public class FamilyMember {



    private int faId;

    private String faName;
    @JsonAdapter(DateJsonAdapter.class)
    private LocalDate faBdate;

    private String faSchool;

    private String faAllergies;

    private String faAboutMe;

    private String faGender;

    private int faCliId;

    private int faCreId;


    public FamilyMember(){

    }

    public FamilyMember(int faId, String faName, LocalDate faBdate, String faSchool, String faAllergies, String faAboutMe, String faGender, int faCliId, int faCreId) {
        this.faId = faId;
        this.faName = faName;
        this.faBdate = faBdate;
        this.faSchool = faSchool;
        this.faAllergies = faAllergies;
        this.faAboutMe = faAboutMe;
        this.faGender = faGender;
        this.faCliId = faCliId;
        this.faCreId = faCreId;
    }

    public static void GetAllByParentId(int cliId ,GetAllByParentIdResponse response){
        ArrayList<FamilyMember> familyMembers= new ArrayList<FamilyMember>();
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    WebRequest request= new WebRequest(new URL(WebRequest.LOCALHOST + "/api/familyMembers/idCli/" + cliId));

                    String resp= request.performGetRequest();
                    JsonArray array= new Gson().fromJson(resp, JsonArray.class);

                    for (JsonElement element: array){
                        familyMembers.add(new Gson().fromJson(element, FamilyMember.class));
                    }

                    response.response(familyMembers);

                }catch (Exception e ){
                    Log.e("FamilyMember.GetAllByParentId", e.toString() );
                }

            }
        });
        thread.start();

    }

    public int getFaId() {
        return faId;
    }

    public String getFaName() {
        return faName;
    }

    public LocalDate getFaBdate() {
        return faBdate;
    }

    public String getFaSchool() {
        return faSchool;
    }

    public String getFaAllergies() {
        return faAllergies;
    }

    public String getFaAboutMe() {
        return faAboutMe;
    }

    public String getFaGender() {
        return faGender;
    }

    public int getFaCliId() {
        return faCliId;
    }

    public int getFaCreId() {
        return faCreId;
    }

    public void setFaName(String faName) {
        this.faName = faName;
    }

    public void setFaBdate(LocalDate faBdate) {
        this.faBdate = faBdate;
    }

    public void setFaSchool(String faSchool) {
        this.faSchool = faSchool;
    }

    public void setFaAllergies(String faAllergies) {
        this.faAllergies = faAllergies;
    }

    public void setFaAboutMe(String faAboutMe) {
        this.faAboutMe = faAboutMe;
    }

    public void setFaGender(String faGender) {
        this.faGender = faGender;
    }

    public void setFaCliId(int faCliId) {
        this.faCliId = faCliId;
    }

    public void setFaCreId(int faCreId) {
        this.faCreId = faCreId;
    }



    public interface GetAllByParentIdResponse{
        public void response(ArrayList<FamilyMember> familyMembers);
    }
}
