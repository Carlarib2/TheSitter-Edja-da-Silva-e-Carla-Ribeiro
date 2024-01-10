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

import pt.iade.thesitter.models.FamilyMember;

public class Parent_create_family_profile extends AppCompatActivity {
    EditText nameFamily, allergiesFamily;
    TextView createFaNAme , createFaBdate, createFaSchool, createFaAllergies, createFaAbout, createFaGender;
    Button saveFamily;


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
                String name = createFaNAme.getText().toString();
                String birthday = createFaBdate.getText().toString();
                String school = createFaSchool.getText().toString();
                String allergies = createFaAllergies.getText().toString();
                String aboutMe = createFaAbout.getText().toString();
                String gender = createFaGender.getText().toString();

                FamilyMember.Create(name, birthday,school,allergies,aboutMe,gender, new FamilyMember.CreateResponse(){

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
}