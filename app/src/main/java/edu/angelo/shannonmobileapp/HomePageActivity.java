package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {
    private ImageButton prescription;
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
    }

    public void openPrescriptionMainActivity(){
        Intent prescriptionIntent = new Intent(this, PrescriptionMainActivity.class);
        startActivity(prescriptionIntent);
    }
}
