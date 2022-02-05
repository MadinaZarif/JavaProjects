package step;

import util.Narrator;
import util.Player;
import util.TalkingAt;

public class Radio implements Player {
    //
    private String name;
    private boolean einSchalten;
    private int tonLaut;

    private Narrator erzahler;

    public Radio(){
        //
        this.name = name;
        this.einSchalten = false;
        this.tonLaut = 1;

        this.erzahler = new Narrator(this, TalkingAt.Right);
    }
    public  String getName() { return name; }




    public boolean isteinSchalten() {return this.einSchalten;}

    public void anMachen(){
        //
        this.einSchalten = true;
        this.tonLaut = 1;
        this.rundfunk();
    }

    public void istausSchalten(){
        //
        this.einSchalten = false;
        this.tonLaut = 1;
    }

    private void rundfunk(){
        //
        erzahler.say("[TonLaut: " + tonLaut + " ] Ah, ah, lass mich dir die Neuigkeiten von heute erzählen.");

    }
}
