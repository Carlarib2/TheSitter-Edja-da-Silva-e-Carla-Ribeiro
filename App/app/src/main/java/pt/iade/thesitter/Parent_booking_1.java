package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Parent_booking_1 extends AppCompatActivity {
    EditText addressBooking, notesBooking;
    Button sendMySitters, selectSitters;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epa_parent_booking_1);

        setupComponents();
    }

    private void setupComponents() {
        addressBooking = (EditText) findViewById(R.id.address_editText_epa);
        notesBooking = (EditText) findViewById(R.id.notes_editText_epa);
        sendMySitters = (Button) findViewById(R.id.send_button_epa);
        selectSitters = (Button) findViewById(R.id.select_button_epa);

        sendMySitters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(addressBooking.getText())){
                    addressBooking.setError("Address is Required");
                    Toast.makeText(getApplicationContext(), "Address is Required", Toast.LENGTH_LONG).show();
                }
            }
        });

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
        Intent intent = new Intent(this, Parent_my_family.Parent_my_sitters.class);
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