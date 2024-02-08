package net.hacimertgokhan.utils;

public class ColorsMg {
    public static String RESET = "\u001B[0m";
    public static String RED = "\u001B[31m";
    public static String GREEN = "\u001B[32m";
    public static String YELLOW = "\u001B[33m";

    public ColorsMg() {}
    public String getColor(String color) {
        switch (color) {
            case "reset":
                return RESET;
            case "red":
                return RED;
            case "yellow":
                return YELLOW;
            case "green":
                return GREEN;
        }
        return RESET;
    }

    public String Colorizer(String string, String color) {
        return (getColor(color) + string);
    }

}
