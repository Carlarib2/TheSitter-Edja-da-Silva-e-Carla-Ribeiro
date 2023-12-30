package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_chat")

public class UserChat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="usat_id")
    private int usatId;

    @Column(name="usat_user_id")
    private int usatUserId;

    @Column(name="usat_chat_id")
    private int usatChatId;

    public UserChat() {
    }


    public int getUsatId() {
        return usatId;
    }

    public int getUsatUserId() {
        return usatUserId;
    }

    public int getUsatChatId() {
        return usatChatId;
    }
}
