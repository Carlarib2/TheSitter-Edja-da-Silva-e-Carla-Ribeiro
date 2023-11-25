package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_my_sitters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epb_parent_my_sitters);
    }

    public void startSave5(View view){
        Intent intent = new Intent(this, parent_booking_1.class);
        startActivity(intent);
    }

    public void startMessagesP4(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void startRequestsP2(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startHomeP2(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startProfile(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }
}