interface Greet{
    void sayHello();
    static void sayGoodbye()
    {
        System.out.println("Good Bye!");
    }

} 
class Person implements Greet{
    public void sayHello()
    {
        System.out.println("Hello");
    }

}
public class Interfaces {
    public static void main(String[] args) {
        Person p=new Person();
        p.sayHello();
        Greet.sayGoodbye();
    }
}
