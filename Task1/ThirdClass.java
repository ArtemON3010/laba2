package Task1;

public class ThirdClass {

    // Constructor
    public ThirdClass(){
        System.out.println("It's a constructor from class ThirdClass");
    }
    //Static blocks
    static{
        System.out.println("It's a first static block from class ThirdClass");
    }
    static{
        System.out.println("It's a second static block from class ThirdClass");
    }
    static{
        System.out.println("It's a third static block from class ThirdClass");
    }
    //Non-static blocks
    {
        System.out.println("It's a first non-static block from class ThirdClass");
    }
    {
        System.out.println("It's a second non-static block from class ThirdClass");
    }
    {
        System.out.println("It's a third non-static block from class ThirdClass");
    }
}
