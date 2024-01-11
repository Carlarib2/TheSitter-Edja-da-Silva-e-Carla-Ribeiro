package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyCallback;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.User;

public class Parent_home extends AppCompatActivity {
    TextView nameTextView, bDateTextView, genderTextView, mobileTextView, addressTextView;
    Client client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ep_parent_home);

        Intent intent = getIntent();
        client = (Client) intent.getSerializableExtra("client");

        setupComponents();
    }

    public void startBooking(View view){
        Intent intent = new Intent(this, Parent_booking_1.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }


    public void startProfileP(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequests8(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startHome8(View view){
        Intent intent = new Intent(this, Parent_home.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }


    public void setupComponents() {
        nameTextView = (TextView) findViewById(R.id.name_textView_ep);
        bDateTextView = (TextView) findViewById(R.id.birthday_textView_ep);
        genderTextView = (TextView) findViewById(R.id.gender_textView_ep);
        mobileTextView = (TextView) findViewById(R.id.mobile_textView_ep);
        addressTextView = (TextView) findViewById(R.id.address_textView_ep);

        populateViews();
    }

    private void populateViews() {
        nameTextView.setText(client.getUser().getUserName());
        bDateTextView.setText(client.getUser().getUserBdate().toString());
        genderTextView.setText(client.getUser().getUserGender());
        mobileTextView.setText(client.getUser().getUserMobile());
        addressTextView.setText(client.getUser().getUserAddress());
    }
}