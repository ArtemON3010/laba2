package Task1;

public class Puzzle {
    private String name;

    public Puzzle(final String name){

        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void display(){

        System.out.printf("Puzzle %s \n", name);
    }
    static{
        System.out.println("static class Puzzle");
    }
}
