package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_booking_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epa_parent_booking_1);
    }

    public void startDate(View view){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
        finish();
    }

    public void startSitter2(View view){
        Intent intent = new Intent(this, Parent_selectSitters.class);
        startActivity(intent);
    }

    public void startSend(View view){
        Intent intent = new Intent(this, Parent_my_sitters.class);
        startActivity(intent);
    }

    public void startHome10(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequests10(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesP2(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }

    public void startProfile9(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }
}