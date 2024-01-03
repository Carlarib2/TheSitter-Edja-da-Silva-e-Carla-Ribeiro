package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pt.iade.thesitter.models.User;

public class The_profile_1 extends AppCompatActivity {
    TextView name_textView;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_the_profile1);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");

        setupComponents();
    }

    public void startRequests(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }

    public void startMessages(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

    public void startMessages3(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

    public void startProfile2(View view){
        Intent intent = new Intent(this, Profile_settings.class);
        startActivity(intent);
    }

    public void startRequests2(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }

    private void setupComponents() {
        name_textView = (TextView) findViewById(R.id.name_textView_ep);

        populateViews();
    }

    private void populateViews() {
        name_textView.setText(user.getUserName());
    }
}