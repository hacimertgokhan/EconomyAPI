package net.hacimertgokhan.bist;


import net.hacimertgokhan.bist.maths.PriceCalculators;

import javax.swing.*;

public class BISTJFrame {
    private int startPrice = 0;
    private int lotAmount = 0;
    private int len = 0;
    public BISTJFrame() {}
    public void makeWindow() {
        startPrice = Integer.parseInt(JOptionPane.showInputDialog("Halka arz fiyat nedir ?"));
        lotAmount = Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir lot miktarı belirtiniz."));
        len = Integer.parseInt(JOptionPane.showInputDialog("İşlem uzunluğu ne kadar olmalı ?"));
        final PriceCalculators calculators = new PriceCalculators(startPrice, lotAmount, "tr");
        calculators.Calculate(len, calculators.getPrice(), calculators.getLots());
    }

    public int getStartPrice() {
        return startPrice;
    }

    public int getLotAmount() {
        return lotAmount;
    }

}
