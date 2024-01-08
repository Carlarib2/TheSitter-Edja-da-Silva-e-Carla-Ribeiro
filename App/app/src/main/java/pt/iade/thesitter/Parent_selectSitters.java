package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

import pt.iade.thesitter.adapters.SelectSitterRowAdapter;
import pt.iade.thesitter.enums.BookingStatus;
import pt.iade.thesitter.models.Booking;
import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class Parent_selectSitters extends AppCompatActivity {
    ArrayList<User> sitUserList;
    ArrayList<Sitter> sittersList;
    RecyclerView listView;
    SelectSitterRowAdapter selectSitterRowAdapter;

    Button saveButton;

    int sitPosition = -1;

    User user;
    Client client;
    Booking booking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epc_parent_select_sitters);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");
        client = (Client) intent.getSerializableExtra("client");
        booking = (Booking) intent.getSerializableExtra("booking");

        setUpComponents();
    }



    public void startHomeP3(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequestsP3(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    /*public void startMessagesP5(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void startProfileP3(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startSendP(View view){
        finish();
    }

    private void setUpComponents() {
        saveButton = (Button) findViewById(R.id.save_button_epc);

        listView = (RecyclerView) findViewById(R.id.parent_sitters_list);
        listView.setLayoutManager(new LinearLayoutManager(Parent_selectSitters.this));

        Sitter.GetSitters(new Sitter.GetSittersResponse() {
            @Override
            public void response(ArrayList<User> users, ArrayList<Sitter> sitters) {
                sitUserList = users;
                sittersList = sitters;

                selectSitterRowAdapter = new SelectSitterRowAdapter(sitUserList, Parent_selectSitters.this);
                selectSitterRowAdapter.setOnClickListener(new SelectSitterRowAdapter.ItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        RadioButton selectedButton = view.findViewById(R.id.select_sitter_selected);
                        selectedButton.setChecked(!selectedButton.isChecked());

                        if (selectedButton.isChecked()){
                            sitPosition=position;
                        }
                    }
                });

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        listView.setAdapter(selectSitterRowAdapter);
                    }
                });
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                booking.setBooSitId(sittersList.get(sitPosition).getSitId());
                Intent returnIntent = new Intent();
                returnIntent.putExtra("booking", booking);
                setResult(AppCompatActivity.RESULT_OK, returnIntent);

                finish();
            }
        });


    }
}