package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_client_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_parent_client_choice);

    }

    public void startSitter(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        startActivity(intent);
    }

    public void startParent(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }
}