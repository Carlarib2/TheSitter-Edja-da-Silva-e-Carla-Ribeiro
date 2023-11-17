package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile_settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_settings);
    }

    public void startHome2(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startMessages4(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile3(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }

    public void startRequests3(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startCalendar(View view){
        Intent intent = new Intent(this, calendar.class);
        startActivity(intent);
    }

    public void startRate(View view){
        Intent intent = new Intent(this, my_rate.class);
        startActivity(intent);
    }
}