package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_register);
    }
    public void startRegister2(View view){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
        setupComponents();
    }

    private void setupComponents() {
    }
}