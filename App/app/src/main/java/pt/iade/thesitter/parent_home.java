package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_home);
    }

    public void startBooking(View view){
        Intent intent = new Intent(this, parent_booking_1.class);
        startActivity(intent);
    }

    public void startMessages9(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile7(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }

    public void startRequests8(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }
}