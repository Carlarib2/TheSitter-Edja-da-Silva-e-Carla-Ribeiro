package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import pt.iade.thesitter.adapters.SelectSittersAdapter;
import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class Parent_selectSitters extends AppCompatActivity {
    ArrayList<User> usersList;
    RecyclerView listView;
    SelectSittersAdapter selectSittersAdapter;
    String name, gender, mobile;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epc_parent_select_sitters);

        setUpComponents();

        RecyclerView recyclerView_selectSitters = findViewById(R.id.recyclerView_selectSitters);
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

    private void setUpComponents() {

    }
}