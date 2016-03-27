package oop;

/**
 * Created by student on 2016/03/24.
 */
public class MattePaperBuilder extends MattePaper {

    public MattePaperBuilder(String name, Double[] numbers){
        super(name, numbers);
    }

    public MattePaper getMattePaper() {
        MattePaper mPaper = new MattePaperBuilder(getTypeName(), new Double[]{ getSizeLength(), getSizeWidth(), getPaperWidth() });

        return mPaper;
    }


}
