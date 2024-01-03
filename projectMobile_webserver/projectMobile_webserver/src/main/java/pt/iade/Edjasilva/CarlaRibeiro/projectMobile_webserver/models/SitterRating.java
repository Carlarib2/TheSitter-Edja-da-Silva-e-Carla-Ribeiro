package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="sitter_rating")
public class SitterRating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="ra_id")
    private int raId;

    @ManyToOne
    @JoinColumn(name="ra_sit_id", referencedColumnName = "sit_id")
    @JsonBackReference("sitter-sitterRating")
    private Sitter sitter;
    @Column(name="ra_value")
    private int raValue;

    @Column(name="ra_comment")
    private String raComment;

    public SitterRating(){
    }


    public Sitter getSitter() {
        return sitter;
    }

    public void setSitter(Sitter sitter) {
        this.sitter = sitter;
    }

    public int getRaValue() {
        return raValue;
    }

    public void setRaValue(int raValue) {
        this.raValue = raValue;
    }

    public String getRaComment() {
        return raComment;
    }

    public void setRaComment(String raComment) {
        this.raComment = raComment;
    }

    public int getRaId() {
        return raId;
    }
}
