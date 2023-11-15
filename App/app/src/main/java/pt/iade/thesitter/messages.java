package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
    }

    public void startHome3(View view){
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
}