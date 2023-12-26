package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="creatures")
public class Creatures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="cre_id")
    private int cre_id;

    @Column(name="cre_type")
    private String cre_type;

    @Column(name="cre_info")
    private String cre_info;


}
