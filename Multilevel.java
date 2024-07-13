class Vehical{
    void start()
    {
        System.out.println("Vehical started:");
    }
}
class Car extends Vehical
{
    void drive()
    {
        System.out.println("Car Driving:");
    }
}
class SportsCar extends Car
{
    void drive()
    {
        System.out.println("Sports Car Driving:");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        SportsCar sc=new SportsCar();
        sc.start();
        sc.drive();
    }
}
