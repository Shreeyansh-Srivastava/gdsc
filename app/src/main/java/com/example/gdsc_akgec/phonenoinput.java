package com.example.gdsc_akgec;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class phonenoinput extends AppCompatActivity {
Button loginbutton,registerbutton,forgotpasswordbutton;
TextInputLayout username_var,password_var;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonenoinput);

        loginbutton=findViewById(R.id.login);
        registerbutton=findViewById(R.id.register);
        forgotpasswordbutton=findViewById(R.id.forgotpassword);
        username_var=findViewById(R.id.editTextTextEmailAddress);
        password_var=findViewById(R.id.editTextTextPassword);

        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),registrationpage.class);
                startActivity(intent);
            }
        });
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username_ = username_var.getEditText().getText().toString();
                String password_ = password_var.getEditText().getText().toString();

                if(!username_.isEmpty()){
                    username_var.setError(null);
                    username_var.setErrorEnabled(false);
                    if(!password_.isEmpty()){
                        password_var.setError(null);
                        password_var.setErrorEnabled(false);
//here we have to the code of firebase

                    }else{
                        password_var.setError("Please enter the password");
                    }
                }else{
                    username_var.setError("Please enter the username");
                }





                Intent intent = new Intent(getApplicationContext(),MainActivity.class);//it may be shifted near to the firebase code
                startActivity(intent);
            }
        });
        forgotpasswordbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),otpverification.class);
                startActivity(intent);
            }
        });

    }
}