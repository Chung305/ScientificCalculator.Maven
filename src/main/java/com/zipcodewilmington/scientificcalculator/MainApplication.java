package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        //String s = Console.getStringInput("Enter a string");
        //Integer i = Console.getIntegerInput("Enter an integer");
        //Double d = Console.getDoubleInput("Enter a double.");

        //Console.println("The user input %s as a string", s);
        //Console.println("The user input %s as a integer", i);
        //Console.println("The user input %s as a d", d);


        /*
        * class creation variables
        * */
        ////////////////////////
        boolean turnOn = true;
        int toDo;

        while(turnOn){
            toDo = Console.corePrompt();

            switch (toDo) {
                case 1 :
                    System.out.println(Console.promptAdd());
                    Console.println("");
                    break;
                case 2 :
                    System.out.println(Console.promptSubtract());
                    Console.println("");
                    break;
                case 3 :
                    System.out.println(Console.promptMultiply());
                    Console.println("");
                    break;
                case 4 :
                    System.out.println(Console.promptDivide());
                    Console.println("");
                    break;
                case 5 :
                    System.out.println(Console.promptExponent());
                    Console.println("");
                    break;
                case 6 :
                    System.out.println(Console.promptSquare());
                    Console.println("");
                    break;
                case 7 :
                    System.out.println(Console.promptSquareRoot());
                    Console.println("");
                    break;
                case 8 :
                    System.out.println(Console.promptInverse());
                    Console.println("");
                    break;
                case 9 :
                    ///////SWITCH TO SCIENTIFIC CALCULATOR/////////
                    //////////////////////////////////////////////
                    break;
                case 10 :
                    turnOn = false;
                    Console.println("");
                     break;
                default :
                    System.out.println("\nNot an option\nPlease try again\n");
                    break;

            }

        }



    }
}
