package pt.iade.thesitter.models;

public class UserChat {

    private int usatId;


    private int usatUserId;


    private int usatChatId;

    public UserChat() {
    }

    public UserChat(int usatId, int usatUserId, int usatChatId) {
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

    public void setUsatUserId(int usatUserId) {
        this.usatUserId = usatUserId;
    }

    public void setUsatChatId(int usatChatId) {
        this.usatChatId = usatChatId;
    }
}
