package net.hacimertgokhan.utils;

public class EconomgLogger {
    public EconomgColors economgColors = new EconomgColors();

    public EconomgLogger() {}
    public void printp(String a) {
        System.out.println(economgColors.Colorizer("[Economg]: ", "green") + a.replaceAll(":red", economgColors.getColor("red")).replaceAll(":rst", economgColors.getColor("reset")).replaceAll(":ylw", economgColors.getColor("yellow")).replaceAll(":grn", economgColors.getColor("green")));
    }
    public void printn(String a) {
        System.out.println(a.replaceAll(":red", economgColors.getColor("red")).replaceAll(":rst", economgColors.getColor("reset")).replaceAll(":ylw", economgColors.getColor("yellow")).replaceAll(":grn", economgColors.getColor("green")));
    }

}
