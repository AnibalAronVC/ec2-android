package com.vilchez.ec2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class LastActivity extends AppCompatActivity {

    private Button snackbarButtoon2;
    private Button dialogButton;
    TextView textLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        snackbarButtoon2 = findViewById(R.id.snackar_btn2);
        dialogButton = findViewById(R.id.dialog_btn);
        textLogout = findViewById(R.id.textLogout);

        snackbarButtoon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "Has agregado al carrito de compras", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAction("Okay", new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        //
                    }
                });
                snackbar.show();
            }
        });

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(LastActivity.this);
                builder.setTitle("Hey!!");
                builder.setMessage("Disponible solo por hoy");
                builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        //
                    }
                });
                builder.show();
            }
        });

        textLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LastActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}