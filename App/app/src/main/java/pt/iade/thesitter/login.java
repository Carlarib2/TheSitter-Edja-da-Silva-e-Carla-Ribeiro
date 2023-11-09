package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void startRegister3(View view){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void startLogin2(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }
}