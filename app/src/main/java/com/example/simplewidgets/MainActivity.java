package com.example.simplewidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int MY_REQUEST_CODE = 10;
    private EditText username;
    private EditText password;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.btLogin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("123456")) {
                    Toast.makeText(MainActivity.this, "Login Successfully !", Toast.LENGTH_SHORT).show();
                    System.out.println("Login Successfully !");
                    nextActivity();
                } else {
                    Toast.makeText(MainActivity.this, "Login Successfully !", Toast.LENGTH_SHORT).show();
                    System.out.println("Login Fail !");
                }
            }
        });
    }

    private void nextActivity() {
        Intent intent = new Intent(MainActivity.this, Home.class);
        intent.putExtra("key_username", (CharSequence) username);
//        startActivity(intent, MY_REQUEST_CODE);
    }
}