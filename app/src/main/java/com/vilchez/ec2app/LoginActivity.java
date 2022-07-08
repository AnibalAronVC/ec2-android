package com.vilchez.ec2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {

    TextView textRegister;
    MaterialButton loginButton;

    TextInputLayout inputLayoutEmail, inputLayoutPassword;
    TextInputEditText inputEmail, inputPassword;
    String textEmail, textPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textRegister = findViewById(R.id.textRegister);
        loginButton = findViewById(R.id.login_button);

        inputLayoutEmail = findViewById(R.id.login_inputLayout_email);
        inputLayoutPassword = findViewById(R.id.login_inputLayout_password);
        inputEmail = findViewById(R.id.login_input_email);
        inputPassword = findViewById(R.id.login_input_password);

        textRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textEmail = inputEmail.getText().toString();
                textPassword = inputPassword.getText().toString();

                if(TextUtils.isEmpty(textEmail) || TextUtils.isEmpty(textPassword)){
                    if(TextUtils.isEmpty(textEmail)) {
                        inputLayoutEmail.setError("Email field can't be empty!");
                    }
                    else {
                        inputLayoutEmail.setError(null);
                    }
                    if(TextUtils.isEmpty(textPassword)) {
                        inputLayoutPassword.setError("Password field can't be empty!");
                    }
                    else {
                        inputLayoutPassword.setError(null);
                    }
                } else {
                    Intent intent = new Intent(LoginActivity.this, ElegantActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });



    }
}