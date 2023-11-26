package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class requests_view extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esa_requests_view);
    }

    public void startHomeS(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startRequestsS(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessagesS(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfileS(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }
}