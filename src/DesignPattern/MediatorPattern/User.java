package DesignPattern.MediatorPattern;

/**
 * Created by Suheng on 5/8/15.
 */
public class User {
    private String name;


    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
