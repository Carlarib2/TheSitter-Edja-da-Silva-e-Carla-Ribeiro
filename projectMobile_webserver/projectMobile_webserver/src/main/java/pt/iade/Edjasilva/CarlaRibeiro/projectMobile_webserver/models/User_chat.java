package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="user_chat")

public class User_chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="usat_id")
    private int usat_id;

    @Column(name="usat_user_id")
    private int usat_user_id;

    @Column(name="usat_chat_id")
    private int usat_chat_id ;

}
