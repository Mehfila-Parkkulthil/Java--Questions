//Question 5
// Create a program to swap two numbers


import java.util.*;
public class Question5 {
    public static void main (String[] args){
        System.out.println("Hi , lets swap numbers!");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter two numbers a and b");
        System.out.println("Enter a :");
        int a = scanner.nextInt();

        System.out.println("Enter b:");
        int b = scanner.nextInt();

        System.out.println("So by swapping you get");
        int c=a;
         a = b; 
         b = c;

        System.out.println("a as" + a);
        System.out.println("b as " + b);
        

        scanner.close();

    }
    
}
