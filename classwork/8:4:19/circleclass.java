//what's a circle? well...

public class circleclass {
  public static void main (String[] args) {
    Circle circle1 = new Circle(6, "red");
    System.out.println(circle1);
    System.out.println(circle1.getArea());
  }
}

class Circle {
  private double radius;
  private String color;
  public Circle (double radius, String color) {
    this.radius = radius;
    this.color = color;
  }
  public Circle (double radius) {
    this.radius = radius;
  }
  public Circle () {
  }
  public double getRadius(){
    return this.radius;
  }
  public void setRadius (double radius){
    this.radius = radius;
  }
  public String getColor(){
    return this.color;
  }
  public void setColor (String color){
    this.color = color;
  }
  public String toString (){
    return "Circle[radius="+this.radius+", color="+this.color+"]";
  }
  public double getArea (){
    return Math.PI*this.radius*this.radius;
  }
  public double getCircumference (){
    return Math.PI*this.radius*2;
  }
}
