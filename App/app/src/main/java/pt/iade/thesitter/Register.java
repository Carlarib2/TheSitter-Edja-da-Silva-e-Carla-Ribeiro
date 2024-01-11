package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.time.LocalDate;

import pt.iade.thesitter.models.Client;
import pt.iade.thesitter.models.Sitter;
import pt.iade.thesitter.models.User;
import pt.iade.thesitter.utilities.WebRequest;

public class Register extends AppCompatActivity {
    protected Button register;
    EditText usernameEditText,  emailEditText, passwordEditText,
            confirmPassEditText, addressEditText, mobileEditText;

    protected Spinner day, month, year, gender;
    protected Switch confirmSitter;

    User newUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_register);

        setupComponents();
    }


    private void setupComponents() {
        mobileEditText=(EditText) findViewById(R.id.mobile_editTex_d);
        register=(Button) findViewById(R.id.register_button_d);
        usernameEditText=(EditText) findViewById(R.id.user_editTex_d);
        emailEditText=(EditText) findViewById(R.id.mail_editText_d);
        passwordEditText=(EditText) findViewById(R.id.pass_editText_d);
        confirmPassEditText=(EditText) findViewById(R.id.confirm_editText_d);
        confirmSitter=(Switch) findViewById(R.id.sitter_switch_d);
        addressEditText=(EditText) findViewById(R.id.address_editTex_d);
        gender=(Spinner) findViewById(R.id.gender_editTex_d);
        day=(Spinner) findViewById(R.id.day_editText_da2);
        month=(Spinner) findViewById(R.id.month_editText_da2);
        year=(Spinner) findViewById(R.id.year_editText_da2);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(usernameEditText.getText())){
                    usernameEditText.setError("Username is Required");
                    Toast.makeText(getApplicationContext(), "Username is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(emailEditText.getText())){
                    emailEditText.setError("Email is Required");
                    Toast.makeText(getApplicationContext(), "Email is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty((passwordEditText.getText()))){
                    passwordEditText.setError("Password is Required");
                    Toast.makeText(getApplicationContext(), "Password is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(confirmPassEditText.getText())){
                    confirmPassEditText.setError("Password is Required");
                    Toast.makeText(getApplicationContext(), "Password is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(addressEditText.getText())){
                    addressEditText.setError("Address is Required");
                    Toast.makeText(getApplicationContext(), "Address is Required", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if (TextUtils.isEmpty(mobileEditText.getText())){
                    mobileEditText.setError("Phone Number is Required");
                    Toast.makeText(getApplicationContext(), "Phone Number is Required", Toast.LENGTH_SHORT).show();
                }

                else {
                    newUser = new User();
                    commitViews();

                    if (confirmSitter.isChecked()) {
                        Sitter sitter = new Sitter();
                        sitter.setUser(newUser);

                        Intent intent = new Intent(Register.this, Profile.class);
                        intent.putExtra("sitter", sitter);

                        startActivity(intent);

                    } else {
                        Client client = new Client();
                        client.setUser(newUser);

                        client.register(new Client.RegisterResponse() {
                            @Override
                            public void response() {
                                Intent intent = new Intent(Register.this, Parent_home.class);
                                intent.putExtra("client", client);

                                startActivity(intent);
                            }
                        });
                    }
                }
            }
        });

    }

    public void commitViews() {

        int dayValue = Integer.parseInt(day.getSelectedItem().toString());
        int monthValue=month.getSelectedItemPosition() + 1;
        int yearValue= Integer.parseInt(year.getSelectedItem().toString());

        LocalDate birtDate = LocalDate.of(yearValue, monthValue, dayValue);

        String password = passwordEditText.getText().toString();
        String confirmPassword = confirmPassEditText.getText().toString();

        if(!password.equals(confirmPassword)){
            Toast.makeText(Register.this, "Passwords are not the same!", Toast.LENGTH_SHORT).show();
            return;

        } else {
            newUser.setUserName(usernameEditText.getText().toString());
            newUser.setUserEmail(emailEditText.getText().toString());
            newUser.setUserPassword(passwordEditText.getText().toString());
            newUser.setUserBdate(birtDate);
            newUser.setUserMobile(mobileEditText.getText().toString());
            newUser.setUserAddress(addressEditText.getText().toString());
            newUser.setUserGender(gender.getSelectedItem().toString());


        }

    }
}