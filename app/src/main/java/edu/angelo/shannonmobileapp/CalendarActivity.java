package edu.angelo.shannonmobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;


public class CalendarActivity extends AppCompatActivity {

    public ArrayList<Integer> appDay = new ArrayList<>();
    public ArrayList<Integer> appMonth = new ArrayList<>();
    public ArrayList<Integer> appYear = new ArrayList<>();
    public ArrayList<String> appContent = new ArrayList<>();

    private int selectedYear;
    private int selectedMonth;
    private int selectedDay;

    private ImageButton returnHome;
    private ImageButton calendar;
    private ImageButton maps;
    private ImageButton prescription;
    private ImageButton account;
    private Button submit;
    private EditText appStringText;
    private CalendarView calendarView;
    private TextView appointmentDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);



        appStringText = findViewById(R.id.ReasonForAppointment);
        appointmentDisplay = findViewById(R.id.appointmentDisplay);
        calendarView = findViewById(R.id.calendarView);

        if(appYear != null) {
            for (int i = 0; i < appYear.size(); ++i) {
                System.out.print("Checking for App Text: Testing: ");
                System.out.print(appMonth.get(i).toString() + '/' + appDay.get(i) +  '/' + appYear.get(i));
                if (appYear.get(i) == selectedYear) {
                    if(appMonth.get(i) == selectedMonth) {
                        if(appDay.get(i) == selectedDay) {
                            appointmentDisplay.setText(appContent.get(i));
                            System.out.println("Setting App Text");
                        }
                        else {
                            appointmentDisplay.setText("No Appointments Scheduled");
                        }
                    }
                    else {
                        appointmentDisplay.setText("No Appointments Scheduled");
                    }
                }
                else {
                    appointmentDisplay.setText("No Appointments Scheduled");
                }
            }
        }
        else {
            appointmentDisplay.setText("No Appointments Scheduled");
        }
        //set intial values for selected date
        Calendar c = Calendar.getInstance();
        selectedYear =  c.get(Calendar.YEAR);
        selectedMonth = c.get(Calendar.MONTH);
        selectedDay = c.get(Calendar.DAY_OF_MONTH);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                 //this is what you want to use later
                selectedDay = dayOfMonth;
                selectedMonth = month;
                selectedYear = year;
                if(appYear != null) {
                    for (int i = 0; i < appYear.size(); ++i) {
                        System.out.print("Checking for App Text: Testing: ");
                        System.out.println(appMonth.get(i).toString() + '/' + appDay.get(i) +  '/' + appYear.get(i));
                        if (appYear.get(i) == year) {
                            if(appMonth.get(i) == month) {
                                if(appDay.get(i) == dayOfMonth) {
                                    appointmentDisplay.setText(appContent.get(i));
                                    System.out.println("Setting App Text");
                                }
                                else {
                                    appointmentDisplay.setText("No Appointments Scheduled");
                                }
                            }
                            else {
                                appointmentDisplay.setText("No Appointments Scheduled");
                            }
                        }
                        else {
                            appointmentDisplay.setText("No Appointments Scheduled");
                        }
                    }
                }
                else {
                    appointmentDisplay.setText("No Appointments Scheduled");
                }
            }
        });

        calendar = findViewById(R.id.calendarButton);
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openCalendarActivity();
            }
        });

        returnHome = findViewById(R.id.homeButton);
        returnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View vHome) {
                openHomePageActivity();
            }
        });

        submit = findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                SetSchedule(selectedDay, selectedMonth, selectedYear, appStringText.getText().toString());
                System.out.println("Setting Schedule");
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

    public void SetSchedule(int day, int month, int year, String appointment) {
        appContent.add(appointment);
        appDay.add(day);
        appMonth.add(month);
        appYear.add(year);
        appointmentDisplay.setText(appointment);
    }

    public void openCalendarActivity() {
        Intent CalendarIntent = new Intent(this, CalendarActivity.class);
        startActivity(CalendarIntent);
    }




}
