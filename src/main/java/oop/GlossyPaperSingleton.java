package oop;

/**
 * Created by student on 2016/03/24.
 */
public class GlossyPaperSingleton {
    private static GlossyPaperSingleton ourInstance = new GlossyPaperSingleton();
    private String typeName = "Glossy";
    private double sizeWidth = 5;
    private double sizeLength = 6;
    private double paperWidth = 0.12;

    private GlossyPaperSingleton() {

    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public double getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(double sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public double getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(double sizeLength) {
        this.sizeLength = sizeLength;
    }

    public double getPaperWidth() {
        return paperWidth;
    }

    public void setPaperWidth(double paperWidth) {
        this.paperWidth = paperWidth;
    }

    public static GlossyPaperSingleton getInstance() {
        return ourInstance;
    }

    public String infoGlossy(){
        String message = "Paper Type: " + ourInstance.getTypeName() + ", Paper Dimensions: " + ourInstance.getSizeLength() + "cm x " + ourInstance.getSizeWidth() + "cm x " + ourInstance.getPaperWidth() + "cm";

        return message;
    }

}
