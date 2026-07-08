// Question3 
// Ask name as input and greet "Hi (name) . How are you beautiful?"


// importing Scnanner
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args ){
        // seeking input 
        Scanner sc = new Scanner(System.in);
        // asking for name 
        System.out.println("Enter your name:");
        // getting name
        String name= sc.nextLine();
        // Printing the input name
        System.out.println("Hi, " + name + ". How are you beautiful?" );


        sc.close();
    }
    
}
