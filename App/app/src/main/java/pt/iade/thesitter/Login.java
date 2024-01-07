package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;

public class Login extends AppCompatActivity {
    protected Button login_button_c, sae_button_epb;
    EditText username_editView, password_editView;
    protected Switch confirmSitter;
    User user;

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

        confirmSitter = (Switch) findViewById(R.id.switch_c);
        confirmSitter=(Switch) findViewById(R.id.switch_c);

        login_button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(username_editView.getText())){
                    username_editView.setError("Username is Required");
                    Toast.makeText(getApplicationContext(), "Username is Required", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password_editView.getText())){
                    password_editView.setError("Email is Required");
                    Toast.makeText(getApplicationContext(), "Email is Required", Toast.LENGTH_LONG).show();
                }
            }
        });

        confirmSitter=(Switch) findViewById(R.id.switch_c);

        login_button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(username_editView.getText())){
                    username_editView.setError("Username is Required");
                    Toast.makeText(getApplicationContext(), "Username is Required", Toast.LENGTH_LONG).show();
                    return;
                }
                if (TextUtils.isEmpty(password_editView.getText())){
                    password_editView.setError("Email is Required");
                    Toast.makeText(getApplicationContext(), "Email is Required", Toast.LENGTH_LONG).show();
                }
            }
        });

        confirmSitter = (Switch) findViewById(R.id.switch_c);


        login_button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = username_editView.getText().toString();
                String password = password_editView.getText().toString();

                if (username.equals("")) {
                    username_editView.setError("Username is Required");
                } else if (password.equals("")) {
                    password_editView.setError("Email is Required");
                } else {
                    User.Login(username, password, new User.LoginResponse() {
                        @Override
                        public void response(User returnedUser) {

                            if (confirmSitter.isChecked()) {
                                Sitter.GetByUserId(returnedUser.getUserId(), new Sitter.GetByUserIdResponse() {
                                    @Override
                                    public void response(Sitter returnedSitter) {
                                        Intent intent = new Intent(Login.this, The_profile_1.class);
                                        intent.putExtra("user", returnedUser);
                                        intent.putExtra("sitter", returnedSitter);
                                        startActivity(intent);
                                    }
                                });


                            } else {
                                Client.GetByUserId(returnedUser.getUserId(), new Client.GetByUserIdResponse() {
                                    @Override
                                    public void response(Client returnedClient) {
                                        Intent intent = new Intent(Login.this, Parent_home.class);
                                        intent.putExtra("user", returnedUser);
                                        intent.putExtra("client", returnedClient);
                                        startActivity(intent);
                                    }
                                });
                            }

                        }

                    });
                }

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

