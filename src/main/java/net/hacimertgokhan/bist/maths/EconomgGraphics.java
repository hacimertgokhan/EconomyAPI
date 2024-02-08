package net.hacimertgokhan.bist.maths;

import java.util.ArrayList;
import java.util.Arrays;

public class EconomgGraphics {

    public static void test_loadLastCalculateGraphic() {
        ArrayList<Integer> f = new ArrayList<>();for(int g=1; g<100; g++) {f.add(g);}
        EconomgPriceCalculators economgPriceCalculators = new EconomgPriceCalculators(35, 10, "tr");
        economgPriceCalculators.InitialPublicOffering(11);
        Arrays.sort(EconomgPriceCalculators.priceList.keySet().toArray(new String[0]));
        ArrayList<String> newList = new ArrayList<>();
        newList.add("\n");
        for(int a = 1; a< EconomgPriceCalculators.priceList.size(); a++) {
            double sayi = (double) a /4;
            int intSayi = (int) sayi;
            double doubleSayi = (double) intSayi;
            if(sayi == doubleSayi) {
                newList.add("\n");
            } else {
                newList.add(String.valueOf(EconomgPriceCalculators.priceList.get("prc_"+a).intValue()));
            }
        }
        System.out.println("   [Artış grafiği]");
        System.out.println("  [Küçükten büyüğe]");
        System.out.println(newList.toString().replace(",", "\t").replace("[", "").replace("]", ""));

    }


    public static void loadLastCalculateGraphic() {
        ArrayList<Integer> f = new ArrayList<>();for(int g=1; g<100; g++) {f.add(g);}
        Arrays.sort(EconomgPriceCalculators.priceList.keySet().toArray(new String[0]));
        ArrayList<String> newList = new ArrayList<>();
        newList.add("\n");
        for(int a = 1; a< EconomgPriceCalculators.priceList.size(); a++) {
            double sayi = (double) a /4;
            int intSayi = (int) sayi;
            double doubleSayi = (double) intSayi;
            if(sayi == doubleSayi) {
                newList.add("\n");
            } else {
                newList.add(String.valueOf(EconomgPriceCalculators.priceList.get("prc_"+a).intValue()));
            }
        }
        System.out.println("   [Artış grafiği]");
        System.out.println("  [Küçükten büyüğe]");
        System.out.println(newList.toString().replace(",", "\t").replace("[", "").replace("]", ""));

    }
}
