package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import java.time.LocalDate;

import pt.iade.thesitter.models.User;

public class Register extends AppCompatActivity {
    protected Button register;
    EditText username,  email, password, confirmPass, address, mobile;

    protected Spinner day, month, year, gender;
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
        address=(EditText) findViewById(R.id.address_editTex_d);
        gender=(Spinner) findViewById(R.id.gender_editTex_d);
        day=(Spinner) findViewById(R.id.day_editText_da2);
        month=(Spinner) findViewById(R.id.month_editText_da2);
        year=(Spinner) findViewById(R.id.year_editText_da2);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                String userName = username.getText().toString();
                String userEmail=email.getText().toString();
                String userPassword=password.getText().toString();
                String userConfirmPass=confirmPass.getText().toString();
                boolean isSitter=confirmSitter.isChecked();
                int dayValue = Integer.parseInt(day.getSelectedItem().toString());
                int monthValue=month.getSelectedItemPosition() + 1;
                int yearValue= Integer.parseInt(year.getSelectedItem().toString());
                LocalDate birtDate = LocalDate.of(yearValue, monthValue, dayValue);
                //String userBdateString = birthDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


                if(!userPassword.equals(userConfirmPass)){
                    Toast.makeText(Register.this, "Passwords are not the same!", Toast.LENGTH_SHORT).show();
                    return;
                }



                User newUser = new User();
                newUser.setUserName(userName);
                newUser.setUserEmail(userEmail);
                newUser.setUserPassword(userPassword);
                newUser.setUserBdate(birtDate);


                    /*Intent intent = new Intent(register.this, profile.class);
                    intent.putExtra("user", newUser);
                    startActivity(intent);


                    Intent intent = new Intent(register.this, parent_home.class);
                    startActivity(intent);*/
                Intent intent;
                if (isSitter) {
                    intent = new Intent(Register.this, Profile.class);
                } else {

                    newUser.save(new User.SaveResponse() {
                        @Override
                        public void response() {

                        }
                    });
                    intent = new Intent(Register.this, Parent_home.class);
                }
                intent.putExtra("user", newUser);
                startActivity(intent);


            }
        });
    }
}