package cat.institutmvm.application.entities;

import cat.institutmvm.application.utils.MyMath;

public class Colour {
    private String name;
    private int red;
    private int green;
    private int blue;
    public static final String NO_NAME = "Undefined";
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 255;
    private static int counter = 0;

    public Colour (String name, int red, int green, int blue){
        this.setName(name);
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
        counter++;
    }

    public Colour(int red, int green, int blue){
        this(NO_NAME,red, green, blue);
    }

    public Colour(){
        this(NO_NAME,MAX_VALUE, MAX_VALUE, MAX_VALUE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public static int getCounter(){ return counter; }

    public static Colour random (){
        return new Colour(MyMath.nextInt(MAX_VALUE),
                MyMath.nextInt(MAX_VALUE),
                MyMath.nextInt(MAX_VALUE));
    }

    public String toRGB(boolean upperCase) {
        return String.format("%s(%d,%d,%d)", upperCase ? "RGB" : "rgb", this.getRed(), this.getGreen(), this.getBlue());
    }
    public String toRGB() {
        return toRGB(true);
    }
}
