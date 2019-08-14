public class superarrayhw{
  public static void main(String[] args){
    String[] data = new String [10];
    clear(data);
    add(data, "yeet");

  }

  public static void clear (String[] data) {
    for (int i = 0; i < data.length; i++) {
      data[i] = "";
    }
  }

  public static int size (String[] data) {
    return data.length;
  }

  public static boolean isEmpty (String[] data) {
    if (data.length = 0) {
      return true;
    }
    return false;
  }

  public static boolean add(String[] data, String added) {
    if (data[data.length()-1]!==0){
      int x = data.length();
      String[] data = new String [x+1];
      data[x]=added;
    }
  return true;
  }


}
