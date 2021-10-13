package Task1;

public class Main {
    public static void main(final String[] args) {
        final Puzzle puzzle1 = new Puzzle("Rubik's Cube 3x3");
        puzzle1.display();
        final Puzzle puzzle2 = new RubiksCube("Rubik's Cube 3x3", true,"colored plastic");
        puzzle2.display();
        final Puzzle puzzle3 = new MinxCube("Megaminx", 12);
        puzzle3.display();
    }
}
