package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {
    private ImageButton prescription;
    private ImageButton maps;
    private ImageButton account;
    private Button bill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        prescription = findViewById(R.id.prescriptionButton);
        prescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrescriptionMainActivity();
            }
        });

        maps = findViewById(R.id.mapButton);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMapsActivity();
            }
        });

        account = findViewById(R.id.accountButton);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAccountActivity();
            }
        });

        bill = findViewById(R.id.payBillButton);
        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBillActivity();
            }
        });
    }

    public void openAccountActivity(){
        Intent AccountIntent = new Intent(this, AccountInfoActivity.class);
        startActivity(AccountIntent);
    }

    public void openBillActivity(){
        Intent BillIntent = new Intent(this, BillActivity.class);
        startActivity(BillIntent);
    }

    public void openPrescriptionMainActivity(){
        Intent prescriptionIntent = new Intent(this, PrescriptionMainActivity.class);
        startActivity(prescriptionIntent);
    }

    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
