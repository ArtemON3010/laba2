package Task1;

public class SecondClass extends ThirdClass{

    // Constructor
    public SecondClass(){
        System.out.println("It's a constructor from class SecondClass");
    }
    //Static blocks
    static{
        System.out.println("It's a first static block from class SecondClass");
    }
    static{
        System.out.println("It's a second static block from class SecondClass");
    }
    //Non-static blocks
    {
        System.out.println("It's a first non-static block from class SecondClass");
    }
    {
        System.out.println("It's a second non-static block from class SecondClass");
    }
}
