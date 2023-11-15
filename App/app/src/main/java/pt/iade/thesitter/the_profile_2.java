package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class the_profile_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_profile2);
    }

    public void startHome(View view){
        Intent intent = new Intent(this, the_profile_2.class);
        startActivity(intent);
    }

    public void startMessages2(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }
}