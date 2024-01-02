package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

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


    public int getChatId() {
        return chatId;
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
}
