package DesignPattern.TemplatePattern;

/**
 * Created by Suheng on 5/8/15.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //template method
    public final void play() {
        //initialize the game
        this.initialize();

        //start game
        this.startPlay();

        //end game
        this.endPlay();
    }
}
