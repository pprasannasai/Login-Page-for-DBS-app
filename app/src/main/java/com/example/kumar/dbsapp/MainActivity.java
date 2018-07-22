package com.example.kumar.dbsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText mail;
    public EditText pass;
    public Button log;
    public Button acc;
    public EditText forgot;
    public ImageView finger;
    public void LoginButton() {
        mail = (EditText)findViewById(R.id.emailid);
        pass = (EditText)findViewById(R.id.password);
        log = (Button)findViewById(R.id.login);
        finger=(ImageView)findViewById(R.id.imageView);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mail.getText().toString().equals("user") && pass.getText().toString().equals("pass")) {
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Chatbot.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "User and Password is not correct", Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
    public void Fingerprintaunthentication() {
        finger = (ImageView) findViewById(R.id.imageView);
        finger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Fingerprint.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginButton();
        Fingerprintaunthentication();
    }
}
