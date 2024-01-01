package pt.iade.thesitter;
import static pt.iade.thesitter.models.User.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import pt.iade.thesitter.models.User;

public class register extends AppCompatActivity {
    protected Button register;
    EditText username,  email,password, confirmPass ;
    protected Switch confirmSitter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_register);

        setupComponents();
    }


    private void setupComponents() {
        register=(Button) findViewById(R.id.register_button_d);
        username=(EditText) findViewById(R.id.user_editTex_d);
        email=(EditText) findViewById(R.id.mail_editText_d);
        password=(EditText) findViewById(R.id.pass_editText_d);
        confirmPass=(EditText) findViewById(R.id.confirm_editText_d);
        confirmSitter=(Switch) findViewById(R.id.sitter_switch_d);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                String userName = username.getText().toString();
                String userEmail=email.getText().toString();
                String userPassword=password.getText().toString();
                String userConfirmPass=confirmPass.getText().toString();
                boolean isSitter=confirmSitter.isChecked();

                if(!userPassword.equals(userConfirmPass)){
                    Toast.makeText(register.this, "Passwords are not the same!", Toast.LENGTH_SHORT).show();
                    return;
                }



                    User newUser = new User();
                    newUser.setUserName(userName);
                    newUser.setUserEmail(userEmail);
                    newUser.setUserPassword(userPassword);


                    /*Intent intent = new Intent(register.this, profile.class);
                    intent.putExtra("user", newUser);
                    startActivity(intent);


                    Intent intent = new Intent(register.this, parent_home.class);
                    startActivity(intent);*/
                Intent intent;
                if (isSitter) {
                    intent = new Intent(register.this, profile.class);
                } else {
                    intent = new Intent(register.this, parent_home.class);
                }
                intent.putExtra("user", newUser);
                startActivity(intent);


                }
        });
    }
}