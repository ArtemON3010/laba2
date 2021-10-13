package Task1;

public class RubiksCube extends Puzzle{
    private boolean parity;
    private String type;

    public RubiksCube(final String name,final boolean parity,final String type){
        super(name);
        this.type = type;
        this.parity=parity;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public boolean isParity() {
        return parity;
    }

    public void setParity(final boolean parity) {
        this.parity = parity;
    }

    public void display(){
        System.out.printf("Its " + super.getName() + " here!This puzzle is made by " + getType() +".\n");
    }

    static{
        System.out.println("static class RubiksCube");
    }

}
