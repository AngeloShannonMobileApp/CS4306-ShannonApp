package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends AppCompatActivity {
    private Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        pay = findViewById(R.id.buttonSavePay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openHomePageActivity();
            }
        });

    }

    public void openHomePageActivity() {
        Intent intentHome = new Intent(this, HomePageActivity.class);
        startActivity(intentHome);
    }

}
