package util;

public class MyLinkedList<T> {




    private static class Node<T> {
        T Value;
        Node<T> previous;
        Node<T> next;


        public Node(T value, Node<T> previous, Node<T> next) {
            Value = value;
            this.previous = previous;
            this.next = next;
        }
    }
}
