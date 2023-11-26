package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sitter_pending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esh_pending);
    }

    public void startHomeSP(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startRequestsSP(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessagesSP(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfileSP(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }

    public void startYesSP(View view){
        Intent intent = new Intent(this, sitter_accepted.class);
        startActivity(intent);
    }

    public void startNoSP(View view){
        Intent intent = new Intent(this, sitter_declined.class);
        startActivity(intent);
    }
}