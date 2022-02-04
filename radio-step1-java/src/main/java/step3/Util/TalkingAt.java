package step3.Util;

import javax.imageio.stream.MemoryCacheImageInputStream;

public enum TalkingAt {
    //
    Left(0),
        Middle(3),
            Right(6);

    private int tabCount;

    private TalkingAt(int tabCount){
        //
        this.tabCount = tabCount;
    }
    private int TabCount(){
        return  tabCount;
    }
}
