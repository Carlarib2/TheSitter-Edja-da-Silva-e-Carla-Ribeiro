package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class the_profile_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_the_profile1);
    }

    public void startRequests(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessages(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startMessages3(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile2(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }

    public void startRequests2(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }
}