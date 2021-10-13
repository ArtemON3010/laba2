package Task1;

public class MinxCube extends Puzzle{
    private int minxSide;

    public MinxCube(final String name,final int minxSide){
        super(name);
        this.minxSide = minxSide;
    }

    public int getMinxSide() {
        return minxSide;
    }

    public void setMinxSide(final int minxSide) {
        if(minxSide >= 7) {
            this.minxSide = minxSide;
        }
        else {
            throw new RuntimeException("It's not minx-shaped puzzle!");
        }
    }

    public void display(){
        System.out.printf("Its " + super.getName() + " here!This puzzle has " + getMinxSide() + " sides."+"\n");
    }

    static{
        System.out.println("static class MinxCube");
    }
}
