package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.time.LocalDate;

import pt.iade.thesitter.models.Booking;
import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.User;

public class Parent_booking_1 extends AppCompatActivity {
    EditText addressBooking, dateTextView, moreTextView;
    Spinner startDateSpinner, endDateSpinner;
    Button sendMySitters, selectSitters;
    User user;
    Client client;
    Booking booking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epa_parent_booking_1);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");
        client = (Client) intent.getSerializableExtra("client");
        booking = (Booking) intent.getSerializableExtra("booking");

        setupComponents();
    }

    private void setupComponents() {
        addressBooking = (EditText) findViewById(R.id.address_editText_epa);
        dateTextView = (EditText) findViewById(R.id.date_editText_epa);
        moreTextView = (EditText) findViewById(R.id.more_editText_epa);
        startDateSpinner = (Spinner) findViewById(R.id.spinner_start_date);
        endDateSpinner = (Spinner) findViewById(R.id.spinner_end_date);
        sendMySitters = (Button) findViewById(R.id.send_button_epa);
        selectSitters = (Button) findViewById(R.id.select_button_epa);

        selectSitters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                booking = new Booking();
                commitViews();

                Intent intent = new Intent(Parent_booking_1.this, Parent_selectSitters.class);
                intent.putExtra("user", user);
                intent.putExtra("client", client);
                intent.putExtra("booking", booking);

                startActivity(intent);
            }
        });

        sendMySitters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(addressBooking.getText())){
                    addressBooking.setError("Address is Required");
                }
            }
        });

        if (booking != null){
            populateViews();
        }

    }

    private void populateViews() {
        addressBooking.setText(booking.getBooAddress());
        dateTextView.setText(booking.getBooDate().toString());
        moreTextView.setText(booking.getBooMore());
    }

    private void commitViews() {
        booking.setBooAddress(addressBooking.getText().toString());
        booking.setBooDate(LocalDate.now());
        booking.setBooMore(moreTextView.getText().toString());
        booking.setBooStartTime(startDateSpinner.getSelectedItem().toString());
        booking.setBooEndTime(endDateSpinner.getSelectedItem().toString());
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

    public void startProfile9(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }
}