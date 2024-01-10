package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class The_profile_1 extends AppCompatActivity {
    protected Switch theProfile1;
    protected Switch theProfile2;
    TextView name_textView;
    User user;
    Sitter sitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_es_the_profile1);

        theProfile1 = (Switch) findViewById(R.id.profile_switch1_es);
        theProfile1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Available", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Unavailable", Toast.LENGTH_SHORT).show();
                }
            }
        });

        theProfile2 = (Switch) findViewById(R.id.profile_switch2_es);
        theProfile2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");
        sitter = (Sitter) intent.getSerializableExtra("sitter");

        setupComponents();
    }

   /* public void startRequests(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }*/

    public void startProfile(View view){
        Intent intent = new Intent(this, Profile_settings.class);
        intent.putExtra("user", user);
        intent.putExtra("sitter", sitter);
        startActivity(intent);
    }

    public void startRequests2(View view){
        Intent intent = new Intent(this, Requests_view.class);
        intent.putExtra("user", user);
        intent.putExtra("sitter", sitter);
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