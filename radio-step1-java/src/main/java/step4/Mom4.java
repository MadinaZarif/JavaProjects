package step4;

import step3.Util.Narrator;
import step3.Util.Player;
import step3.Util.TalkingAt;

public class Mom4 implements Player {
    //
    private String name;
    private Child adorableChild;

    private Narrator narrator;

    public Mom(String name){
        //
        this.name = name;
        this.adorableChild = new Child("Davud", 5);
        this.narrator = new Narrator(this, TalkingAt.Left);
    }
    public String getName(){
        return name;
    }

    public void listenToRadio(Radio4 radio){

    }
}
