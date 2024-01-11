package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import pt.iade.thesitter.adapters.ParentRequestsAdapter;
import pt.iade.thesitter.adapters.SittersRequestsAdapter;
import pt.iade.thesitter.enums.BookingStatus;
import pt.iade.thesitter.models.Booking;
import pt.iade.thesitter.models.Client;

public class Parent_requests extends AppCompatActivity {
    ArrayList<Booking> bookingList;
    RecyclerView pendingListView, acceptedListView, declinedListView;
    ParentRequestsAdapter pendingRequestsAdapter, acceptedRequestsAdapter, declinedRequestsAdapter;
    ArrayList<Booking> pendingBookings;
    ArrayList<Booking> acceptedBookings;
    ArrayList<Booking> declinedBookings;
    Client client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epe_parent_requests);

        Intent intent = getIntent();
        client = (Client) intent.getSerializableExtra("client");


        setupComponents();
    }

    public void startHome9(View view){
        Intent intent = new Intent(this, Parent_home.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequests9(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startProfile8(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    private void setupComponents() {
        pendingListView = (RecyclerView) findViewById(R.id.recyclerView_parent_pending);
        pendingListView.setLayoutManager(new LinearLayoutManager(Parent_requests.this));

        acceptedListView = (RecyclerView) findViewById(R.id.recyclerView2_parent_accepted);
        acceptedListView.setLayoutManager(new LinearLayoutManager(Parent_requests.this));

        declinedListView = (RecyclerView) findViewById(R.id.recyclerView3_parent_declined);
        declinedListView.setLayoutManager(new LinearLayoutManager(Parent_requests.this));


        pendingBookings = new ArrayList<Booking>();
        acceptedBookings = new ArrayList<Booking>();
        declinedBookings = new ArrayList<Booking>();

        for (Booking b : client.getBookings()){
            if (b.getBooStatus() == BookingStatus.PENDING){
                pendingBookings.add(b);
            }
            else if (b.getBooStatus() == BookingStatus.ACCEPTED){
                acceptedBookings.add(b);
            }
            else {
                declinedBookings.add(b);
            }
        }

        pendingRequestsAdapter = new ParentRequestsAdapter(pendingBookings, Parent_requests.this);
        acceptedRequestsAdapter = new ParentRequestsAdapter(acceptedBookings, Parent_requests.this);
        declinedRequestsAdapter = new ParentRequestsAdapter(declinedBookings, Parent_requests.this);

        pendingListView.setAdapter(pendingRequestsAdapter);
        acceptedListView.setAdapter(acceptedRequestsAdapter);
        declinedListView.setAdapter(declinedRequestsAdapter);

    }
}