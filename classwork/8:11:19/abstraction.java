public class abstraction{
  public static void main(String[] args){
    /*
    inheritance
    encapsulation
    abstraction
      - abstract classes
      -interfaces
    polymorphism
    */

    Bird bird1 = new Bird();
    bird1.move();
    Velociraptor velociraptor1 = new Velociraptor();
    velociraptor1.move();
    velociraptor1.label();


    Eagle bird1 = new Eagle();

    // abstract classes

    //abstract class Animal{
    //  abstract void move();
    //  public void label(){
      //  System.out.println("I am an animal");


  }


}


//abstract classes: You don't have to define move inside of the class

class Bird extends Animal{
  public void move(){
    System.out.println("moves by flying");
  }
}
class Velociraptor extends Bird{
    public void move(){
      System.out.println("moves in a diagonal menacingly");
    }
  }

  interface Animal{
    public void eat();
    public void sound();
  }

  interface Bird{
    public void fly();
  }


  class Eagle implements Animal,Bird{
    public void eat() {
      System.out.println("Eats reptiles and amphibians.");
    }
    public void sound() {
      System.out.println("Has a high-pitched whistling sound.");
    }
    public void fly() {
      System.out.println("Flies up to 10,000 feet.");
    }
  }
