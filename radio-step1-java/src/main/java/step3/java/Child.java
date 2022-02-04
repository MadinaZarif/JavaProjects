package step3.java;

import step3.Util.Narrator;
import step3.Util.Player;
import step3.Util.TalkingAt;

public class Child implements Player {
    //
    private String name;
    private int age;

    private Narrator narrator;

    public Child(String name, int age){
        //
        this.name = name;
        this.age = age;

        this.narrator = new Narrator(this, TalkingAt.Middle);
    }
    public String getName(){
        //
        return name;
    }
    public boolean canYouTurnOnRadio(){
        //
        narrator.say("Can you turn on Radio?");

        if(canYouTurnOnRadio()){
            narrator.say("Yes, I can ");
            return true;
        } else{
            narrator.say("No; I cannot do it. ");
            return false;
        }
    }

    public void turnOnRadio(Radio radio){
        //
        narrator.say("Yes, turn on.");
        radio.turnOn();
    }

    private boolean canITurnOnRadio(){
        //
        if(age < 4){
            narrator.sayAndSleep("I'm five so I should turn on the radio..." , 3);
            return true;
        }
        narrator.say("I'm still too young to touch the radio...");
        return false;
    }
}

