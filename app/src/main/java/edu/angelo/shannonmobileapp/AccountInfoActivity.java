package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class AccountInfoActivity extends AppCompatActivity {
    private ImageButton returnHome;
    private ImageButton maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        returnHome = findViewById(R.id.homeButton);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openHomePageActivity();
            }
        });

        maps = findViewById(R.id.mapButton);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });
    }

    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openHomePageActivity() {
        Intent intentHome = new Intent(this, HomePageActivity.class);
        startActivity(intentHome);
    }
}
