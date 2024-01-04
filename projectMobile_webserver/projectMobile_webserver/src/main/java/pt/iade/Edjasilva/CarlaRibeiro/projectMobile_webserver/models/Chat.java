package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="chat")
public class Chat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="chat_id")
    private int chatId;

    @Column(name="chat_message_content")
    private String chatMessageContent;

    @Column(name="chat_timestamp")
    private Timestamp chatTimestamp;



    public Chat(){

    }


    public String getChatMessageContent() {
        return chatMessageContent;
    }

    public void setChatMessageContent(String chatMessageContent) {
        this.chatMessageContent = chatMessageContent;
    }

    public Timestamp getChatTimestamp() {
        return chatTimestamp;
    }

    public void setChatTimestamp(Timestamp chatTimestamp) {
        this.chatTimestamp = chatTimestamp;
    }

    public int getChatId() {
        return chatId;
    }
}
