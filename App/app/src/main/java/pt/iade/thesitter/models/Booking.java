package pt.iade.thesitter.models;

import java.io.Serializable;
import java.time.LocalDate;

import pt.iade.thesitter.enums.BookingStatus;

public class Booking implements Serializable {
    private int booId;
    private int booCliId;
    private String booAddress;
    private LocalDate booDate;
    private String booEndTime;
    private BookingStatus booStatus;
    private String booStartTime;
    private String booMore;
    private int booSitId;

    public Booking(){

    }

    public Booking(int booId, int booCliId, String booAddress, LocalDate booDate,
                   String booEndTime, BookingStatus booStatus, String booStartTime,
                   String booMore, int booSitId) {
        this.booId = booId;
        this.booCliId = booCliId;
        this.booAddress = booAddress;
        this.booDate = booDate;
        this.booEndTime = booEndTime;
        this.booStatus = booStatus;
        this.booStartTime = booStartTime;
        this.booMore = booMore;
        this.booSitId = booSitId;
    }

    public int getBooId() {
        return booId;
    }

    public int getBooCliId() {
        return booCliId;
    }

    public void setBooCliId(int booCliId) {
        this.booCliId = booCliId;
    }

    public String getBooAddress() {
        return booAddress;
    }

    public void setBooAddress(String booAddress) {
        this.booAddress = booAddress;
    }

    public LocalDate getBooDate() {
        return booDate;
    }

    public void setBooDate(LocalDate booDate) {
        this.booDate = booDate;
    }

    public String getBooEndTime() {
        return booEndTime;
    }

    public void setBooEndTime(String booEndTime) {
        this.booEndTime = booEndTime;
    }

    public BookingStatus getBooStatus() {
        return booStatus;
    }

    public void setBooStatus(BookingStatus booStatus) {
        this.booStatus = booStatus;
    }

    public String getBooStartTime() {
        return booStartTime;
    }

    public void setBooStartTime(String booStartTime) {
        this.booStartTime = booStartTime;
    }

    public String getBooMore() {
        return booMore;
    }

    public void setBooMore(String booMore) {
        this.booMore = booMore;
    }

    public int getBooSitId() {
        return booSitId;
    }

    public void setBooSitId(int booSitId) {
        this.booSitId = booSitId;
    }
}
