package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_selectSitters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epc_parent_select_sitters);
    }

    public void startHomeP3(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startRequestsP3(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesP5(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void startProfileP3(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }

    public void startSendP(View view){
        Intent intent = new Intent(this, parent_pending.class);
        startActivity(intent);
    }
}