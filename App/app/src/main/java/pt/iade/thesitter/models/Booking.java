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
    private String booName;

    public Booking(){

    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
    public Booking(int booId, int booCliId, String booAddress, LocalDate booDate,
                   String booEndTime, BookingStatus booStatus, String booStartTime,
                   String booMore, int booSitId) {

    public Booking(int booId, LocalDate booData, int booCliId, Time booEndTime, int booStaId, Time booStartTime, String booName) {
<<<<<<< HEAD
>>>>>>> Carla
=======
=======


>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
    public Booking(int booId, LocalDate booData, int booCliId, Time booEndTime, int booStaId, Time booStartTime, String booName) {

    public Booking(int booId, int booCliId, String booAddress, LocalDate booDate,
                   String booEndTime, BookingStatus booStatus, String booStartTime,
                   String booMore, int booSitId) {
<<<<<<< HEAD
>>>>>>> db6ce72fbb620ea45449cb163fe2622f243c7d3f
>>>>>>> Carla
=======
>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
        this.booId = booId;
        this.booCliId = booCliId;
        this.booAddress = booAddress;
        this.booDate = booDate;
        this.booEndTime = booEndTime;
        this.booStatus = booStatus;
        this.booStartTime = booStartTime;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
        this.booMore = booMore;
        this.booSitId = booSitId;
        this.booName = booName;
<<<<<<< HEAD
>>>>>>> Carla
=======
=======
>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
        this.booName = booName;
        this.booMore = booMore;
        this.booSitId = booSitId;
<<<<<<< HEAD
>>>>>>> db6ce72fbb620ea45449cb163fe2622f243c7d3f
>>>>>>> Carla
=======
>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
    }

    public int getBooId() {
        return booId;
    }

    public int getBooCliId() {
        return booCliId;
    }

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> Carla
=======
>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
    public Time getBooEndTime() {
        return booEndTime;
    }

    public int getBooStaId() {
        return booStaId;
    }

    public Time getBooStartTime() {
        return booStartTime;
    }

    public String getBooName() {return booName;}

    public void setBooData(LocalDate booData) {
        this.booData = booData;
    }

<<<<<<< HEAD
<<<<<<< HEAD
>>>>>>> Carla
=======
=======
>>>>>>> db6ce72fbb620ea45449cb163fe2622f243c7d3f
>>>>>>> Carla
=======
>>>>>>> 227f32b0e836dd208f6b6f02eac8019ef6d988c9
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
    public void setBooName(String booName) {this.booName = booName; }
}
