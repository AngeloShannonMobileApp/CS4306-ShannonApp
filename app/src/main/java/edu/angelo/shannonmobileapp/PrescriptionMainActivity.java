package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PrescriptionMainActivity extends AppCompatActivity {
    private ImageButton returnHome;
    private ImageButton calendar;
    private ImageButton maps;
    private ImageButton account;
    private Button walmart;
    private Button heb;
    private Button cvs;
    private Button walgreens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescription);

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

        walmart = findViewById(R.id.walmartButton);
        walmart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openWalmartWebsite();
            }
        });

        heb = findViewById(R.id.hebButton);
        heb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openHEBWebsite();
            }
        });

        cvs = findViewById(R.id.cvsButton);
        cvs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openCVSWebsite();
            }
        });

        walgreens = findViewById(R.id.walgreensButton);
        walgreens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openWalgreensWebsite();
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

    public void openCalendarActivity() {
        Intent CalendarIntent = new Intent(this, CalendarActivity.class);
        startActivity(CalendarIntent);
    }

    public void openWalmartWebsite() {
        Intent openWalmartWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.walmart.com/cp/pharmacy/5431?povid=HWS_LHN_Pharmacy"));
        startActivity(openWalmartWebsite);
    }

    public void openHEBWebsite() {
        Intent HEBWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.heb.com/pharmacy/common/landing"));
        startActivity(HEBWebsite);
    }

    public void openCVSWebsite() {
        Intent CVSWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cvs.com/pharmacy/v2/#/pharmacy"));
        startActivity(CVSWebsite);
    }

    public void openWalgreensWebsite() {
        Intent walgreensWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.walgreens.com/"));
        startActivity(walgreensWebsite);
    }

    public void openAccountActivity(){
        Intent AccountIntent = new Intent(this, AccountInfoActivity.class);
        startActivity(AccountIntent);
    }

}
