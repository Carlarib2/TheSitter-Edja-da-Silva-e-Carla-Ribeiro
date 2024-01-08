package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.enums.BookingStatus;

import java.time.LocalDate;

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "boo_id")
    private int booId;

    @Column(name = "boo_address")
    private String booAddress;

    @Column(name = "boo_date")
    private LocalDate booDate;

    @Column(name = "boo_cli_id")
    private int booCliId;

    @Column(name = "boo_endTime")
    private String booEndTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "boo_status")
    private BookingStatus booStatus;

    @Column(name = "boo_sit_id")
    private int booSitId;


    @Column(name = "boo_startTime")
    private String booStartTime;

    @Column(name = "boo_more")
    private String booMore;



    public Booking(){

    }



    public int getBooId() {
        return booId;
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



    public int getBooCliId() {
        return booCliId;
    }



    public void setBooCliId(int booCliId) {
        this.booCliId = booCliId;
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



    public int getBooSitId() {
        return booSitId;
    }



    public void setBooSitId(int booSitId) {
        this.booSitId = booSitId;
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





}

