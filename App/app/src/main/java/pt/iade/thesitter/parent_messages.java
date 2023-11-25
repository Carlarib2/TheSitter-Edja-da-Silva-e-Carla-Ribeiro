package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epd_parent_messages);
    }

    public void startHomeP(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startMessagesP3(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void startRequestsP(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startProfileP2(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }
}