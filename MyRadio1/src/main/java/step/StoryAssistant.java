package step;

public class StoryAssistant {
    //
    public static void main(String[] args) {

        storyStart();
    }
    public static void storyStart(String name){
        //
        Radio radio = new Radio();
        Momy momy = new Momy ();
        Kinder kinder = new Kinder ();


        momy.horeRadio(radio);
    }
}
