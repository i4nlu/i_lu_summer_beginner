/*
Homework Questions:
Write code the performs the following functions using both for and while loops:

Prints out all the even numbers from 50 to 100 (inclusive)
Sums the numbers from 1 to 10 and prints out the sum one time in the end.
Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
Prints out all numbers that are either multiples of 3 or multiples of 4, but not both. (a bit challenging)
HARD: Prints out the fibonacci numbers (If you don't know what they are you should google it!)
*/
public class question3 {
    public static void main(String args[]){
         for(int i=5; i<101; i=i+5){
           int k = i;
           int j = i;
           k-=1;
           int m = k;
           m = m%2;
           m=m+1;
           if (m<2){
           System.out.println(k);
         }
           j+=1;
           int n = j;
           n = n%2;
           n=n+1;
           if (n<2){
           System.out.println(j);
         }
         }

    }
}
