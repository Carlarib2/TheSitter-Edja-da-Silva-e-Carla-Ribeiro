package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sitter_declined extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esg_declined);
    }

    public void startHomeSD(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startRequestsSD(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessagesSD(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfileSD(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }
}