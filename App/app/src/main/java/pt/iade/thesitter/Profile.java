package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.chrono.IsoChronology;

import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class Profile extends AppCompatActivity {
    EditText educationEditText, experienceEditText, aboutMeEditText;
    Button saveButton;
    Sitter sitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_profile);

        Intent intent = getIntent();
        sitter = (Sitter) intent.getSerializableExtra("sitter");

        setupComponents();
    }

  public void startSave(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        startActivity(intent);
    }

    private void setupComponents() {
        educationEditText = (EditText) findViewById(R.id.education_editText_da);
        experienceEditText = (EditText) findViewById(R.id.experience_editText_da);
        aboutMeEditText = (EditText) findViewById(R.id.about_editText_da);
        saveButton = (Button) findViewById(R.id.save_button_da);

      /*  saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(educationEditText.getText())){
                    educationEditText.setError("Education is Required");
                    Toast.makeText(getApplicationContext(), "Education is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(experienceEditText.getText())){
                    experienceEditText.setError("Email is Required");
                    Toast.makeText(getApplicationContext(), "Email is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty((aboutMeEditText.getText()))){
                    aboutMeEditText.setError("Password is Required");
                    Toast.makeText(getApplicationContext(), "Password is Required", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commitViews();
                sitter.register(new Sitter.RegisterResponse() {
                    @Override
                    public void response() {
                        Intent intent = new Intent(Profile.this, The_profile_1.class);
                        intent.putExtra("sitter", sitter);

                        startActivity(intent);
                    }
                });

            }
        });
    }

    public void commitViews() {
        sitter.setSitEducation(educationEditText.getText().toString());
        sitter.setSitExperience(experienceEditText.getText().toString());
        sitter.setSitAboutMe(aboutMeEditText.getText().toString());
    }
}