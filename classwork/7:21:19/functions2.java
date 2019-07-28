public class lesson23{
  public static void main (String[] args){
int x = sumOfNums(1,9);
System.out.println(x + 2);
  }
//it passes 1 to int a and 9 to int b
//return sends total back and x = the return of sumOfNums
  public static int sumOfNums(int a , int b){
    int total = 0;
    for (int i = a; i < b; i++){
      total += i;
    }
    return total;
  }

}

//variables can equal different things in different functions
//"everything in a brace can see everything else inside the brace but nothing outside of it, unless it's a global variable"
