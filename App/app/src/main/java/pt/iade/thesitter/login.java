package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_login);
    }

    public void startRegister3(View view){
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void startLogin2(View view){
        EditText username_editView = (EditText) findViewById(R.id.user_editText_c);
        String username = username_editView.getText().toString();

        EditText password_editView = (EditText) findViewById(R.id.pass_editText_c);
        String password = username_editView.getText().toString();

        if(username.equals("carla@icloud.com")){
            Intent intent = new Intent(this, the_profile_1.class);
            startActivity(intent);
        }
        else if(username.equals("edja@sapo.pt")){
            Intent intent = new Intent(this, parent_home.class);
            startActivity(intent);
        }


    }

}