package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BillActivity extends AppCompatActivity {
    private ImageButton returnHome;
    private ImageButton maps;
    private ImageButton prescription;
    private ImageButton account;
    private Button pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        returnHome = findViewById(R.id.homeButton);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openHomePageActivity();
            }
        });

        pay = findViewById(R.id.buttonPay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openCardActivity();
            }
        });

        maps = findViewById(R.id.mapButton);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });

        prescription = findViewById(R.id.prescriptionButton);
        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrescriptionMainActivity();
            }
        });

        account = findViewById(R.id.accountButton);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccountActivity();
            }
        });
    }

    public void openCardActivity(){
        Intent intentCA = new Intent(this, CardActivity.class);
        startActivity(intentCA);
    }

    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openHomePageActivity() {
        Intent intentHome = new Intent(this, HomePageActivity.class);
        startActivity(intentHome);
    }

    public void openPrescriptionMainActivity(){
        Intent prescriptionIntent = new Intent(this, PrescriptionMainActivity.class);
        startActivity(prescriptionIntent);
    }

    public void openAccountActivity(){
        Intent AccountIntent = new Intent(this, AccountInfoActivity.class);
        startActivity(AccountIntent);
    }
}