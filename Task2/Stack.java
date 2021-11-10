package Task2;

import java.util.Iterator;

public class Stack implements Iterable<Integer> {
    private Node head;
    private int count = 0;

    //This method counts number of elements in stack
    public int getCount() {
        return count;
    }

    //This method adds elements to stack
    public void add(final int data){
        this.head = new Node(data,head);
        count++;
    }

    //This method removes elements from stack
    public int remove(){
        final int data = head.getData();
        head = head.getNext();
        count--;

        return data;
    }

    //Is stack empty?
    public boolean isEmpty(){
        return count == 0;
    }

    //Making our stack be able to display elements using for-each(making iterable)
    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<Integer> {
        Node next = head;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public Integer next(){
            final int data = next.getData();
            next = next.getNext();
            return data;
        }
    }

}
