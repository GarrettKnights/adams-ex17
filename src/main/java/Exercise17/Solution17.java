/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Garrett Adams
 */


package Exercise17;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        int gender;
        double oz = 16;
        double weight;
        double time;
        double alcdist;

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        //Scans input to gender
        gender=ScanWord.nextInt();
        //Asks user for input
        System.out.println("How many ounces of alcohol did you have? ");
        //Scans input to oz
        oz=ScanWord.nextDouble();
        //Asks user for input
        System.out.println("What is your weight, in pounds? ");
        //Scans input to weight
        weight=ScanWord.nextDouble();
        System.out.println("How many hours has it been since your last drink? ");
        //Scans input to time
        time=ScanWord.nextDouble();


        //If male
        if (gender == 1) {
            alcdist = 0.73;
        }

        //If female
        else {
            alcdist = 0.66;
        }

        //Calculates BAC
        double BAC = (oz * 5.14/ weight * alcdist) - 0.015 * time;
        System.out.println("Your BAC is " + BAC);

        //If legal
        if (BAC <= 0.08){
            System.out.println("It is legal for you to drive");
        }
        //if not legal
        else {
            System.out.println("It is not legal for you to drive");
        }

    }
}
