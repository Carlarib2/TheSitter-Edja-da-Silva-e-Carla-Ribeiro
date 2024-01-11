package pt.iade.thesitter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import pt.iade.thesitter.models.Client;

public class Calendar extends AppCompatActivity {
    List<String> datasSelecionadas = new ArrayList<>();
    Client client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        Intent intent = getIntent();
        client = (Client) intent.getSerializableExtra("client");

        CalendarView calendarView = findViewById(R.id.calendarView_cal);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                String selectedDate = dayOfMonth + "/" + (month + 1) + "/" + year;
                Toast.makeText(Calendar.this, "Data selecionada: " + selectedDate, Toast.LENGTH_SHORT).show();

                datasSelecionadas.add(selectedDate);

            }
        });
    }


    public void startHomeS3(View view){
        Intent intent = new Intent(this, The_profile_1.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }

    public void startRequestsS3(View view){
        Intent intent = new Intent(this, Requests_view.class);
        intent.putExtra("client", client);
        startActivity(intent);
    }


    public void startProfileS3(View view){
        finish();
    }

    public void startSaveS3(View view){
        finish();
    }
}