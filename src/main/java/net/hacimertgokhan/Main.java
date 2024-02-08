package net.hacimertgokhan;

import net.hacimertgokhan.api.EconomgAPI;
import net.hacimertgokhan.bist.EconomgBIST;
import net.hacimertgokhan.bist.maths.EconomgPriceCalculators;
import net.hacimertgokhan.reader.EconomgFileReader;
import net.hacimertgokhan.utils.EconomgLogger;

import java.util.Scanner;
import static net.hacimertgokhan.bist.maths.EconomgGraphics.loadLastCalculateGraphic;

public class Main {
    private static String key = "xxx";

    static EconomgLogger economgLogger = new EconomgLogger();
    static EconomgAPI economgAPI = new EconomgAPI(key);
    static EconomgFileReader economgFileReader = new EconomgFileReader();

    @Deprecated
    public static void main(String[] args) {
        economgFileReader.ReadLanguageFile();
        Scanner selection = new Scanner(System.in);
        economgLogger.printp(":rstTest modu için :ylw'.test':rst, devam etmek için :ylw'.emg':rst");
        while (true) {
            switch (selection.next()) {
                case ".emg":
                    Scanner usercommand = new Scanner(System.in);
                    economgLogger.printp(":rstFor more information :ylw'.help':rst");
                    switch (usercommand.nextLine()) {
                        case ".close":
                            economgLogger.printn(String.format(":red %s :rst", economgFileReader.getLanguage("exit.0")));
                            System.exit(0);
                            break;
                        case ".clear":
                            for (int a = 0; a < 50; a++) {
                                System.out.println('\n');
                            }
                            break;
                        case ".ipo":
                            EconomgPriceCalculators economgPriceCalculators = new EconomgPriceCalculators(35, 15, "tr");
                            economgPriceCalculators.InitialPublicOffering(25);
                            break;
                        case ".graph":
                            loadLastCalculateGraphic();
                            break;
                        case ".help":
                            for(int i=0; i<4; i++) {
                                economgLogger.printn(String.format(":red %s :rst", economgFileReader.getLanguage("help."+i)));
                            }
                            break;
                    }
                    break;
                case ".test":
                    EconomgBIST economgBist = new EconomgBIST();
                    economgBist.ContinuableFunction(true, "test", 5);
                    break;
            }
        }

    }


}
