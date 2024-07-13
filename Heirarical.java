class Person{
    public void speak()
    {
        System.out.println("The Person Speaking:");
    }
}
class Student extends Person{
    public void speak()
    {
        System.out.println("The Student Asking Question:");
    }
}
class Teacher extends Person{
    public void speak()
    {
        System.out.println("The Teacher is Giving a Lecture:");
    }
}
public class Heirarical {
    public static void main(String[] args) {
        Student s=new Student();
        Teacher t=new Teacher();
        s.speak();
        t.speak();
    }
}
