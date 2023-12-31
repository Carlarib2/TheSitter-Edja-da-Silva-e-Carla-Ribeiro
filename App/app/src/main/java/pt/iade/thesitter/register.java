package pt.iade.thesitter;
import static pt.iade.thesitter.models.User.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import pt.iade.thesitter.models.User;

public class register extends AppCompatActivity {
    protected Button register;
            //register_button_d;
    EditText username;
        //user_editTex_d;
    EditText email;
                //mail_editText_d;
    EditText password;
        //pass_editText_d;
    EditText confirmPass;
                //confirm_editText_d
    Switch confirmSitter;

    //sitter_switch_d


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
                String userPassword=password.getText().toString();
                String userEmail=email.getText().toString();
                String userConfirmPass=confirmPass.getText().toString();
                int sitterConfirm=confirmSitter.getSwitchPadding();

                if(confirmSitter!=null) {
                    User newUser = new User();
                    newUser.setUserName(userName);
                    newUser.setUserEmail(userEmail);
                    newUser.setUserPassword(userPassword);


                    Intent intent = new Intent(register.this, profile.class);
                    intent.putExtra("user", newUser);
                    startActivity(intent);
                } else {

                    Intent intent = new Intent(register.this, parent_home.class);
                    startActivity(intent);


                }
            }

        });
    }
}