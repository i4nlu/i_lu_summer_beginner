public class objects4{
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

    Dog dog3 = new Dog(7,"Black");
    dog3.set_name("Dog3");
    System.out.println(dog3.get_name());

    System.out.println(dog3);
    /* values printed
    Dog@7852e922
    Dog@4b1210ee
    Dog@4aa298b7
    Dog@4b1210ee
    Dog@4b1210ee
    ^ These values specify where in locatino the object is stored
    */
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
  public Dog(int age, String color){
    this.age = age;
    this.color = color;
  }
  public void set_name(String name){
    this.name = name;
  }
  public void bark(){
    System.out.println("Woof");
  }
  public int get_age(){
    return this.age;
  }
  public String get_color(){
    return this.color;
  }
  public String get_name(){
    return this.name;
  }
  public String toString(){
    return "My name is "+ this.name;
  }
  //if you name this toString then it will be considered a main function and it will be called whenever you run the program
  //if not it will just print out doggo's location

}
