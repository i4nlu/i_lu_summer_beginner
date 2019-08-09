public class privateclasses{
  public static void main(String[] args){
    String str = new String();
    // dog1 is an instance of Dog
    Dog dog1 = new Dog(10,"Brown","Dog1");
    //System.out.println(dog1.age);
    Dog dog2 = new Dog(12,"White","Dog2");
    //System.out.println(dog2.color);
    dog1.bark();
    dog2.bark();

    System.out.println(dog1.get_age());
    //this works for private things because get.age is in the same class as dog1
    System.out.println(dog1.age);
    //but this does not work
  }
}


class Dog{
  //instance variables
  private int age;
  private String color;
  private String name;
  // constructor
  public Dog(int age, String color, String name){
    this.age = age;
    this.color = color;
    this.name = name;
  }
  public void bark(){
    System.out.println("Woof");
  }
  public int get_age(){
    return this.age;
  }
}
