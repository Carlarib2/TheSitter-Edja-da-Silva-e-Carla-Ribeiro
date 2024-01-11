package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pt.iade.thesitter.models.Client;

public class Parent_requests extends AppCompatActivity {

    Client client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epe_parent_requests);

        Intent intent = getIntent();
        client = (Client) intent.getSerializableExtra("client");
    }

    public void startHome9(View view){
        Intent intent = new Intent(this, Parent_home.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequests9(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startProfile8(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }
}