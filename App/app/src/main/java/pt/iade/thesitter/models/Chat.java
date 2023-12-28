package pt.iade.thesitter.models;

import java.security.Timestamp;

public class Chat {


    private int chatId;

    private String chatMessageContent;

    private Timestamp chatTimestamp;

    public Chat(){

    }

    public Chat(int chatId, String chatMessageContent, Timestamp chatTimestamp) {
        this.chatId = chatId;
        this.chatMessageContent = chatMessageContent;
        this.chatTimestamp = chatTimestamp;
    }

    public int getChatId() {
        return chatId;
    }

    public String getChatMessageContent() {
        return chatMessageContent;
    }

    public Timestamp getChatTimestamp() {
        return chatTimestamp;
    }
}
