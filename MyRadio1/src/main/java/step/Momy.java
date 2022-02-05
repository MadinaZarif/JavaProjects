package step;

import util.Narrator;
import util.Player;
import util.TalkingAt;

public class Momy<Erzahler> implements Player {

    private String name;
    private Kinder ersteKinder;

    private Narrator erzahler;

    public Momy(){
        //
        this.name = name;
        this.ersteKinder = new Kinder();
        this.erzahler = new Narrator(this, TalkingAt.Middle);
    }

    @Override
    public String getName() {
        return name;
    }
    public void horeRadio(Radio radio) {
        System.out.println("Ist das so, höre ich Radio.");

        erzahler.say(ersteKinder.getName() + ", kannst du das Radio einschalten?");

        if (ersteKinder.canYouTurnOnRadio()){
            erzahler.say("Okay, kannst du dann das Radio einschalten?");
            ersteKinder.isteinSchalten(radio);
            return;

        }
    }

}
