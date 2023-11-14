package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class the_profile_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_profile1);
    }

    public void startRequests(View view){
        Intent intent = new Intent(this, the_profile_2.class);
        startActivity(intent);
    }
}