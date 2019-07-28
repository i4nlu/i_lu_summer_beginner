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

public class q4 {
  public static void main (String [] args) {
    int x = 10297;
    baseconversion(x);
  }
  public static void baseconversion(int x) {
    int digitcount = 1;
    int y=x;
      while (y>1) {
        y=y/2;
        digitcount++;
      }

    int totaldigits = digitcount;
    int[] digits = new int[digitcount];

      for (int i=0; i<totaldigits; i++) {
        int m=exponent(2,digitcount);
        digits[digitcount-1]=x/m;
        System.out.print(digits[digitcount-1]);
        x=x-(m*digits[digitcount-1]);
        digitcount--;
      }
    System.out.println("");

  }

  public static int exponent(int base, int power) {
    int total=1;
      while (power>1) {
        total=total*base;
        power--;
      }
    return total;
  }
}

/*
while (exponentlevel>0); {
  m = m*2;
  exponentlevel=exponentlevel-1;
}
*/
