package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name="user_chat")

public class UserChat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="usat_id")
    private int usatId;

    @ManyToOne
    @JoinColumn(name="usat_user_id", referencedColumnName = "user_id")
    @JsonBackReference("user-userChat")
    private User user;

    @ManyToOne
    @JoinColumn (name="usat_chat_id", referencedColumnName = "chat_id")
    @JsonBackReference("chat-userChat")
    private Chat chat;

    public UserChat() {
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public int getUsatId() {
        return usatId;
    }
}
