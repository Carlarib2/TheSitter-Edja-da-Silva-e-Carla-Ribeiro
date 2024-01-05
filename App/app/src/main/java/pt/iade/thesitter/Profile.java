package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.chrono.IsoChronology;

import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class Profile extends AppCompatActivity {
    EditText educationEditText, experienceEditText, aboutMeEditText;
    Button saveButton;
    User user;
    Sitter sitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_profile);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");
        sitter = (Sitter) intent.getSerializableExtra("sitter");

        setupComponents();
    }

    public void startSave(View view){
        Intent intent = new Intent(this, Profile_verification.class);
        startActivity(intent);
    }

    private void setupComponents() {
        educationEditText = (EditText) findViewById(R.id.education_editText_da);
        experienceEditText = (EditText) findViewById(R.id.experience_editText_da);
        aboutMeEditText = (EditText) findViewById(R.id.about_editText_da);
        saveButton = (Button) findViewById(R.id.save_button_da);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(educationEditText.getText())){
                    educationEditText.setError("Education is Required");
                    return;
                }
                if (TextUtils.isEmpty(experienceEditText.getText())){
                    experienceEditText.setError("Email is Required");
                    return;
                }
                if (TextUtils.isEmpty((aboutMeEditText.getText()))){
                    aboutMeEditText.setError("Password is Required");
                }
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commitViews();
                sitter.register(user, new Sitter.RegisterResponse() {
                    @Override
                    public void response() {
                        Intent intent = new Intent(Profile.this, The_profile_1.class);
                        intent.putExtra("user", user);
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