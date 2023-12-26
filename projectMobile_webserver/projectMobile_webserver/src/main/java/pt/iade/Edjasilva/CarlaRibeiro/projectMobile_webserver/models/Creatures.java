package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="creatures")
public class Creatures {

    @Column(name="cre_id")
    private int cre_id;

    @Column(name="cre_type")
    private String cre_type;

    @Column(name="cre_info")
    private String cre_info;


}
