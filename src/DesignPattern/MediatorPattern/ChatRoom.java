package DesignPattern.MediatorPattern;

import java.util.Date;

/**
 * Created by Suheng on 5/8/15.
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
