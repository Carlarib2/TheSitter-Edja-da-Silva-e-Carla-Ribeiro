package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Requests_view extends AppCompatActivity {
    protected Switch request3OnSwitch;
    protected Switch request4OnSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esa_requests_view);

        request3OnSwitch = (Switch) findViewById(R.id.requests_switch3_esa);
        request3OnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                }
            }
        });


            request4OnSwitch = (Switch) findViewById(R.id.requests_switch4_esa);
            request4OnSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        Toast.makeText(getApplicationContext(), "ON", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "OFF", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    public void startHomeS(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        startActivity(intent);
    }

    public void startRequestsS(View view){
        Intent intent = new Intent(this, Requests_view.class);
        startActivity(intent);
    }

    public void startMessagesS(View view){
        Intent intent = new Intent(this, Messages.class);
        startActivity(intent);
    }

    public void startProfileS(View view){
        Intent intent = new Intent(this, profile_settings.Profile_settings.class);
        startActivity(intent);
    }

    /*public void startPending(View view){
        Intent intent = new Intent(this, sitter_pending.class);
        startActivity(intent);
    }*/
}