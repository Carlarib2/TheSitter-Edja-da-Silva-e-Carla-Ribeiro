package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_my_sitters extends AppCompatActivity {
    String name, gender, mobile;
    int image;
    protected RecyclerView mySitters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epb_parent_my_sitters);
        setupComponents();
    }

    private void setupComponents(){
        mySitters=(RecyclerView) findViewById(R.id.my_sitters_recyclerView2_epb);
        mySitters.setLayoutManager(new LinearLayoutManager(this));
    }

    public void startSave5(View view){
        Intent intent = new Intent(this, Parent_booking_1.class);
        startActivity(intent);
    }

    /*public void startMessagesP4(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void startRequestsP2(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startHomeP2(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startProfile(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }
}