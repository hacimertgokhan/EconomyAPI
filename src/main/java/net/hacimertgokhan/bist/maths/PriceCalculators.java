package net.hacimertgokhan.bist.maths;

import java.util.HashMap;

import static net.hacimertgokhan.bist.maths.Graphics.loadLastCalculateGraphic;

public class PriceCalculators {
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";

    private String type;
    private double price;
    private static Double last;
    private double lots;
    public static HashMap<String, Double> priceList = new HashMap<>();;

    public String getSymbol() {
        return switch (type) {
            case "tr" -> "TL";
            case "de" -> "EUR";
            default -> "none";
        };
    }

    public PriceCalculators(double price, double lots, String type) {
        this.price = price;
        this.lots = lots;
        this.type = type;
    }

    // Halk arz fiyatını girilen takip sayısına kadar hesaplar.
    public void Calculate(int len, double price, double lots) {
        double selectedPrice;
        for (int b=0; b<50; b++) {System.out.println('\n');}
        System.out.println("[İşlemin sırası] - [Tavan Fiyatı / Taban Fiyatı] - [İşlem günü] - [Tavan | Taban Değerlerinde oluşacak bütçe]");
        for(int a=1; a<=(len+1); a++) {
            if(a==1) {
                priceList.put(("prc_1"), price);
            } else {

                selectedPrice = ((priceList.get("prc_"+(a-1)) * 0.1)+(priceList.get("prc_"+(a-1))));
                double taban = ((priceList.get("prc_"+(a-1))-(priceList.get("prc_"+(a-1)) * 0.1)));
                double calcTaban = (taban*lots);
                double calcTavan = (priceList.get("prc_"+(a-1)).intValue()*lots) ;
                priceList.put(("prc_"+a), selectedPrice);
                if(a<11) {
                    System.out.println("      " + GREEN+"[0" + (a-1) + "]:         " + YELLOW + priceList.get("prc_"+(a-1)).toString().substring(0, 4) + getSymbol() + " / " + String.valueOf(taban).substring(0,4) + getSymbol() + "                    "+RESET+("0"+(a-1))+".              " + RED + String.valueOf(calcTavan).substring(0,5) + " / " + String.valueOf(calcTaban).substring(0,5) + getSymbol() + RESET);
                } else {
                    System.out.println("      " + GREEN+"[" + (a-1) + "]:         " + YELLOW + priceList.get("prc_"+(a-1)).toString().substring(0, 4) + getSymbol() + " / " + String.valueOf(taban).substring(0,4) + getSymbol() + "                    "+RESET+(a-1)+".              " + RED + String.valueOf(calcTavan).substring(0,5) + " / " + String.valueOf(calcTaban).substring(0,5) + getSymbol() + RESET);
                }
            }
            last = priceList.get(len);
        }
        System.out.println(String.format("\nYapılan işlem %s %s fiyat ile (%s) lot miktarından hesaplanmıştır.", price, getSymbol(), lots));
        System.out.println('\n');
        loadLastCalculateGraphic();
        return;
    }

    public static Double getCalculatedLastValue() {
        if(last != null) return last;
        return 0.0;
    }
    // Setters and getters for price calculator.
    public double getLots() { return lots;}
    public double getPrice() { return price;}

}
