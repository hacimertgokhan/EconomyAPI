package net.hacimertgokhan.bist;


import net.hacimertgokhan.bist.interfaces.EconomicMathFunctions;
import net.hacimertgokhan.utils.Logger;

import java.util.HashMap;
import java.util.Scanner;

public class BIST implements EconomicMathFunctions {
    Logger logger = new Logger();

    /**
     * @param isRunning 
     * @param func
     * @param num
     * @return
     */
    @Override
    public int ContinuableFunction(boolean isRunning, String func, int num) {
        HashMap<String, Integer> continuableFunc = new HashMap<>();
        if(isRunning) {
            boolean function = continuableFunc.containsKey(func);
            if(function) {
                int funcVal = continuableFunc.get(func);
                int addedVal = num+funcVal;
                continuableFunc.put(func, num);
            } else {
                Scanner ask = new Scanner(System.in);
                logger.printn(":ylwYeni bir sürdürülebilir fonksiyon oluşturulsun mu ?");
                switch (ask.nextLine()) {
                    case "yes", "evet":
                        Scanner func_name = new Scanner(System.in);
                        logger.printn(":grnİşlem onaylandı, fonksiyona vereceğiniz anahtar isim nedir ?");
                        continuableFunc.put(func_name.nextLine().toString(), 0);
                        logger.printn(String.valueOf(continuableFunc.get(func_name.nextLine().toString())));
                        break;
                    case "no", "hayır":
                        logger.printn(":redİşlem sonlandırılıyor...");
                        break;
                }
            }
        }
        return 0;
    }

    /**
     * @param math 
     * @param eval
     * @return
     */
    @Override
    public int NormalMath(String math, String eval) {
        return 0;
    }

    /**
     * @param budgetName 
     * @param type
     * @param num
     * @return
     */
    @Override
    public int BudgetMath(String budgetName, String type, int num) {
        return 0;
    }
}
