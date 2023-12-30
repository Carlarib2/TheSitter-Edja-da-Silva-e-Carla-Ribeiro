package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import pt.iade.thesitter.models.User;

public class login extends AppCompatActivity {
    protected Button login_button_c;
    protected Button sae_button_epb;
    EditText username_editView;
    EditText password_editView;
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
                            Intent intent = new Intent(login.this, the_profile_1.class);
                            intent.putExtra("user", returnedUser);
                            startActivity(intent);
                        }
                    }
                });
            }
        });
    }

    /*public void startRegister3(View view){
        Intent intent = new Intent(this, register.class);
       // intent.putExtra()
        startActivity(intent);
    }*/



    public void startLogin2(View view){
        String username = username_editView.getText().toString();
        String password = username_editView.getText().toString();

        Intent intent = new Intent(this, parent_home.class);
        //ToDo: distinguir o sitter do parent
       //User user = new User("", 1, 1,"","","","","",null,null);
      // intent.putExtra("user", new User());
        startActivity(intent);

    }

    /*public void startLogin2(View view){
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

     */

}