 import java.util.*;
 class Shape{
    int area;
    public int getArea(int area) {
        return area;
    }
}
class Rectangle extends Shape{
public int getArea(int length,int width)
{
   super.getArea(area);
   return length*width;
}
}
public class Single {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length,width;
        System.out.println("Length:");
        length=sc.nextInt();
        System.out.println("Width:");
        width=sc.nextInt();
      Shape s=new Shape();
       Rectangle r=new Rectangle();
       int area=r.getArea(length,width);
       System.out.println("Area:");
       System.out.println(s.getArea(area)); 
    }
    
}