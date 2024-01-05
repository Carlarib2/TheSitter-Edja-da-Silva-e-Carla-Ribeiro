package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyCallback;
import android.view.View;
import android.widget.TextView;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.User;

public class Parent_home extends AppCompatActivity {
    TextView nameTextView;
    User user;
    Client client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ep_parent_home);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");
        client = (Client) intent.getSerializableExtra("client");

        setupComponents();
    }

    public void startBooking(View view){
        Intent intent = new Intent(this, Parent_booking_1.class);
        startActivity(intent);
    }

   /* public void startMessagesP(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void startProfileP(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startRequests8(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startHome8(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    /*public void startMessagesP1(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void setupComponents() {
        nameTextView = (TextView) findViewById(R.id.name_textView_ep);

        populateViews();
    }

    private void populateViews() {
        nameTextView.setText(user.getUserName());
    }
}