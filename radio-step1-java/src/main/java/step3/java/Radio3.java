package step3.java;

import step3.Util.Narrator;
import step3.Util.Player;
import step3.Util.TalkingAt;

public class Radio3 implements Player {
    //
    private String name;
    private boolean powerOn;
    private int volumeLevel;

    private Narrator narrator;

    public Radio(String name){
        //#
        this.name = name;
        this.powerOn = false;
        this.volumeLevel = 1;

        this.narrator = new Narrator( this, TalkingAt.Right);
    }

    public void turnOn(){
        //
        this.powerOn = true;
        this.volumeLevel = 1;
        this.broadcasting();
    }

    public void turnOff(){
        //
        this.powerOn = false;
        this.volumeLevel = 1;
    }

    private void broadcasting(){
        //
        narrator.say("[Volume:" + volumeLevel + "] Ah, ah, let me tell you today's news. ");

    }
}
