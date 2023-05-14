package com.example.capitalonebeansprout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class loginActivity extends AppCompatActivity {

    private ImageView buttSignIn;
    private ImageView buttSetUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //SignIn page button
        buttSignIn = (ImageView) findViewById(R.id.buttonImgSignUp);
        buttSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHomeLandingActivity();
            }
        });

        //SetUp page button
        buttSetUp = (ImageView) findViewById(R.id.buttonImgLogin);
        buttSetUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openHomeLandingActivity();
            }
        });

}

    private void openHomeLandingActivity() {
        Intent intent = new Intent(this, homeLandingActivity.class);
        startActivity(intent);
        }
    }