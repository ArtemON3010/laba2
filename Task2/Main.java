package Task2;

public class Main {
    public static void main(final String[] args) {
        //Creating stack...
        final Stack stack = new Stack();
        stack.add(5);
        stack.add(5);
        stack.add(2);
        stack.add(3);

        //Display number of elements + using for-each display all elements
        System.out.println("Elements in stack: " + stack.getCount());
        System.out.println("Stack: ");
        for (final int data: stack) {
            System.out.println(data);
        }
        //Remove 1 element + display number of elements + using for-each display all elements
        stack.remove();
        System.out.println("Elements in stack: " + stack.getCount());
        System.out.println("Stack: ");
        for (final int data: stack) {
            System.out.println(data);
        }
        //Remove another 1 element + display number of elements + using for-each display all elements
        stack.remove();
        System.out.println("Elements in stack: " + stack.getCount());
        System.out.println("Stack: ");
        for (final int value: stack) {
            System.out.println(value);
        }
        //Adding 1 element to stack + display number of elements + using for-each display all elements
        stack.add(333);
        System.out.println("Elements in stack: " + stack.getCount());
        System.out.println("Stack: ");
        for (final int value: stack) {
            System.out.println(value);
        }

    }
}
