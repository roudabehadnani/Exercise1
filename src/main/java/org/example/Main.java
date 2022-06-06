package org.example;

import java.util.Scanner;
import java.util.Random;


public class Main {


    public static void main(String[] args) {

        //1.Write a Java program to print 'Hello' on screen and then print your name

        System.out.println("Task 1: ");
        System.out.print("Hello\n");
        System.out.print("Roudabeh!\n");
        System.out.print("\n");


        //2.Leap year or not

        System.out.println("Task 2: ");
        Scanner inputYear = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = inputYear.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        System.out.print("\n");


        //3.Print the sum/multiplication/division and subtraction of two numbers

        System.out.println("Task 3: ");
        int a = 45, b = 11, c = 12, d = 4, e = 24, f = 6, g = 55;
        int sum = a + b;
        int multiplication = c * d;
        int division = e / f;
        int subtraction = g - c;
        System.out.println("sum = " + sum);
        System.out.println("multiplication = "+ multiplication);
        System.out.println("division = " + division);
        System.out.println("subtraction = " + subtraction);
        System.out.print("\n");


        //4.Prints the average of three numbers

        System.out.println("Task 4: ");
        int number1 = 23 , number2 = 11 , number3 = 77;
        int average = ((number1 + number2 + number3) /3);
        System.out.println("average = " + average);
        System.out.print("\n");


        //5.Create a program that asks user to input his/her name

        System.out.println("Task 5: ");
        Scanner inputName = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = inputName.nextLine();
        System.out.println("Hello" + " " + name);
        System.out.print("\n");


        //6.Input two numbers and print the sum/multiplication/division and subtraction of given numbers

        System.out.println("Task 6: ");
        Scanner inputNum = new Scanner(System.in);
        System.out.print("Input the first number: ");
        float num1 = inputNum.nextFloat();
        System.out.print("Input the second number: ");
        float num2 = inputNum.nextFloat();
        System.out.println("sum = " + (num1 + num2));
        System.out.println("subtraction = " + (num1 - num2));
        System.out.println("multiplication = " + (num1 * num2));
        System.out.println("division = " + (num1 / num2));
        System.out.print("\n");


        //7.Convert seconds to hours, minutes and seconds

        System.out.println("Task 7: ");
        Scanner inputSecond = new Scanner(System.in);
        System.out.print("Input the second: ");
        int totalSecond = inputSecond.nextInt();
        int hour = totalSecond / 3600;
        int remain = totalSecond % 3600;
        int minute = remain / 60;
        int second = remain % 60;
        System.out.println(hour + ":" + minute + ":" + second);
        System.out.print("\n");


        //8.Random number between 1 and 500

        System.out.println("Task 8: ");
        Random randomNum = new Random();
        int max = 500;
        int min = 1;
        int randomNumber = min + randomNum.nextInt(max);
        boolean isFalse = true;
        while (isFalse) {
            Scanner scanner7 = new Scanner(System.in);
            System.out.print("guess one number between 1 and 500: ");
            int guessNum = scanner7.nextInt();
            if (guessNum > randomNumber) {
                System.out.println("Your guess was too big");

            } else if (guessNum < randomNumber) {
                System.out.println("Your guess was too small");

            } else {
                System.out.println("Your guess was true :) ");
                isFalse = false;
            }
        }
        System.out.println("random number was: " + randomNumber);
    }
}