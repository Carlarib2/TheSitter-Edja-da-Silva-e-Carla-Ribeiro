package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void startRegister(View view){
        Intent intent = new Intent(this, parent_client_choice.class);
        startActivity(intent);
    }

    public void startLogin(View view){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}