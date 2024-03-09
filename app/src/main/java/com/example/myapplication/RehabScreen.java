package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RehabScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rehab_screen);

        Button btnDetox = (Button) findViewById(R.id.buttonDetoxification);
        btnDetox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RehabScreen.this, Detoxification.class);
                startActivity(intent);
            }
        });

        Button btnTherapy = (Button) findViewById(R.id.buttonTherapyNCounselling);
        btnTherapy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RehabScreen.this, TherapyAndCounselling.class);
                startActivity(intent);
            }
        });

    }
}