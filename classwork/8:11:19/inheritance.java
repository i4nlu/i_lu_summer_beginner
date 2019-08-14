public class inheritance{
  public static void main(String[] args){

    /*
    inheritance
    encapsulation
    abstraction
    polymorphism
    */

    Eagle bird1 = new Eagle();
    System.out.println(bird1.name);
    System.out.println(bird1.reproduction);
    System.out.println(bird1.lifespan);

  }


}


/*
inheritance: You can have one class that is part of another class.
ie Eagle inherits Bird. It contains all the methods and properties of Bird:
*/

class Bird{
  public String reproduction = "egg";
  public String outercovering = "feather";
  public void flyUp(){
    System.out.println("Flying up...");
  }
  public void flyDown(){
    System.out.println("Flying down...");
  }

}

class Eagle extends Bird{
  public String name = "Eagle";
  public int lifespan = 15;

}
