package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.FamilyMember;
import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class Parent_create_family_profile extends AppCompatActivity {
    EditText nameFamily, allergiesFamily;
    TextView createFaNAme , createFaBdate, createFaSchool, createFaAllergies, createFaAbout, createFaGender;
    Button saveFamily;

    FamilyMember newFamilyMember;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eph_parent_create_family_profile);

        setupComponents();
    }

    private void setupComponents() {
        nameFamily = (EditText) findViewById(R.id.name_editTex_eph);
        allergiesFamily = (EditText) findViewById(R.id.allergies_editTex_eph);
        saveFamily = (Button) findViewById(R.id.save_button_eph);
        createFaNAme=(TextView) findViewById(R.id.name_editTex_eph);
        createFaBdate=(TextView) findViewById(R.id.birthady_editTex_eph);
        createFaSchool=(TextView) findViewById(R.id.school_editTex_eph);
        createFaAllergies=(TextView) findViewById(R.id.allergies_editTex_eph);
        createFaAbout=(TextView) findViewById(R.id.notes_editTex_eph);
        createFaGender=(TextView) findViewById(R.id.gender_editTex_eph2);





        saveFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    newFamilyMember = new FamilyMember();
                     commitViews();

                        Client client = new Client();

                            newFamilyMember.create(new FamilyMember.CreateResponse() {
                            @Override
                            public void response() {
                                Intent intent = new Intent(Parent_create_family_profile.this, Parent_my_family.class);
                                intent.putExtra("familyMember", newFamilyMember);


                                startActivity(intent);
                            }
                        });
                    }







            });

    }

    public void startHomeP6(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequestsP5(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    /*public void startMessagesP8(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void startProfileP6(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startSaveP(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void commitViews() {
        newFamilyMember.setFaName(createFaNAme.getText().toString());
        newFamilyMember.setFaBdate(LocalDate.now());
        newFamilyMember.setFaSchool(createFaSchool.getText().toString());
        newFamilyMember.setFaAllergies(createFaAllergies.getText().toString());
        newFamilyMember.setFaAboutMe(createFaAbout.getText().toString());
        newFamilyMember.setFaGender(createFaGender.getText().toString());


    }

}