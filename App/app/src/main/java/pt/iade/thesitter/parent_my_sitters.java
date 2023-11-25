package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_my_sitters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_my_sitters);
    }

    public void startSave5(View view){
        Intent intent = new Intent(this, parent_booking_1.class);
        startActivity(intent);
    }
}