package utils;

public class ColorsMg {
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";

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
