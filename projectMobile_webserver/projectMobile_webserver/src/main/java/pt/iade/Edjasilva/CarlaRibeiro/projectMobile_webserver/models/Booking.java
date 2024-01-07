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

    @Column(name = "boo_data")
    private LocalDate booDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "boo_cli_id", referencedColumnName = "cli_id")
    @JsonBackReference("client-booking")
    private Client client;

    @Column(name = "boo_endTime")
    private String booEndTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "boo_status")
    private BookingStatus status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "boo_sit_id", referencedColumnName = "sit_id")
    @JsonBackReference("sitter-booking")
    private Sitter sitter;


    @Column(name = "boo_startTime")
    private String booStartTime;

    @Column(name = "boo_more")
    private String booMore;



    public Booking(){

    }

    public int getBooId() {
        return booId;
    }

    public void setBooAddress(String booAddress) {
        this.booAddress = booAddress;
    }

    public String getBooAddress() {
        return booAddress;
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

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
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
}

