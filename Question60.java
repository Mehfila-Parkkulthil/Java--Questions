//Question 60
//Array Creation

import java.util.*;

public class Question60{
public static void main (String a[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Lets create an array marks of 10 student");
  int[] marks = new int[10];
  
  //lets collect marks from user
  int i =0;
  while(i<marks.length){
    System.out.print("Enter student " + (i+1) +  " mark : ");
    marks[i] =sc.nextInt();
    i++;
  }
    printArray(marks);
  }

  public static void printArray(int marks[]){
    for(int i=0;i<marks.length;i++){
      System.out.print(marks[i]+" ");
    }
  }

}

