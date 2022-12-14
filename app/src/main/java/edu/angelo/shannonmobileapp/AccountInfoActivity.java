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
    private ImageButton calendar;
    private ImageButton prescription;
    private Button CHP;
    private Button MyChart;
    private Button logout;

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

        calendar = findViewById(R.id.calendarButton);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openCalendarActivity();
            }
        });


        MyChart = findViewById(R.id.MyChartLink);
        MyChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openMyChartWebsite();
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

        CHP = findViewById(R.id.buttonCHP);
        CHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openCHPActivity();
            }
        });

        logout = findViewById(R.id.buttonLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openLoginActivity();
            }
        });
    }

    public void openLoginActivity(){
        Intent intentL = new Intent(this, LoginActivity.class);
        startActivity(intentL);
    }

    public void openCHPActivity(){
        Intent intentC = new Intent(this, PasswordActivity.class);
        startActivity(intentC);
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

    public void openCalendarActivity() {
        Intent CalendarIntent = new Intent(this, CalendarActivity.class);
        startActivity(CalendarIntent);
    }

    public void openMyChartWebsite() {
        Intent myChartWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mychart.shannonhealth.org/mychart/Authentication/Login?"));
        startActivity(myChartWebsite);
    }
}