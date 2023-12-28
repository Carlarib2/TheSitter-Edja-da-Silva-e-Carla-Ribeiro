package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class calendar extends AppCompatActivity {
    List<String> datasSelecionadas = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);



        CalendarView calendarView = findViewById(R.id.calendarView_cal);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(calendar.this, "Data selecionada: " + selectedDate, Toast.LENGTH_SHORT).show();

                datasSelecionadas.add(selectedDate);

            }
        });
    }


    public void startHomeS3(View view){
        Intent intent = new Intent(this, the_profile_1.class);
        startActivity(intent);
    }

    public void startRequestsS3(View view){
        Intent intent = new Intent(this, requests_view.class);
        startActivity(intent);
    }

    public void startMessagesS3(View view){
        Intent intent = new Intent(this, messages.class);
        startActivity(intent);
    }

    public void startProfileS3(View view){
        finish();
        //Intent intent = new Intent(this, profile_settings.class);
        //startActivity(intent);
    }

    public void startSaveS3(View view){
        Intent intent = new Intent(this, profile_settings.class);
        finish();
    }
}