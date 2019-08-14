public class polymorphism{
  public static void main(String[] args){
    /*

    polymorphism
      - static polymorphism
      - dynamic polymorphism
    */

    Bird bird1 = new Bird();
    bird1.fly();
    bird1.fly(10);
    bird1.fly("Eagle",15);
  }


}
//static polymorphism
class Bird{
  public void fly(){
    System.out.println("this bird is flying");
  }
  public void fly(int height){
    System.out.println("this bird is flying at " + height + " feet");
  }
  public void fly(String name , int height){
    System.out.println("this " + name + " is flying at " + height + " feet");
  }
}
