package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {
    private ImageButton prescription;
    private ImageButton maps;
    private ImageButton account;
    private ImageButton calendar;
    private Button bill;
    private Button north;
    private Button east;
    private Button south;
    private Button jackson;
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

        calendar = findViewById(R.id.calendarButton);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openCalendarActivity();
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

        north = findViewById(R.id.buttonNorth);
        north.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrgentCareActivity();
            }
        });

        east = findViewById(R.id.buttonEast);
        east.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrgentCareActivity();
            }
        });

        south = findViewById(R.id.buttonSouth);
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrgentCareActivity();
            }
        });

        jackson = findViewById(R.id.buttonJackson);
        jackson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrgentCareActivity();
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

    public void openUrgentCareActivity(){
        Intent urgentCare = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.shannonhealth.com/services/urgent-care/"));
        startActivity(urgentCare);
    }

    public void openCalendarActivity() {
        Intent CalendarIntent = new Intent(this, CalendarActivity.class);
        startActivity(CalendarIntent);
    }
}
