package DesignPattern.AdapterPattern;

/**
 * Created by Suheng on 15/5/6.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer = null;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            this.advancedMediaPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            this.advancedMediaPlayer.playMp4(fileName);
        }
    }

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            this.advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            this.advancedMediaPlayer = new Mp4Player();
        }
    }
}
