public class objects2{
  public static void main(String[] args){
    String str = new String();
    // dog1 is an instance of Dog
    Dog dog1 = new Dog(10,"Brown","Dog1");
    System.out.println(dog1.age);
  }
}


class Dog{
  //instance variables
  int age;
  String color;
  String name;
  // constructor
  public Dog(int age, String color, String name){
    this.age = (age+1);
    this.color = color;
    this.name = name;
  }
}
