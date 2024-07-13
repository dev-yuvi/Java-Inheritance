abstract class college{
    
    college(int i){
        System.out.println(i);
    }

    void demo()
    {
        System.out.println("demo");
    }
   abstract void dept();
   abstract void aa();
  
}

abstract class kongunadu extends college{

    kongunadu(int i)
    {
       // int i=6;
        super(i);
    }
    void admis() {
       System.out.println("admin");
        
    }

    void dept() {
        System.out.println("dep");
        
    }

    void placedetails() {
      System.out.println("c2c");
    }

    void infra()
    {
        System.out.println("good");
    }

}

class kumarasamy extends college{
    kumarasamy(int i){
        super(i);

    }

    void admis() {
       System.out.println("admin");
        
    }

    void dept() {
        System.out.println("dep");
        
    }

    void placedetails() {
      System.out.println("c2c");
    }

    void infra()
    {
        System.out.println("good");
    }

    void fodd(){
        super.demo();
        System.out.println("very ");
    }

}





public class abstractdemo {
    public static void main(String[] args) {
        
        // kumarasamy k=new kumarasamy(6);
        // k.fodd();

        college clg=new college(5) {
             void dept(){
                System.out.println("annonums class");
            }
        };
        clg.demo();
        clg.dept();
        
    }
    
}
