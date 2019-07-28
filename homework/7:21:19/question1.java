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

public class question1{
  public static void main (String[] args){
    int score = 55;
    grading(score);
  }
//it passes 1 to int a and 9 to int b
//return sends total back and x = the return of sumOfNums
  public static int grading(int a){
    if (a<=60) {
      System.out.println ("F");
    }
    else if (a<=70) {
      System.out.println ("D");
    }
    else if (a<=80) {
      System.out.println ("C");
    }
    else if (a<=90) {
      System.out.println ("B");
    }
    else if (a<=100) {
      System.out.println ("A");
    }
    else {
      System.out.println ("You have gotten a grade greater than 100, you are a true ling ling");
    }

  return a;

    }

}
