interface MyInterface{
    static void staticMethod()
    {
        System.out.println("static");
    }
    default void defaultMethod()
    {
        System.out.println("default");
    }
    abstract void abstractMethod();
}
class MyClass implements MyInterface{
    public void abstractMethod() {
        System.out.println("abstract");
    }
}
public class Interface3 {
    public static void main(String[] args) {
        MyClass m=new MyClass();
        m.abstractMethod();
        m.defaultMethod();
       MyInterface.staticMethod();
    }
}
