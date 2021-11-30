package com.example.gdsc_akgec;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.textfield.TextInputLayout;

public class registrationpage extends AppCompatActivity {

    TextInputLayout name_var,username_var,phoneno_var,password_var;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrationpage);

        name_var=findViewById(R.id.editTextTextPersonName);
        username_var=findViewById(R.id.editTextTextEmailAddress);
        phoneno_var=findViewById(R.id.editTextPhone);
        password_var=findViewById(R.id.editTextTextPassword2)
    }

    public void registerbuttononclick(View view) {
        String name_=name_var.getEditText().getText().toString();
        String username_=username_var.getEditText().getText().toString();
        String phoneno_=phoneno_var.getEditText().getText().toString();
        String password_=password_var.getEditText().getText().toString();
        if(!name_.isEmpty())
        {name_var.setError(null);
        name_var.setErrorEnabled(null);
        if(!username_.isEmpty())
        {
         username_var.setError(null);
         username_var.setErrorEnabled(null);
         if(!phoneno_.isEmpty()) {
             phoneno_var.setError(null);
             phoneno_var.setErrorEnabled(null);
             if (!password_.isEmpty()) {
                 password_var.setError(null);
                 password_var.setErrorEnabled(null);

             } else {
                 password_var.setError("Please enter the password");
             }
         }else{
             phoneno_var.setError("Please enter your phone number");
         }
        }else{
            username_var.setError("Please enter the username");
        }

        }else{
            name_var.setError("Please enter your name");
        }

    }
}