public class morethings{
  public static void main(String[] args){
    Holder<String> h1 = new Holder<String>();
    h1.setValue("Test");
    System.out.println(h1.returnValue());

    Holder<Integer> h2 = new Holder<Integer>();
    h2.setValue(10);
    System.out.println(h2.returnValue());
  }
}


class Holder<T>{
  private T value;
  public T returnValue(){
    return value;
  }
  public void setValue(T value){
    this.value = value;
  }
}
