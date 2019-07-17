/*
Homework Questions:
Write code the performs the following functions using both for and while loops:

Prints out all the even numbers from 50 to 100 (inclusive)
Sums the numbers from 1 to 10 and prints out the sum one time in the end.
Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
Prints out all numbers that are either multiples of 3 or multiples of 4, but not both. (a bit challenging)
HARD: Prints out the fibonacci numbers (If you don't know what they are you should google it!)
*/
public class question4 {
    public static void main(String args[]){
      int j=4;
         for(int i=3; i<1000000; i=i+3){
           //I designed it to only run up to the first 1 million multiples of 3 and 4 or else it would an infinite loop and would break my computer
           int m=i%4;
           if (m>0) {
             System.out.println(i);
           }
           j+=4;
           int n=j%3;
           if (n>0) {
            System.out.println(j);
          }
         }

    }
}
