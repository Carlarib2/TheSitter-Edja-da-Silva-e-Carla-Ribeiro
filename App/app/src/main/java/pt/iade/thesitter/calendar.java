package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class calendar extends AppCompatActivity {
    List<String> datasSelecionadas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);



        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(calendar.this, "Data selecionada: " + selectedDate, Toast.LENGTH_SHORT).show();

                datasSelecionadas.add(selectedDate);
            }
        });
    }

    public void startHome5(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startRequests4(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessages6(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfile4(View view){
        Intent intent = new Intent(this, profile_settings.class);
        startActivity(intent);
    }
}