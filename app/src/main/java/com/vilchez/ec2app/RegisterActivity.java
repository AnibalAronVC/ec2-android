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

public class RegisterActivity extends AppCompatActivity {

    TextView textLogIn;
    MaterialButton registerButton;
    TextInputLayout inputLayoutFullName, inputLayoutPhoneNumber , inputLayoutEmail;
    TextInputEditText inputFullName, inputPhoneNumber ,inputEmail;
    String textFullName, textEmail, textPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        textLogIn = findViewById(R.id.textLogIn);
        inputLayoutFullName = findViewById(R.id.register_inputLayout_fullName);
        inputLayoutEmail = findViewById(R.id.register_inputLayout_email);
        inputLayoutPhoneNumber = findViewById(R.id.register_inputLayout_phoneNumber);
        registerButton = findViewById(R.id.register_button);
        inputFullName = findViewById(R.id.register_input_fullName);
        inputEmail = findViewById(R.id.register_input_email);
        inputPhoneNumber = findViewById(R.id.register_input_phoneNumber);


        textLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textFullName = inputFullName.getText().toString();
                textEmail = inputEmail.getText().toString().trim();
                textPhoneNumber = inputPhoneNumber.getText().toString().trim();

                if(TextUtils.isEmpty(textFullName) || TextUtils.isEmpty(textEmail) || TextUtils.isEmpty(textPhoneNumber)){
                    if(TextUtils.isEmpty(textFullName)) {
                        inputLayoutFullName.setError("Full Name field can't be empty!");
                    } else {
                        inputLayoutFullName.setError(null);
                    }
                    if(TextUtils.isEmpty(textEmail)) {
                        inputLayoutEmail.setError("Email field can't be empty!");
                    }
                    else {
                        inputLayoutEmail.setError(null);
                    }
                    if(TextUtils.isEmpty(textPhoneNumber)) {
                        inputLayoutPhoneNumber.setError("Phone Number field can't be empty!");
                    }
                    else {
                        inputLayoutPhoneNumber.setError(null);
                    }
                } else {
                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                }
//
            }
        });
    }
}