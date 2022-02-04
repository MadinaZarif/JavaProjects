package step2;

import io.namoosori.oops.radio.util.Narrator;
import io.namoosori.oops.radio.util.TalkingAt;
import step2.Util.Player;

public class Child implements Player {
    //
    private String name;
    private int age;

    private Narrator narrator;

    public Child(String name, int age) {
        //
        this.name = name;
        this.age = age;

        this.narrator = new Narrator( this, TalkingAt.Middle);
    }
    public String getName (){
        //
        return name;
    }
    public boolean canYouTurnOnRadio(){
        //
        narrator.say("Can you turn on Radio?");

        if(canYouTurnOnRadio()){
            narrator.say("yes, I can ");
            return true;
        } else {
            narrator.say("No, I cannot do it. ");
            return false;
        }
    }

public void turnOnRadio(Radio radio){
    //
    narrator.say("yes turn on.");
    radio.turnOn();
}
private boolean canITurnOnRadio(){
    //
    if (age > 4) {
        narrator.sayAndSleep("I'm five so I shoild turn on the radio.. ", 13);
        return true;
    }
     narrator.say("I'm still too young to touch the radio...");
    return false;
}
}