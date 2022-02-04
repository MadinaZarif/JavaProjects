package step2;

import io.namoosori.oops.radio.util.Narrator;
import io.namoosori.oops.radio.util.Player;
import io.namoosori.oops.radio.util.TalkingAt;

public class Radio implements Player {
    //
    private String name;
    private boolean powerOn;
    private int volumeLevel;

    private Narrator narrator;

    public Radio(String name) {
    //
this.name =name;
this.powerOn =false;
this.volumeLevel =1;

this.narrator =new Narrator( this,TalkingAt.Right);
}
public String getName(){return name; }

public boolean isPowerOn(){return this.powerOn;}

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

private void broadcasting() {
    //
    narrator.say("[Volume: " + volumeLevel + "] Ah, ah, let me tell you today's news");
}
}
