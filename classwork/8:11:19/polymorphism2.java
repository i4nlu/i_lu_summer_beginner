public class polymorphism2{
  public static void main(String[] args){
    /*

    polymorphism
      - static polymorphism
      - dynamic polymorphism
    */
    Animal animal1 = new Animal();
    animal1.eat();
    Bird bird1 = new Bird();
    bird1.eat();
    Animal a1 = new Bird();
    a1.eat(); //this bird eats seeds
    //but a1 is still an Animal type object!
    Animal a2 = new Dog();
    a2.eat();
    int[] arr = new int[10];
    Animal[] animal_arr = new Animal[10];

    Dog dog1 = new Animal();  //This is illegal! Dog cannot be converted to Animal, since Dog inherits Animal
    //i can store both a1 and a2 into the animal array
    //but they both retain the properties of bird and dog, respectively
  }


}
//dynamic polymorphism
class Animal{
  public void eat(){
    System.out.println("this animal eats insects");
  }
}

class Bird extends Animal{
    // this function overrides the function defined in the parent
  public void eat(){
    System.out.println("this bird eats seeds");
  }
}

class Dog extends Animal{
  public void eat(){
    System.out.println("this dog eats meat");
  }
}
