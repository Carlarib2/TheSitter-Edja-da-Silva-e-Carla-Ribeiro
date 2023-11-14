package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile_verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_verification);
    }

    public void startCamera(View view){
        Intent intent = new Intent(this, camera_verification.class);
        startActivity(intent);
    }

    public void startDocument(View view){
        Intent intent = new Intent(this, document_upload.class);
        startActivity(intent);
    }

    public void startSave2(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }
}