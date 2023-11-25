package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_requests extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epe_parent_requests);
    }

    public void startHome9(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startRequests9(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startMessages10(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile8(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }
}