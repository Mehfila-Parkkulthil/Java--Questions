//Question61
//Array Searching and capturing at all position to check repetition

import java.util.Scanner;

public class Question61{
  public static void main(String[]args){
    System.out.println("Array Searching");
    int[] num ={2,44,35,66,33,66,22,45,22,66,12,98,12,55,22,52,22,12};
    double[] decimal = {12.5,22.5,22,77.3,20.2,89.7,56.8};
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the integer number you are searching for:");
    int number = sc.nextInt();
    ArraySearch(num,number);
    System.out.println("Enter the decimal number you are searching for:");
    double dec_num =sc.nextDouble();
    ArraySearch(decimal,dec_num);
  }

  public static void ArraySearch(int num[],int number){
    for(int i=0;i<num.length;i++){
      if(number==num[i]){
        System.out.println("Found at position "+ (i+1) + " : "  + number);
      }else{
       System.out.println("Not found");
      }
    }
  }
  public static void ArraySearch(double decimal[],double dec_num){
     for(int i=0;i<decimal.length;i++){
      if(decimal[i]==dec_num){
        System.out.println("Found at position "+ (i+1) + " : "  + dec_num);
      }else{
        System.out.println("Not found");
      }
    }
  }
}