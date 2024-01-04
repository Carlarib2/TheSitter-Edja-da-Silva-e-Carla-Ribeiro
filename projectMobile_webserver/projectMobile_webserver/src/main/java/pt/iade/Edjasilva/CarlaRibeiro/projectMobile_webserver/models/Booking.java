package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "boo_id")
    private int booId;

    @Column(name = "boo_data")
    private LocalDate booData;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "boo_cli_id", referencedColumnName = "cli_id")
    @JsonBackReference("client-booking")
    private Client client;

    @Column(name = "boo_endTime")
    private Time booEndTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "boo_sta_id", referencedColumnName = "sta_id")
    @JsonBackReference("status-booking")
    private Status status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "boo_sit_id", referencedColumnName = "sit_id")
    @JsonBackReference("sitter-booking")
    private Sitter sitter;


    @Column(name = "boo_startTime")
    private Time booStartTime;



    public Booking(){

    }


    public LocalDate getBooData() {
        return booData;
    }

    public void setBooData(LocalDate booData) {
        this.booData = booData;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Time getBooEndTime() {
        return booEndTime;
    }

    public void setBooEndTime(Time booEndTime) {
        this.booEndTime = booEndTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Sitter getSitter() {
        return sitter;
    }

    public void setSitter(Sitter sitter) {
        this.sitter = sitter;
    }

    public Time getBooStartTime() {
        return booStartTime;
    }

    public void setBooStartTime(Time booStartTime) {
        this.booStartTime = booStartTime;
    }

    public int getBooId() {
        return booId;
    }
}

