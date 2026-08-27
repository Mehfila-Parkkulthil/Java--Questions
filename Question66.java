//Question 66
//Create a program to find the no of occurances of an element in an array

import java.util.Scanner;

public class Question66{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] numbers={1,2,44,22,55,33,22,33,22,11,33,55,22,33,11,2,9,6,7,4,11,11,22,44,21};
    System.out.println("Enter the number you want to check:");
    int random = sc.nextInt();
    int numOftimes=0;

    System.out.println("-------------------");
    for(int i =0;i<numbers.length;i++){
      if(numbers[i]==random){
        System.out.println("The number " + random +" is found at " + (i+1) + "th position");
        numOftimes++;
        }
      }
      System.out.println("---------------------");
      System.out.println("Therefore, the number " + random + " occured " + numOftimes + " times." );


    }
  }
