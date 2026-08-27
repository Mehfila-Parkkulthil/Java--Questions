//Question 65
// Create a program to find sum and average of all elemeents in an array using fuction

public class Question65{
  public static void main(String[]args){
    int[] arr = {1,2,3,4,5,7,8,4,8,3,7,3,2,87,4,44};
    long sum = findSum(arr);
    double average = findAverage(arr);
    System.out.println("Sum is " + sum);
    System.out.println("Average is "+ average);
  }

  public static long findSum(int arr[]){
    long add = 0;
    for(int i =0;i<arr.length;i++){
      add+=arr[i];
    }
    return add;
  }

  public static double findAverage(int arr[]){
    long avg = findSum(arr);
    double average = (double)avg / arr.length;
    return average;
  }
}
// double average = (double) avg / arr.length;
// Why? Because otherwise Java does integer division first and removes the decimal part.
// 193 / 16 → 12       ❌
// 193.0 / 16 → 12.0625 ✅