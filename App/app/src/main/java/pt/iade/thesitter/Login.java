package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pt.iade.thesitter.models.User;

public class Login extends AppCompatActivity {
    protected Button login_button_c, sae_button_epb;
    EditText username_editView, password_editView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_login);

        setupComponents();
    }


    private void setupComponents() {
        username_editView = (EditText) findViewById(R.id.user_editText_c);
        password_editView = (EditText) findViewById(R.id.pass_editText_c);
        login_button_c = (Button) findViewById(R.id.login_button_c);

        login_button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_editView.getText().toString();
                String password = password_editView.getText().toString();


                User.Login(username, password, new User.LoginResponse() {
                    @Override
                    public void response(User returnedUser) {
                        if (returnedUser != null) {

                            Intent intent = new Intent(Login.this, The_profile_1.class);
                            intent.putExtra("user", returnedUser);
                            startActivity(intent);
                        }
                    }
                });
            }
        });
    }





    public void startLogin2(View view){
        String username = username_editView.getText().toString();
        String password = username_editView.getText().toString();

        Intent intent = new Intent(this, Parent_home.class);
        //ToDo: distinguir o sitter do parent
       //User user = new User("", 1, 1,"","","","","",null,null);
      // intent.putExtra("user", new User());
        startActivity(intent);

    }



    }

