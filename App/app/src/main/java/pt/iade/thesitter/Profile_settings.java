package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.User;

public class Profile_settings extends AppCompatActivity {

    User user;
    Client client;
    TextView sitterTextView;
    protected Switch profileOnSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esc_profile_settings);

        Intent intent = getIntent();
        user= (User)intent.getSerializableExtra("user");
        client=(Client) intent.getSerializableExtra("client");

        setupComponents();
    }
    public void setupComponents(){


        profileOnSwitch = (Switch) findViewById(R.id.profile_switch_epf);
        profileOnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Profile_settings.this, "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });


        populateViews();
    }


    public void populateViews(){
        //profil.setText(user.getUserName());
    }


    public void startHome2(View view) {
        Intent intent = new Intent(this, The_profile_1.class);
        intent.putExtra("user", user);
        intent.putExtra("client", client);
        startActivity(intent);
    }

   /* public void startMessages4(View view) {
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }*/

    public void startProfile3(View view) {
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("user", user);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequests3(View view) {
        Intent intent = new Intent(this, Requests_view.class);
        intent.putExtra("user", user);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startCalendar(View view) {
        Intent intent = new Intent(this, Calendar.class);
        intent.putExtra("user", user);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRate(View view) {
        Intent intent = new Intent(this, My_rate.class);
        intent.putExtra("user", user);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startExperience(View view) {
        Intent intent = new Intent(this, My_experience.class);
        intent.putExtra("user", user);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startLogout(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }


}

