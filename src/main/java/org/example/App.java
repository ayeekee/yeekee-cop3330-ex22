package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Alyssa Yee-Kee
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        int max = 0;

        System.out.print("Enter the first number: ");
        String one = se.nextLine();
        int num1 = Integer.parseInt(one);

        max = num1;

        System.out.print("Enter the second number: ");
        String two = se.nextLine();
        int num2 = Integer.parseInt(two);

        if(max < num2){
            max = num2;
        }

        System.out.print("Enter the second number: ");
        String three = se.nextLine();
        int num3 = Integer.parseInt(three);

        if(max < num3){
            max = num3;
        }

        if(one.equals(two) & two.equals(three) & three.equals(one)){
            System.out.println("Numbers are not different. Goodbye.");
            System.exit(0);
        }

        System.out.println("The largest number is " + max + ".");
    }
}