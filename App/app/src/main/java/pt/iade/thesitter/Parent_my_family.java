package pt.iade.thesitter;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import pt.iade.thesitter.adapters.MyFamilyAdapter;
import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.FamilyMember;
import pt.iade.thesitter.models.User;

public class Parent_my_family extends AppCompatActivity {
    protected ArrayList<FamilyMember> familyMemberList;
    protected RecyclerView my_Family_listView;
    MyFamilyAdapter myFamilyAdapter;
    Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epg_parent_my_family);

        Intent intent= getIntent();
        client=(Client)intent.getSerializableExtra("client");

        setUpComponent();
    }

    private void setUpComponent() {
        my_Family_listView =(RecyclerView) findViewById(R.id.recyclerView_myFamily);
        my_Family_listView.setLayoutManager(new LinearLayoutManager(this));

        familyMemberList = client.getFamilyMembers();

        myFamilyAdapter = new MyFamilyAdapter(familyMemberList, Parent_my_family.this);

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                my_Family_listView.setAdapter(myFamilyAdapter);
            }
        });

    }

    public void startHome7(View view){
        Intent intent = new Intent(this, Parent_home.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequests7(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }


    public void startProfile6(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startAdd(View view){
        Intent intent = new Intent(this, Parent_create_family_profile.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startSave3(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

}