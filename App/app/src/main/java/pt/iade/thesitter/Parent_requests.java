package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_requests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epe_parent_requests);
    }

    public void startHome9(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequests9(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesP7(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }

    public void startProfile8(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }
}