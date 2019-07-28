public class arrays{
  public static void main(String[] args){

    int a = 2;
    int b = 3;
    int[] intArr = new int[10];
    /*
    [] means array
    intArr is the array name
    new: you have to use that
    the last number: how much space you give to the array
    Zero based indexing:
    the first space in the array is labeled as 0
    */
    System.out.println (intArr[0]);
    intArr[0] = 1;
    intArr[1] = 2;
    intArr[2] = 3;
    //.....
    System.out.println (intArr[0]);
    //set a lot of numbers into the array at once:
    int [] intArr2 = new int []{0,1,2,3,4,5,6,7,8,9};
    System.out.println(intArr2[4]);

    //create a new array of length 20 and fill it with multiples of 2
    // create a new array of length 20 and set every other index to a consecutive number
    int [] intArr3 = new int [20];
    for (int i = 0; i < 20; i++) {
      intArr3[i] = i*2;
      System.out.print (intArr3[i]);
      System.out.print (",");
    }

    int [] intArr4 = new int [20];
    for (int i = 0; i < 10; i++) {
      intArr4[i*2] = i;
      System.out.print (intArr4[i]);
      System.out.print (",");
      System.out.print (intArr4[i+1]);
      System.out.print (",");
    }

    int[] intArrCons = new int[20];
    // create a new array of length 10 and set every other index to a consecutive number
    int y = 0;
    int x = 1;
    while (y < 20){
      intArrCons[y] = x;
      x += 1;
      y += 2;

  }

}
}
