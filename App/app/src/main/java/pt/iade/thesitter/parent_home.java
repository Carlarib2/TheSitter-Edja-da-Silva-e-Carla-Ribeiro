package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ep_parent_home);

        setupComponents();
    }

    public void startBooking(View view){
        Intent intent = new Intent(this, parent_booking_1.class);
        startActivity(intent);
    }

    public void startMessagesP(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void startProfileP(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }

    public void startRequests8(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startHome8(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startMessagesP1(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void setupComponents() {

    }
}