package com.example.simplewidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView username;
    private Button btClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        username = findViewById(R.id.textView);
        btClose = findViewById(R.id.btClose);
        username.setText(getIntent().getStringExtra("key_username"));

        btClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home.this.finish();
                System.exit(0);
            }
        });
    }
}