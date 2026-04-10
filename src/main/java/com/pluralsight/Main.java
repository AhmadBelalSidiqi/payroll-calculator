package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring Variable
        String name;
        double  hoursWorked;
        double payRate;
        double grossPay;
        double  overTimePay;
        Scanner scanner = new Scanner(System.in);

        // Input for Name , Pay rate , Hours Worked
        System.out.println("What is your name: ");
        name = scanner.nextLine();
        System.out.println("How many hours you worked: ");
        hoursWorked = Double.parseDouble(scanner.nextLine());
        System.out.println("How much is your pay rate: ");
        payRate = Double.parseDouble(scanner.nextLine());

        // Using if statement to check for overtime
        if (hoursWorked >40){
        // if true  -> hours more than 40 will be paid 1.5X of Pay rate.
            overTimePay = 40*payRate+(1.5*payRate*(hoursWorked-40));
            System.out.printf("hello %s , Your gross pay is :$%.2f",name , overTimePay);
        } else {
        // if false -> regular calculation hours * pay rate.
            grossPay = hoursWorked * payRate;
            System.out.printf("hello %s Your gross pay is :$%.2f",name,grossPay);
        }



    }
}
