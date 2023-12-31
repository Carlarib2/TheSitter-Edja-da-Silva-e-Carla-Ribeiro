package pt.iade.thesitter.models;

import java.sql.Time;
import java.time.LocalDate;

public class Booking {


    private int booId;

    private LocalDate booData;

    private int booCliId;

    private Time booEndTime;

    private int booStaId;

    private Time booStartTime;

    public Booking(){

    }

    public Booking(int booId, LocalDate booData, int booCliId, Time booEndTime, int booStaId, Time booStartTime) {
        this.booId = booId;
        this.booData = booData;
        this.booCliId = booCliId;
        this.booEndTime = booEndTime;
        this.booStaId = booStaId;
        this.booStartTime = booStartTime;
    }

    public int getBooId() {
        return booId;
    }

    public LocalDate getBooData() {
        return booData;
    }

    public int getBooCliId() {
        return booCliId;
    }

    public Time getBooEndTime() {
        return booEndTime;
    }

    public int getBooStaId() {
        return booStaId;
    }

    public Time getBooStartTime() {
        return booStartTime;
    }

}
