package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_login);
    }

    public void startRegister4(View view){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void startLogin3(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }
}