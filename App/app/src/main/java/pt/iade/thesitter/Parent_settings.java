package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.User;

public class Parent_settings extends AppCompatActivity {
    Client client;
    TextView parentTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epf_parent_settings);

        Intent intent= getIntent();
        client=(Client) intent.getSerializableExtra("client");

        setupComponents();
    }

    public void setupComponents(){
        parentTextView=findViewById(R.id.parent_textView_epf);
        populateViews();
    }


    public void populateViews(){
        parentTextView.setText(client.getUser().getUserName());

    }


    public void startHomeP5(View view){
        Intent intent = new Intent(this, Parent_home.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequestsP4(View view){
        Intent intent = new Intent(this, Parent_requests.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startProfileP5(View view){
        Intent intent = new Intent(this, Parent_settings.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startCalendar2(View view){
        Intent intent = new Intent(this, Calendar.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startMyFamily(View view){
        Intent intent = new Intent(this, Parent_my_family.class);
        intent.putExtra("client", client);
        startActivity(intent);

    }

    public void startLogout2(View view) {
        SharedPreferences preferences = getSharedPreferences("TheSitter", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = ((SharedPreferences) preferences).edit();
        editor.clear();
        editor.apply();

        Intent intent = new Intent(this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();

    }

}