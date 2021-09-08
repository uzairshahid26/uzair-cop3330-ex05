/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Muhammad Uzair
 */

package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String num1String = scanner.nextLine();
        int num1 = 0;
        boolean input = false;
        if(!input) {
            if (isNumeric(num1String)) {
                num1 = Integer.parseInt(num1String);
                input = true;
            } else {
                System.out.print("Please enter DIGITS ONLY: ");
                num1String = scanner.nextLine();
                num1 = Integer.parseInt(num1String);
                input = true;
            }
        }

        System.out.print("What is the second number? ");
        String num2String = scanner.nextLine();
        int num2 = 0;
        input = false;
        if(!input) {
            if (isNumeric(num2String)) {
                num2 = Integer.parseInt(num2String);
                input = true;
            } else {
                System.out.print("Please enter DIGITS ONLY: ");
                num2String = scanner.nextLine();
                num2 = Integer.parseInt(num2String);
                input = true;
            }
        }
        System.out.println(num1 + " + " + num2 +  " = " + add(num1,num2) + "\n");
        System.out.println(num1 + " - " + num2 +  " = " + subtract(num1,num2) + "\n");
        System.out.println(num1 + " * " + num2 +  " = " + multiply(num1,num2) + "\n");
        System.out.println(num1 + " / " + num2 +  " = " + divide(num1,num2) + "\n");
    }

// calculations
    private static int add(int num1, int num2) {
        return num1 + num2;
    }

    private static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    private static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    private static int divide(int num1, int num2) {
        return num1 / num2;
    }

    private static boolean isNumeric(String input) {
        if(input.chars().allMatch(Character::isDigit)) {
            return true;
        }

        return false;


    }
}
