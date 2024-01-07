package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epf_parent_settings);
    }


    public void startHomeP5(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    /*public void startMessagesP7(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }*/

    public void startRequestsP4(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startProfileP5(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    public void startLogout2(View view){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void startCalendar2(View view){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }

    public void startMyFamily(View view){
        Intent intent = new Intent(this, Parent_my_family.class);
        startActivity(intent);
    }
}