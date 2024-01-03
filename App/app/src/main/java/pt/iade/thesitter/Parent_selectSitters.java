package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parent_selectSitters extends AppCompatActivity {
    String name, gender, mobile;
    int image;
protected RecyclerView selectSitters;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epc_parent_select_sitters);

        setupComponents();
    }

    private void setupComponents(){
        selectSitters=(RecyclerView) findViewById(R.id.recyclerView_selectSitters);
        selectSitters.setLayoutManager(new LinearLayoutManager(this));

    }

    public void startHomeP3(View view){
        Intent intent = new Intent(this, Parent_home.class);
        startActivity(intent);
    }

    public void startRequestsP3(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesP5(View view){
        Intent intent = new Intent(this, Parent_messages.class);
        startActivity(intent);
    }

    public void startProfileP3(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        startActivity(intent);
    }

    /*public void startSendP(View view){
        Intent intent = new Intent(this, parent_pending.class);
        startActivity(intent);
    }*/
}