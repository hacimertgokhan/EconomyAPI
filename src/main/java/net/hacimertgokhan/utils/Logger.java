package utils;

public class Logger {
    public ColorsMg colorsMg = new ColorsMg();

    public Logger() {}
    public void printp(String a) {
        System.out.println(colorsMg.Colorizer("[Economg]: ", "green") + colorsMg.Colorizer(a, "reset"));
    }
    public void printn(String a) {System.out.println(colorsMg.Colorizer(a, "yellow"));}

}
