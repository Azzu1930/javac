// java program that represents Rectangle information
class Rectangle{
    double length;
    double width;
public Rectangle(){
     this.length=0.0;
     this.width =0.0;
}
public Rectangle(double length,double width){
       this.length = length;
       this.width= width;
}
public double getArea()
{
       return length * width;
}
public double getPerimeter()
{
     return 2 *(length+width);
}
}
public class RectangleDemo{
      public static void main(String[]args)
      {
        Rectangle r1= new Rectangle();
        System.out.println("Rectangle1 Details:"  +r1.getArea() + r1.getPerimeter());
        Rectangle r2 = new Rectangle(78,56);
        System.out.println("Rectangle2 Details: " + r2.getArea() + r2.getPerimeter());
      }
}

             
       
