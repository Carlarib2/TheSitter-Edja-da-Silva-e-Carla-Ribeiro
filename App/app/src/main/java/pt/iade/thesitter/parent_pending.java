package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class parent_pending extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epi_parent_pending);
    }
    
    public void startHomePe(View view){
        Intent intent = new Intent(this, parent_home.class);
        startActivity(intent);
    }

    public void startRequestsPe(View view){
        Intent intent = new Intent(this, parent_requests.class);
        startActivity(intent);
    }

    public void startMessagesPe(View view){
        Intent intent = new Intent(this, parent_messages.class);
        startActivity(intent);
    }

    public void startProfilePe(View view){
        Intent intent = new Intent(this, parent_settings.class);
        startActivity(intent);
    }
}