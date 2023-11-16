package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_settings);
    }


    public void startHome4(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startMessages5(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startRequests5(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }
}