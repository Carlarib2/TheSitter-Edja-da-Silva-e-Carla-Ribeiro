package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_accepted extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esf_accepted);
    }

    public void startHomeA(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startRequestsA(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesA(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void startProfileA(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }
}