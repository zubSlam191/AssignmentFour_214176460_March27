package oop;

/**
 * Created by student on 2016/03/24.
 */
public class PaperFactory {
    private MattePaperBuilder mBuilder  = new MattePaperBuilder("Matte", new Double[]{10.0, 4.0, 0.18});
    private MattePaper mattePaper = mBuilder.getMattePaper();

    private WallPaperBuilder wBuilder = new WallPaperBuilder("Wallpaper", new Double[]{15.0, 50.0, 0.09});
    private WallPaper wallPaper = wBuilder.getWallpaper();


    public MattePaper getMattePaper() {
        return mattePaper;
    }

    public WallPaper getWallPaper() {
        return wallPaper;
    }

    public void getPaperDetails() {
        System.out.println("Paper Type details \n" + GlossyPaperSingleton.getInstance().infoGlossy() + "\n" + mattePaper.infoMatte() + "\n" + wallPaper.infoWall());
    }
}
