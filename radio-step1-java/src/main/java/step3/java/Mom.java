package step3.java;

import step3.Util.Player;
import step3.Util.TalkingAt;

public class Mom implements Player {
    //
    private String name;
    private Child adorableChild;

    private Narrator narrator;

    public Mom (String name) {
        //
        this.name = name;
        this.adorableChild = new Child("Sofiya", 18);
        this.narrator = new Narrator(this, TalkingAt.Left);
    }

    public String getName(){
        return name;
    }

    public void listenToRadio(Radio radio){
        System.out.println("Is that so, I'll listen to the radio. ");

        narrator.say(adorableChild.getName() + ", can you turn on the radio?");

        if(adorableChild.canYouTurnOnRadio()){
            narrator.say("Okay, then can you turn on the radio?");
            adorableChild.turnOnRadio(radio);
            return;
        }
    }
}
