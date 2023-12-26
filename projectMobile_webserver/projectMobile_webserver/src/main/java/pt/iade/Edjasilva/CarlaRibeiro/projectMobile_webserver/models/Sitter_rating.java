package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name="sitter_rating")
public class Sitter_rating {

    @Column(name="ra_id")
    private int ra_id;

    @Column(name="ra_sit_id")
    private int ra_sit_id;

    @Column(name="ra_value")
    private int ra_value;

    @Column(name="ra_comment")
    private String ra_comment;




}
