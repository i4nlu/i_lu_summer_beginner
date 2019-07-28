/*
For 7/21/19

Homework Questions: Write code into FUNCTIONS that does the following:

Given a defined variable of score in the beginning, print out a grade of F is the grade is between 1 to 60 (inclusive), D if its from 61 to 70 (inclusive), C if its from 71-80 (inclusive), B if its from 81-90 (inclusive), and A if its from 91-100 (inclusive).
Prints out all numbers that are either multiples of 3 or multiples of 4, but not both.
Write a program that takes three integer command-line arguments a, b, and c and print the number of distinct values (1, 2, or 3) among a, b, and c.
Write code that takes a integer in base 10 and turns the number into binary and prints it out in the end.
Write a program that takes five integer command-line arguments and prints the median (the third largest one)
MAKE SURE YOUR CODE IS INDENTED PROPERLY
*/
public class q5 {
  public static void main (String []args) {
    sort(54,54,22,44,31);
  }
  public static void sort (int a, int b, int c, int d, int e) {

  int[] numbers = new int[]{a,b,c,d,e};
  int m=4;
    for (int j=0; j<4; j++) {
      for (int i=0; i<m; i++) {
        if (numbers[i]>numbers[i+1]){
          int t=numbers[i];
          numbers[i]=numbers[i+1];
          numbers[i+1]=t;
        }
      }
      m--;
    }
    for (int k=0; k<5; k++) {
      System.out.println(numbers[k]);
    }

  }

}
