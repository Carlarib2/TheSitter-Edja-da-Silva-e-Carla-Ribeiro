package pt.iade.thesitter.models;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.annotations.JsonAdapter;

import java.io.Serializable;
import java.net.URL;
import java.time.LocalDate;

import pt.iade.thesitter.enums.BookingStatus;
import pt.iade.thesitter.utilities.DateJsonAdapter;
import pt.iade.thesitter.utilities.WebRequest;

public class Booking implements Serializable {
    private int booId;
    private int booCliId;
    private String booAddress;
    @JsonAdapter(DateJsonAdapter.class)
    private LocalDate booDate;
    private String booEndTime;
    private BookingStatus booStatus;
    private String booStartTime;
    private String booMore;
    private int booSitId;
    private String booName;

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

    public void save (SaveResponse response) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    if (booId == 0) {
                        WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/bookings"));
                        String resp = request.performPostRequest(Booking.this);

                        Booking booking = new Gson().fromJson(resp, Booking.class);

                        booId = booking.getBooId();
                        response.response();

                    } else {
                        WebRequest request = new WebRequest(new URL(WebRequest.LOCALHOST+"/api/bookings/"+booId));
                        request.performPutRequest(Booking.this);

                        response.response();
                    }

                } catch (Exception e){
                    Log.e("Booking.save", e.toString());
                }
            }
        });
        thread.start();
    }

    public int getBooId() {
        return booId;
    }

    public void setBooId(int booId) {
        this.booId = booId;
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

    public String getBooName() {
        return booName;
    }

    public void setBooName(String booName) {
        this.booName = booName;
    }


    public interface SaveResponse{
        public void response();
    }
}
