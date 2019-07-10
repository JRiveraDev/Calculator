package org.runnerer.calculator;

import java.util.Scanner;

public class Calculator  {

    public static void main(String args[])
    {
        double a;
        double b = 0;
        double c = 0;

        Scanner javaScanner = new Scanner(System.in);
        System.out.print("Please enter your first equation number. ");

        a = javaScanner.nextDouble();

        Scanner operScanner = new Scanner(System.in);
        System.out.print("Would you like to square this number? (y/n) ");

        if (operScanner.next().equalsIgnoreCase("y"))
        {
            b = a * a;

            System.out.print("Your answer is: " + b);
            return;
        } else
        {
            Scanner javaScanner2 = new Scanner(System.in);
            System.out.print("Please enter your second equation number. ");

            b = javaScanner.nextDouble();
        }

        Scanner operaScanner = new Scanner(System.in);
        System.out.print("What operation would you like to be done? ( + / - / x / / ) ");

        String operation = operaScanner.next();

        if (operation.equalsIgnoreCase("+"))
        {
            c = a + b;
        } else if (operation.equalsIgnoreCase("-"))
        {
            c = a - b;
        } else if (operation.equalsIgnoreCase("x"))
        {
            c = a * b;
        } else if (operation.equalsIgnoreCase("/"))
        {
            if (b == 0)
            {
                System.out.print("Impossible operation! :o");
                return;
            }
            c = a / b;
        }

        System.out.print(c);

    }
}