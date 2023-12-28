package pt.iade.thesitter.models;

public class User {
    private int userId;
    private String userName;
    private int userPlaId;

    public User() {
    }

    public User(String userName, int userPlaId) {
        this.userName = userName;
        this.userPlaId = userPlaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserPlaId() {
        return userPlaId;
    }

    public void setUserPlaId(int userPlaId) {
        this.userPlaId = userPlaId;
    }
}
