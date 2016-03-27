package oop;

/**
 * Created by student on 2016/03/24.
 */
public class WallPaperBuilder extends WallPaper {


    public WallPaperBuilder(String name, Double[] numbers){
        super(name, numbers);
    }

    public WallPaper getWallpaper() {
       WallPaper wPaper = new WallPaperBuilder(getTypeName(), new Double[]{ getSizeLength(), getSizeWidth(), getPaperWidth() });

        return wPaper;
    }


}
