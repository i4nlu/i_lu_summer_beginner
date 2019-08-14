public class abstraction2{
  public static void main(String[] args){
    /*
    inheritance
    encapsulation
    abstraction
      - abstract classes
      -interfaces
    polymorphism
    */

    Eagle bird1 = new Eagle();
    bird1.sound();
    bird1.fly();
    //Animal animal1 = new Animal();
    /*
    Bird is not abstract and does not override abstract method move() in Animal

    Animal is abstract; cannot be instantiated
    */
  }


}

//interfaces can be made of ONLY abstract functions!

interface Animal{
  public void eat();
  public void sound();
}

interface Bird{
  public void fly();
  public void label();
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
  public void label() {
    System.out.println("I am an eagle.");
  }
	}
