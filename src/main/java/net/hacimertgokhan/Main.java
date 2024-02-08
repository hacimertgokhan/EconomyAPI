package net.hacimertgokhan;

import net.hacimertgokhan.api.EconomgAPI;
import net.hacimertgokhan.bist.BIST;
import net.hacimertgokhan.bist.maths.PriceCalculators;
import net.hacimertgokhan.reader.FileReader;
import net.hacimertgokhan.utils.Logger;

import java.util.Scanner;
import static net.hacimertgokhan.bist.maths.Graphics.loadLastCalculateGraphic;

public class Main {
    private static String key = "xxx";

    static Logger logger = new Logger();
    static EconomgAPI economgAPI = new EconomgAPI(key);
    static FileReader fileReader = new FileReader();

    @Deprecated
    public static void main(String[] args) {
        fileReader.ReadLanguageFile();
        Scanner selection = new Scanner(System.in);
        logger.printp(":rstTest modu için :ylw'.test':rst, devam etmek için :ylw'.emg':rst");
        while (true) {
            switch (selection.next()) {
                case ".emg":
                    Scanner usercommand = new Scanner(System.in);
                    logger.printp(":rstFor more information :ylw'.help':rst");
                    switch (usercommand.nextLine()) {
                        case ".close":
                            logger.printn(String.format(":red %s :rst", fileReader.getLanguage("exit.0")));
                            System.exit(0);
                            break;
                        case ".clear":
                            for (int a = 0; a < 50; a++) {
                                System.out.println('\n');
                            }
                            break;
                        case ".ipo":
                            PriceCalculators priceCalculators = new PriceCalculators(35, 15, "tr");
                            priceCalculators.InitialPublicOffering(25);
                            break;
                        case ".graph":
                            loadLastCalculateGraphic();
                            break;
                        case ".help":
                            for(int i=0; i<4; i++) {
                                logger.printn(String.format(":red %s :rst", fileReader.getLanguage("help."+i)));
                            }
                            break;
                    }
                    break;
                case ".test":
                    BIST bist = new BIST();
                    bist.ContinuableFunction(true, "test", 5);
                    break;
            }
        }

    }


}
