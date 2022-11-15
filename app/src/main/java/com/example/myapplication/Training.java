package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Training extends AppCompatActivity {
    String btn_text;
    Button start_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        btn_text = refindActionButton(R.id.action_btn).getText().toString();

        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = btn_text.equals("Start") ? "Stop" : "Start";
                start_btn.setText(text);
                btn_text = refindActionButton(R.id.action_btn).getText().toString();
            }

        });
    }

    public Button refindActionButton(int id) {
        start_btn = findViewById(id);
        return start_btn;
    }
}