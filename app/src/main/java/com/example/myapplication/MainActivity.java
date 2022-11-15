package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String btn_text;
    Button connect_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_text = refindConnectButton(R.id.connect_btn).getText().toString();

        connect_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn_text.equals("Connect") ? "Disconnect" : "Connect";
                connect_btn.setText(text);
                btn_text = refindConnectButton(R.id.connect_btn).getText().toString();
            }

        });

//        ImageButton training_btn = findViewById(R.id.training_btn);
//
//        training_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });
    }

    public Button refindConnectButton(int id) {
        connect_btn = findViewById(id);
        return connect_btn;
    }

    public void navigateToTrainingActivity(View v) {
        Intent intent = new Intent(this, Training.class);
        startActivity(intent);
    }

    public void navigateToRelaxationActivity(View v) {
        Intent intent = new Intent(this, Relaxation.class);
        startActivity(intent);
    }

    public void navigateToSettingsActivity(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }


}