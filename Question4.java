//Question 4
// Create a program to add two numbers 

import java.util.Scanner;
public class Question4{
    public static void main(String[]args){

        System.out.println("Lets add two numbers!");

        // Seeking 2 numbers 
        System.out.println("Enter your first number:");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter your second number:");
        int second = sc.nextInt();

        // sum of 2 numbers 
        int sum = first + second;
        System.out.println("Therefore, sum of your 2 numbers is " + sum);

        sc.close();
    }
}