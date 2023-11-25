package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_client_choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_parent_client_choice);

    }

    public void startSitter(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startParent(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }
}