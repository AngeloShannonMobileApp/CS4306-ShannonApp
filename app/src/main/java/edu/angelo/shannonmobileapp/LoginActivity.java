package edu.angelo.shannonmobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class LoginActivity extends AppCompatActivity {
    private Button mapsbutton;
    private Button buttonHome;
    private Button createAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mapsbutton = findViewById(R.id.mapsbutton);
        mapsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });

        buttonHome = findViewById(R.id.loginButton);
        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openHomePageActivity();
            }
        });

        createAccount = findViewById(R.id.createAccount);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openCreateAccountActivity();
            }
        });
    }

    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void openCreateAccountActivity(){
        Intent intent = new Intent(this, createAccount.class);
        startActivity(intent);
    }

    public void openHomePageActivity() {
        Intent intentHome = new Intent(this, HomePageActivity.class);
        startActivity(intentHome);
    }
}