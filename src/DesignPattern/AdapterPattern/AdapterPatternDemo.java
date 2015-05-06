package DesignPattern.AdapterPattern;

/**
 * Created by Suheng on 15/5/6.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Here we go");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far awa.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
