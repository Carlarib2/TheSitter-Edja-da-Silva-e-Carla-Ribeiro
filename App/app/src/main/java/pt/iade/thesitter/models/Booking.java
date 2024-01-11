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
    private String booAddress;
    @JsonAdapter(DateJsonAdapter.class)
    private LocalDate booDate;
    private Client client;
    private String booEndTime;
    private BookingStatus booStatus;
    private Sitter sitter;
    private String booStartTime;
    private String booMore;

    public Booking(){
        this(0, "", LocalDate.now(), null, "", BookingStatus.PENDING, null, "", "");
    }

    public Booking(int booId, String booAddress, LocalDate booDate, Client client, String booEndTime,
                   BookingStatus booStatus, Sitter sitter, String booStartTime, String booMore) {
        this.booId = booId;
        this.booAddress = booAddress;
        this.booDate = booDate;
        this.client = client;
        this.booEndTime = booEndTime;
        this.booStatus = booStatus;
        this.sitter = sitter;
        this.booStartTime = booStartTime;
        this.booMore = booMore;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Sitter getSitter() {
        return sitter;
    }

    public void setSitter(Sitter sitter) {
        this.sitter = sitter;
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


    public interface SaveResponse{
        public void response();
    }
}
