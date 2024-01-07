package pt.iade.thesitter;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pt.iade.thesitter.adapters.MyFamilyAdapter;

public class Parent_my_family extends AppCompatActivity {
    protected RecyclerView my_Family;
    MyFamilyAdapter myFamilyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epg_parent_my_family);

        setUpComponent();

        RecyclerView myFamily = findViewById(R.id.recyclerView_myFamily);

    }

    private void setUpComponent() {
        my_Family=(RecyclerView) findViewById(R.id.recyclerView_myFamily);
        my_Family.setLayoutManager(new LinearLayoutManager(this));
    }

    public void startHome7(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequests7(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startMessages8(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }

    public void startProfile6(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startAdd(View view){
        Intent intent = new Intent(this, Parent_create_family_profile.class);
        startActivity(intent);
    }

    public void startSave3(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    /*Não sei como isso aconteceu (deve ter sido de sexta), mas o java class do my sitters está aqui também.*/

    public static class Parent_my_sitters extends AppCompatActivity {
        String name, gender, mobile;
        int image;
        protected RecyclerView mySitters;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_epb_parent_my_sitters);

            setupComponents();
        }

        private void setupComponents(){
            mySitters=(RecyclerView) findViewById(R.id.my_sitters_recyclerView2_epb);
            mySitters.setLayoutManager(new LinearLayoutManager(this));
        }

        public void startSave5(View view){
            Intent intent = new Intent(this, Parent_booking_1.class);
            startActivity(intent);
        }

        public void startMessagesP4(View view){
            Intent intent = new Intent(this, Parent_messages.class);
            startActivity(intent);
        }

        public void startRequestsP2(View view){
            Intent intent = new Intent(this, Parent_requests.class);
            startActivity(intent);
        }

        public void startHomeP2(View view){
            Intent intent = new Intent(this, Parent_home.class);
            startActivity(intent);
        }

        public void startProfile(View view){
            Intent intent = new Intent(this, Parent_settings.class);
            startActivity(intent);
        }
    }
}