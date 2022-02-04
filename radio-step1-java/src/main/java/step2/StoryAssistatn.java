package step2;

import io.namoosori.oops.radio.step1.Child;
import io.namoosori.oops.radio.step1.Mom;

public class StoryAssistatn {
    //

    public static void main(String[] args) {
        (startStory());
    }

        public static void startStory(String){
        Radio radio = new Radio( "Shabnam");
        Mom mom = new Mom("Madina");
            Child child = new Child("Diana", 22);


        mom.listenToRadio(radio);
    }
    }

