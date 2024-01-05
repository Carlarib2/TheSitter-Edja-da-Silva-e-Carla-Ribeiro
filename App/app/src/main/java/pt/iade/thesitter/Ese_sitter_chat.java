package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Ese_sitter_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ese_chat);
    }

    public void startHomeS2(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        startActivity(intent);
    }

    public void startRequestsS2(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }

    public void startMessagesS2(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

    public void startProfileS2(View view){
        Intent intent = new Intent(this, profile_settings.Profile_settings.class);
        startActivity(intent);
    }
}