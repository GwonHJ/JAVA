class GeometricObject{
 GeometricObject() {}
}


class Circle extends GeometricObject{
  private double radius;
  
  public Circle(double radius){ this.radius = radius;}
  public double getArea(){ return radius*radius*Math.PI;}
}


class Rectangle extends GeometricObject{
  private int a;
  private int b;
  
  public Rectangle(int a, int b){
  this.a = a;
  this.b = b;
  }
  public int getArea(){
  return a*b;
  }
}


class Trapezoid extends GeometricObject{
  private int width1;
  private int width2;
  private int height;
  
  public Trapezoid(int width1, int width2, int height){
  this.width1 = width1;
  this.width2 = width2;
  this.height = height;
  }
  public int getArea() {
   return (width1+width2)/2*height;
  }
}


class Diamond extends GeometricObject{
  private int a;
  private int b;
  
  public Diamond(int a, int b){
  this.a = a;
  this.b = b;
  }
  public int getArea(){
  return a/b;
  }
}


class Ellipse extends GeometricObject{
  private int a;
  private int b;

  public Ellipse(int a, int b) {
  this.a = a;
  this.b = b;
  }
  public double getArea() {
  return a*b*Math.PI;
  }
}


public class CastingDemo2 {
  public static void main(String args[]){

  display(new Circle(3.5));
  display(new Rectangle(4,5));
  display(new Trapezoid(4,5,6));
  display(new Diamond(4,5));
  display(new Ellipse(4,5));
}

 public static void display(Object obj){
  if (obj instanceof Circle) {
  System.out.println("The circle area is " + ((Circle)obj).getArea());
  }
  if (obj instanceof Rectangle) {
  System.out.println("The Rectangle area is " + ((Rectangle)obj).getArea());
 }
  if (obj instanceof Trapezoid) {
  System.out.println("The Trapezoid area is " + ((Trapezoid)obj).getArea());
}
  if (obj instanceof Diamond) {
  System.out.println("The Diamond area is " + ((Diamond)obj).getArea());
}
  if (obj instanceof Ellipse) {
  System.out.println("The Ellipse area is " + ((Ellipse)obj).getArea());
}
}
}
 