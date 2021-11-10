package Task1;

public class FirstClass extends SecondClass{

    // Constructor
    public FirstClass(){
        System.out.println("It's a constructor from class FirstClass");
    }
    //Static block
     static{
        System.out.println("It's a static block from class FirstClass");
    }
    //Non-static block
    {
        System.out.println("It's a non-static block from class FirstClass");
    }

}
