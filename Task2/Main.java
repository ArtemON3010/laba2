package Task2;

public class Main {
    public static void main(final String[] args) {
        final Stack stack = new Stack();
        stack.add(4);
        stack.add(1);
        stack.add(9);
        stack.add(2);
        stack.add(2);

        for (final Node node : stack) {
            System.out.print(node.getData() + " ");
        }

        System.out.println();

        stack.delete();
        stack.delete();

        System.out.println(stack);
        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.delete();
        stack.delete();
        stack.delete();
        stack.delete();
    }
}
