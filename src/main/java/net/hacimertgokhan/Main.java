package net.hacimertgokhan;

import net.hacimertgokhan.api.EconomgAPI;
import net.hacimertgokhan.bist.BISTJFrame;
import utils.Logger;

import java.util.Scanner;
import static net.hacimertgokhan.bist.maths.Graphics.loadLastCalculateGraphic;

public class Main {

    public static Logger logger = new Logger();
    public EconomgAPI economgAPI = new EconomgAPI("xxxxx");

    @Deprecated
    public static void main(String[] args) {
        Scanner command = new Scanner(System.in);
        logger.printp("Test modu için '.test', devam etmek için '.emg'");
        while (true) {
            switch (command.next()) {
                case ".emg":
                    logger.printp("Komutlar ve fonksiyonları için '.yardım'");
                    switch (command.nextLine()) {
                        case ".kapat":
                            logger.printp("İşlemler durduruldu, economg kapatılıyor.");
                            System.exit(0);
                            break;
                        case ".clear":
                            for (int a = 0; a < 50; a++) {
                                System.out.println('\n');
                            }
                            break;
                        case ".halkarz":
                            BISTJFrame bistjFrame = new BISTJFrame();
                            bistjFrame.makeWindow();
                            break;
                        case ".grafik":
                            loadLastCalculateGraphic();
                            break;
                        case ".yardım":
                            logger.printn("\n.kapat : İşlemleri durdurur ve uygulamayı kapatır.\n.halkarz : Halk arzı istenilen noktaya kadar hesaplamanızı sağlar.\n.yardım : Yardım komutlarını gösterir.");
                            break;
                    }
                    break;
                case ".test":
                    BISTJFrame bistjFrame = new BISTJFrame();
                    bistjFrame.makeWindow();
                    break;
            }
        }

    }


}
