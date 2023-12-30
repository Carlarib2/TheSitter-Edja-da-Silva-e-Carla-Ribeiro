package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="sitter_rating")
public class SitterRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ra_id")
    private int raId;

    @Column(name="ra_sit_id")
    private int raSitId;

    @Column(name="ra_value")
    private int raValue;

    @Column(name="ra_comment")
    private String raComment;

    public SitterRating(){
    }

    public int getRaId(){return raId; }

    public int getRaSitId(){return raSitId;}

    public int getRaValue(){return raValue;}

    public String getRaComment(){return raComment;}
}
