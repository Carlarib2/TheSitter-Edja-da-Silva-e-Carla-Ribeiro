package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class My_experience extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ese_my_experience);
    }

    public void startSaveS2(View view){
        Intent intent = new Intent(this, Profile_settings.class);
        startActivity(intent);
    }
}