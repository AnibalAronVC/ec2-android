package com.vilchez.ec2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class ChairActivity extends AppCompatActivity {

    private Button buttonAdd;
    private Button snackButton_add2;

    MaterialButton chairButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chair);

        buttonAdd = findViewById(R.id.snackar_buttonAdd);
        snackButton_add2 = findViewById(R.id.snackar_buttonAdd2);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar = Snackbar.make(view, "Has agregado al Carrito de Compras", Snackbar.LENGTH_LONG);
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

        snackButton_add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChairActivity.this, LastActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}