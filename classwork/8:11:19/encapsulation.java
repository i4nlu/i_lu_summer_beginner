public class beginner{
  public static void main(String[] args){


    Eagle bird1 = new Eagle();
    System.out.println(bird1.getName());    // Eagle
    System.out.println(bird1.getReproduction()); // Egg
    bird1.flyUp(); // Flying up...
    bird1.flyDown();
  }


}
//encapsulation
class Bird{
  private  String reproduction = "egg";
  private String outercovering = "feather";
  public void flyUp(){
    System.out.println("Flying up...");
  }
  public void flyDown(){
    System.out.println("Flying down...");
  }
  public String getReproduction(){
    return reproduction;
  }

}

class Eagle extends Bird{
  private String name = "Eagle";
  private int lifespan = 15;
  public String getName(){
    return name;
  }
}
