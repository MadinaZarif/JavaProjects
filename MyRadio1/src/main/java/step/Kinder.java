package step;

import util.Narrator;
import util.Player;

public class Kinder implements Player {

    private String name;
    private int age;

    private Narrator erzahler;

    @Override
    public String getName() {
        return name;
    }

    public boolean canYouTurnOnRadio() {
        //
        erzahler.say("Können Sie das Radio einschalten?");

        if(canYouTurnOnRadio()){
            erzahler.say("Ja, Ich mache ");
            return true;
        } else{
            erzahler.say("Nein, Ich mache nicht...");
            return false;
        }
    }
    public void isteinSchalten(Radio radio){
       erzahler.say("Ja, ich habe gemacht");
       radio.anMachen();
    }
    private boolean canITurnOnRadio(){
        //
        if (age > 4){
            erzahler.sayUndSleep("Ich bin fünf, also sollte ich das Radio einschalten", 3);
            return true;
        }
        erzahler.say("Ich bin noch zu jung, um das Radio anzufassen...");
        return false;
    }
}
