public class beginner{
  public static void main(String[] args){
    // int[] <- integer array
    // String[] <- String array
    /*
    strings are just words or a combination of characters
    characters in Java are primitives types 'a', 'b', 'e'
    Strings in Java are Object types "Hello World"
    */
    String[] str_array = new String[10];
    // str_array => ["test","hello","testing"]
    // when we run the program , we first have to compile it
    // then after, we run it , we can also give it parameters
    // javac ____.java
    // java _____ awef wefeg 2334 awfef
    /*
    args is just the name of the string str_array
    */
    System.out.println(args[0]);
    System.out.println("This is a test");
    System.out.println(getSum(3,10));
  }
  public static int getSum(int a, int b){
    int total = 0;
    for (int i = a; i < b; i++){
      total += i;
    }
    return total;
  }
}
