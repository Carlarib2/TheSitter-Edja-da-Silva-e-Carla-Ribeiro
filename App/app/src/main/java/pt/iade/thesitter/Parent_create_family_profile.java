package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_create_family_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eph_parent_create_family_profile);
    }

    public void startHomeP6(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequestsP5(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesP8(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }

    public void startProfileP6(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startSaveP(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }
}