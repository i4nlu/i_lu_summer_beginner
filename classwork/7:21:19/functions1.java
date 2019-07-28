public class functions1 {
  public static void main(String [] args) {
    System.out.println(sumOfNums());
    int x = sumOfnums();
    System.out.println(x);
  }
  //sumOfNums is a function
      //public means the function can also be used by other files
      //int replaced by the type of variable you want to return, or void if you dont want to return anything
  public static int sumOfNums(){
    int total = 0;
    for (int i = 0; i < 8; i++){
      total += i;
    }
    return total;
  }
}
