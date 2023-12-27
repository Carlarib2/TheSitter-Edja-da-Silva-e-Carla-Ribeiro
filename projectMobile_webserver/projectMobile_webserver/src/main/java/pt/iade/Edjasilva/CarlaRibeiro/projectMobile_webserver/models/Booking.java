package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name="booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "boo_id")
    private int boo_id;

    @Column(name = "boo_data")
    private LocalDate boo_data;

    @Column(name = "boo_cli_id")
    private int boo_cli_id;

    @Column(name = "boo_endTime")
    private Time boo_endTime;

    @Column(name = "boo_sta_id")
    private int boo_sta_id;

    @Column(name = "boo_startTime")
    private Time boo_startTime;

}

