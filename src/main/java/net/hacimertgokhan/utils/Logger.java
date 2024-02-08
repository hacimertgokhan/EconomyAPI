package net.hacimertgokhan.utils;

public class Logger {
    public ColorsMg colorsMg = new ColorsMg();

    public Logger() {}
    public void printp(String a) {
        System.out.println(colorsMg.Colorizer("[Economg]: ", "green") + a.replaceAll(":red", colorsMg.getColor("red")).replaceAll(":rst", colorsMg.getColor("reset")).replaceAll(":ylw", colorsMg.getColor("yellow")).replaceAll(":grn", colorsMg.getColor("green")));
    }
    public void printn(String a) {
        System.out.println(a.replaceAll(":red", colorsMg.getColor("red")).replaceAll(":rst", colorsMg.getColor("reset")).replaceAll(":ylw", colorsMg.getColor("yellow")).replaceAll(":grn", colorsMg.getColor("green")));
    }

}
