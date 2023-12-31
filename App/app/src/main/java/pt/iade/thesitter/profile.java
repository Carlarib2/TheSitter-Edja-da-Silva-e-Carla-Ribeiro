package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pt.iade.thesitter.models.User;

public class profile extends AppCompatActivity {

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_profile);

        Intent intent = getIntent();
        user = (User) intent.getSerializableExtra("user");

        setupComponents();
    }

    public void startSave(View view){
        Intent intent = new Intent(this, profile_verification.class);
        startActivity(intent);
    }

    private void setupComponents() {

    }

    public void commitViews() {
        //user.setEd
    }
}