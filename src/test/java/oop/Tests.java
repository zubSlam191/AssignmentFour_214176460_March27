package oop;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {

    PaperFactory allPapers = new PaperFactory();

    @BeforeMethod
    public void setUp() throws Exception {

        allPapers.getPaperDetails();
    }


    @Test
    public void testPaperNameWall() {

        Assert.assertEquals(allPapers.getWallPaper().getTypeName(), "Wallpaper");
    }

    @Test
    public void testPaperNameMatte(){
        Assert.assertEquals(allPapers.getMattePaper().getTypeName(), "Matte");

    }

    @Test
    public void testPaperNameGlossy(){
        Assert.assertEquals(GlossyPaperSingleton.getInstance().getTypeName(), "Glossy");
    }

}