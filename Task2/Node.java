package Task2;

public class Node {
    private int data;
    private Node next;

    //Constructors
    public Node(final int d, final Node nx){
        this.data = d;
        this.next = nx;
    }

    public Node() {
    }

    //Getters
    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    //Setters
    public void setData(final int data) {
        this.data = data;
    }

    public void setNext(final Node next) {
        this.next = next;
    }


}
