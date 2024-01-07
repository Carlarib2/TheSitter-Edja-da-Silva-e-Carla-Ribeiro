package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Parent_create_family_profile extends AppCompatActivity {
    EditText nameFamily, allergiesFamily;
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

        saveFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(nameFamily.getText())){
                    nameFamily.setError("Name is Required");
                    return;
                }
                if (TextUtils.isEmpty(allergiesFamily.getText())){
                    allergiesFamily.setError("If No Allergies enter 'N/A'");
                }
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