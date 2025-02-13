package com.devops;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Hello and Welcome to the scientific calculator !!!");
            System.out.println("Which operation would you like to perform ? ");
            System.out.println("1. Find the squareroot");
            System.out.println("2. Calculate the factorial of a number");
            System.out.println("3. Find natural log (base e) of a number");
            System.out.println("4. Calculate the x to the power b");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            Calculator calculator = new Calculator();

            if(choice > 5 || choice < 1){
                System.out.println("Exiting program due to wrong choice");
                System.exit(0);
            }
            else if(choice == 1){
                System.out.println("Enter the number : ");
                int number = scanner.nextInt();
                double ans = calculator.squareRoot(number);
                System.out.println("The square root of " + number + " is " + ans);
            }
            else if(choice == 2){
                System.out.println("Enter the number : ");
                int number = scanner.nextInt();
                long ans = calculator.factorial(number);
                System.out.println("The factorial of " + number + " is " + ans);
            }
            else if(choice == 3){
                System.out.println("Enter the number : ");
                double number = scanner.nextDouble();
                double ans = calculator.naturalLog(number);
                System.out.println("The natural log of " + number + " is " + ans);
            }
            else if(choice == 4){
                System.out.println("Enter the number to calculate power of : ");
                double number = scanner.nextDouble();
                System.out.println("Enter the power to calculate : ");
                double power = scanner.nextDouble();
                double ans = calculator.power(number, power);
                System.out.println("The power of " + number + " is " + ans);
            }
            else{
                System.out.println("Exiting program due to wrong choice");
                System.exit(0);
            }
        }
    }
}