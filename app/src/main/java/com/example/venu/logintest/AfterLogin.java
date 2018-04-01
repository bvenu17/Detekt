package com.example.venu.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterLogin extends AppCompatActivity {

    Button buttonQrScanner;
    Button buttonAccountDetails;
    Button buttonTextReader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

         buttonQrScanner = (Button) findViewById(R.id.buttonQrScanner);
         buttonAccountDetails = (Button) findViewById(R.id.buttonAccountDetails);
         buttonTextReader = (Button) findViewById(R.id.buttonTextReader);

        buttonQrScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Closing current activity.

                finish();

                // Opening the Main Activity .
                Intent intent = new Intent(AfterLogin.this, QrScanner.class);
                startActivity(intent);

            }
        });
        buttonAccountDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

                Intent intent = new Intent(AfterLogin.this, UserProfileActivity.class);
                startActivity(intent);

            }
        });

        buttonTextReader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

                Intent intent = new Intent(AfterLogin.this, TextScanner.class);
                startActivity(intent);

            }
        });


    }
}
