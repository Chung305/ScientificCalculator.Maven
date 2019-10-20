package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }


    /////Prompt Functions///
    /////////////////////////
     public static int corePrompt(){
        int response = Console.getIntegerInput("What sup bitch! what do you want \n" +
                "Choose your option: \n" +
                "1 - Addition \n" +
                "2 - Subtraction \n" +
                "3 - Multiplication \n" +
                "4 - Division \n" +
                "5 - Exponential \n" +
                "6 - Square \n" +
                "7 - Square Root \n" +
                "8 - Inverse \n" +
                "9 - Scientific Calculator \n" +
                "10 - Turn off Calculator \n");

        return response;
     }

    public static double promptAdd(){
        CoreFeatures basic = new CoreFeatures();
        double x;
        double y;

        x = Console.getDoubleInput("What is your X value?");
        y = Console.getDoubleInput("What is your Y value?");
        Console.print("\n" + x + " + " + y + " = ");
        return basic.addition(x,y);
    }

    public static double promptSubtract(){
        CoreFeatures basic = new CoreFeatures();
        double x;
        double y;

        x = Console.getDoubleInput("What is your X value?");
        y = Console.getDoubleInput("What is your Y value?");
        Console.print("\n"+ x + " - " + y + " = ");
        return basic.subtraction(x,y);
    }

    public static double promptMultiply(){
        CoreFeatures basic = new CoreFeatures();
        double x;
        double y;

        x = Console.getDoubleInput("What is your X value?");
        y = Console.getDoubleInput("What is your Y value?");
        Console.print("\n"+ x + " * " + y + " = ");
        return basic.multiplication(x,y);
    }

    public static double promptDivide(){
        CoreFeatures basic = new CoreFeatures();
        double x;
        double y;

        x = Console.getDoubleInput("What is your X value?");
        y = Console.getDoubleInput("What is your Y value?");
        Console.print("\n"+ x + "/" + y + " = ");
        return basic.division(x,y);
    }

    public static double promptExponent(){
        CoreFeatures basic = new CoreFeatures();
        double x;
        double y;

        x = Console.getDoubleInput("What is your X value?");
        y = Console.getDoubleInput("What is your Y value?");
        Console.print("\n" + x + " ^" + y + " = ");
        return basic.exponentiation(x, y);
    }

    public static double promptSquare(){
        CoreFeatures basic = new CoreFeatures();
        double x;

        x = Console.getDoubleInput("What is your X value?");
        Console.print("\n" + x + " ^2" + " = ");
        return basic.square(x);
    }

    public static double promptSquareRoot(){
        CoreFeatures basic = new CoreFeatures();
        double x;

        x = Console.getDoubleInput("What is your X value?");
        Console.print("\n SquareRoot(" + x + ")" +" = ");
        return basic.squareRoot(x);
    }

    public static double promptInverse(){
        CoreFeatures basic = new CoreFeatures();
        double x;

        x = Console.getDoubleInput("What is your X value?");
        Console.print("\n 1/" + x + " = ");
        return basic.inverse(x);
    }


}
