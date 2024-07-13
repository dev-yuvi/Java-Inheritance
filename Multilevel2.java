import java.util.*;
class Shape{
    int area;
    public int getArea(int area)
    {
        return area;
    }
}
class Rectangle extends Shape
{
    public int getArea(int length,int width)
    {
        super.getArea(area); 
        return length*width;  
    }
}
class Box extends Rectangle
{
    public int getArea(int length,int width)
    {
        super.getArea(area);
        return length*width;
    }
}
public class Multilevel2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape s=new Shape();
        Rectangle r=new Rectangle();
        Box b=new Box();
        System.out.println("Length:");
        int length=sc.nextInt();
        System.out.println("Width:");
        int width=sc.nextInt();
        int Box=b.getArea(length, width);
        int Rectangle=r.getArea(length,width);
        System.out.println("Rectangle area:"+s.getArea(Rectangle));
        System.out.println("Box area:"+s.getArea(Box));
    }    
}
