package com.pluralsight;
import java.util.*;
class CalculatorApp
{
    public static void main(String[] args) {
// Need to specify integer values
        Scanner keyBoard = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        float num1 = keyBoard.nextFloat();
        System.out.print("Enter your second number: ");
        float num2 = keyBoard.nextFloat();
//Must remember to rename the new scanner
        // ALSO!!! don't forget to leave blank space for answer <3
        System.out.print("");
                System.out.println("Functions include: \n  (S)ubtract  \n  (A)dd  \n  (M)ultiply  \n  (D)ivision \n Choose your function: ");
                String giveAnswer = keyBoard.nextLine();
                String action = keyBoard.nextLine();
                System.out.println(num1 * num2);
                //it's not elegant but it's semi-functional. Which is exactly how coding works right?
        //note, be more elegant next time.

    }


}