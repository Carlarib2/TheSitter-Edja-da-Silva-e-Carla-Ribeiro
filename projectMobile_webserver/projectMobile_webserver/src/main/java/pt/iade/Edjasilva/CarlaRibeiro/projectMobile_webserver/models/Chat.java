package pt.iade.Edjasilva.CarlaRibeiro.projectMobile_webserver.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name="chat")
public class Chat {

    @Column(name="chat_id")
    private int chat_id;

    @Column(name="chat_message_content")
    private String chat_message_content;

    @Column(name="chat_timestamp")
    private Timestamp chat_timestamp;
}
