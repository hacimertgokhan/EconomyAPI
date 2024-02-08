package net.hacimertgokhan.bist.interfaces;

public interface EMGEconomicMathFunctions {

    /*
       Continuable Function mean is sustainable process package.
       Whenever you need to add number or remove a specified number
       Continuable function can run while you're adding or removing number.

       What is need for ?
        - For your live and 1 of 1 mathematic process.

     */
    int ContinuableFunction(boolean isRunning, String func, int num);

    // Normal math (3+3, 3^2 etc).
    int NormalMath(String math, String eval);


    /*
     budgetName is your budget account name
     type is symbol of the mathematical operation to be performed
     num can be negative
     */
    int BudgetMath(String budgetName, String type, int num);

    /*

        Getters and Setters for EconomicMathFunctions

     */

}
