interface Flyable
{
    void fly();
}
interface Swimmable
{
    void swim();
}
class Bird implements Flyable,Swimmable{
    public void fly()
    {
        System.out.println("Bird is Flying");
    }
    public void swim()
    {
        System.out.println("Bird is Swimming");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        Bird b=new Bird();
        b.fly();
        b.swim();
    }
}
