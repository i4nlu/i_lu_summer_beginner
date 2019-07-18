/*
Homework Questions:
Write code the performs the following functions using both for and while loops:

Prints out all the even numbers from 50 to 100 (inclusive)
Sums the numbers from 1 to 10 and prints out the sum one time in the end.
Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
Prints out all numbers that are either multiples of 3 or multiples of 4, but not both. (a bit challenging)
HARD: Prints out the fibonacci numbers (If you don't know what they are you should google it!)
*/
public class question4improved {
    public static void main(String args[]){
         for(int i=1; i<1000000; i++){
           //I designed it to only run up to the first 1 million multiples of 3 and 4 or else it would an infinite loop and would break my computer
            int m=0;
            int n=0;
            int j=i%3;
            if (j>0){
              m+=1;
            }
            int k=i%4;
            if (k>0){
              n+=1;
            }
            int p=m+n;
            if (p==1){
              System.out.println(i);
            }
//More thorough than my 1st method of coding question 4; counts differently
         }

    }
}
