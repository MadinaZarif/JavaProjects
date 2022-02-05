package step4.Util;

import step3.Util.TalkingAt;

public enum TalkingAt4 {
    //
    Left(0),
    Middle(3),
    Right(6);

    private int tabCount4;

    private TalkingAt4(int tabCount){
        this.tabCount4 = tabCount;}

    public int tabCount4(){
        return tabCount4;}

    }

