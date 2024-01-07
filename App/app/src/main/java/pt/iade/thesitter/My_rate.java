package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class My_rate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esd_my_rate);
    }

    public void startHome6(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        startActivity(intent);
    }

    public void startRequests6(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }

    /*public void startMessages7(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }*/

    public void startProfile5(View view){
        Intent intent = new Intent(this, Profile_settings.class);
        startActivity(intent);
    }

    public void startSaveS(View view){
        Intent intent = new Intent(this, Profile_settings.class);
        startActivity(intent);
    }
}