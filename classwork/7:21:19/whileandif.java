//this is a test

public class lesson2{
  public static void main(String[] args){
    //Prints out all the even numbers from 50 to 100 (inclusive)
    for (int i = 50 ; i <= 100; i +=2){
      System.out.println(i);
    }
    //Sums the numbers from 1 to 10 and prints out the sum one time in the end.
    int total = 0;
    for (int i = 1; i <= 10; i++){
        total += i;
        // total = total + i
    }
    System.out.println(total);

    //Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.
    for (int i = 5; i<= 100; i+=10){
      System.out.println(i-1);
      System.out.println(i+1);
    }

    // fib solution
    int f1 = 0;
    int f2 = 1;
    for(int g = 0; g < 21; g++){
      f1 = f1 + f2;
        f2 = f1 + f2;
        System.out.println(f1);
        System.out.println(f2);


        }


int j = 0;
while (j<10) {
System.out.println(j);
j++;
}

// when you use for-loops you know exactly when you're going to stop looping
// If you're unsure about when to stop looping, you use a while loop

//Prints out every even number that is one more or one less than a multiple of 5 from 1 to 100 inclusive.

int k = 5;
while (k <= 100){
  System.out.println(k+1);
  System.out.println(k-1);
  k += 10;
}

int a = 20;
if (a == 10){
  System.out.println("a is 10");
}
else{
  System.out.println("a is not 10");
}

if (a < 0) {
  System.out.println("a is negative");
}
else if (a <= 10) {
  System.out.println("a is a smol number");
}
else{
  System.out.println("a is a hueg number");
}

//Conditionals (if statements and a bunch of other stuff)
// = <-this equal sign means assignment
// == this equal sign checks to see if the values are equal
// != <- not equals
/*
if (a != 10) {
  System.out.println("a is not 10");
}
else if= exactly what is says on the tin
 */

  }
}
