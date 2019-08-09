public class strings{
  public static void main (String[] args){
    // int[] <- integer array
    // String[] <- String array
    /*
    strings are just words or a combination of characters
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
    int[] intarr1 = new int [5];
    int[][] int_arr_2 = new int[5][5];
    int[] line = new int[]{1,2,3,4,5};
    int[][] grid = new int[][]{
                                {1,2,3,4,5},
                                {6,7,8,9,10},
                                {11,12,13,14,15},
                                {16,17,18,19,20},
                                {21,22,23,24,25}
                              };
                              //these are 2d arrays
    System.out.println(line.length);
    System.out.println("abc"+1);
    System.out.println(grid.length);


    for (int i = 0; i < grid.length; i++){
      for (int j = 0; j <grid.length; j++){
        System.out.print(grid[i][j]+" ");
      }
      System.out.println(" ");
    }
    for (int i = 0; i < grid.length; i++){
       System.out.println(grid[i]+" ");
    }
    for (int b = 0; b < grid.length; b++){
      for (int a = 0; a < grid[0].length; a ++){
        System.out.print(grid[b][a]);
        System.out.print(" ");
      }
      System.out.println();
    }

  }
}
