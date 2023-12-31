package pt.iade.thesitter.models;

public class User_chat {

    private int usatId;


    private int usatUserId;


    private int usatChatId;

    public User_chat() {
    }

    public User_chat(int usatId, int usatUserId, int usatChatId) {
        this.usatId = usatId;
        this.usatUserId = usatUserId;
        this.usatChatId = usatChatId;
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
