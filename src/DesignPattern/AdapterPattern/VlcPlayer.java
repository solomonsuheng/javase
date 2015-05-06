package DesignPattern.AdapterPattern;

/**
 * Created by Suheng on 15/5/6.
 */
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name :" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
