package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.CompoundButton;
import android.widget.Switch;

<<<<<<< HEAD:App/app/src/main/java/pt/iade/thesitter/profile_settings.java
public class profile_settings extends AppCompatActivity {
    protected Switch profileOnSwitch;
=======
public class Profile_settings extends AppCompatActivity {
>>>>>>> 8467f4a31a5034772b925135adefb93a5c7317f5:App/app/src/main/java/pt/iade/thesitter/Profile_settings.java
=======

public class Profile_settings extends AppCompatActivity {
>>>>>>> 8467f4a31a5034772b925135adefb93a5c7317f5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esc_profile_settings);
<<<<<<< HEAD

        profileOnSwitch = (Switch) findViewById(R.id.profile_switch_epf);
        profileOnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // TODO: Fazer coisa que profile esta on.
                } else {
                    // TODO: Fazer contratio
                }
            }
        });
=======
>>>>>>> 8467f4a31a5034772b925135adefb93a5c7317f5
    }

    public void startHome2(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        startActivity(intent);
    }

    public void startMessages4(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

    public void startProfile3(View view){
        Intent intent = new Intent(this, Profile_settings.class);
        startActivity(intent);
    }

    public void startRequests3(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }

    public void startCalendar(View view){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void startRate(View view){
        Intent intent = new Intent(this, My_rate.class);
        startActivity(intent);
    }

    public void startExperience(View view){
        Intent intent = new Intent(this, My_experience.class);
        startActivity(intent);
    }

    public void startLogout(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}