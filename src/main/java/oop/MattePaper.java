package oop;

/**
 * Created by student on 2016/03/24.
 */
public abstract class MattePaper {
    private String typeName;
    private double sizeWidth;
    private double sizeLength;
    private double paperWidth;

    public MattePaper(String name, Double[] numbers) {

        typeName = name;
        sizeWidth = numbers[0];
        sizeLength = numbers[1];
        paperWidth = numbers[2];
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

    public String infoMatte(){
        String message = "Paper Type: " + typeName + ", Paper Dimensions: " + sizeLength + "cm x " + sizeWidth + "cm x " + paperWidth + "cm";

        return message;
    }
}
