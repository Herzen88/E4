package SinglyLinkedList;

public class SinglyLinkedList {
    private Node first;
    private Node last;

    public SinglyLinkedList() {
        first=null;
        last=null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.node = first;
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        }
        if (first.node == null) {
            first = newNode;
            last = newNode.node;
        } else {
            first = newNode;
        }

    }

    public void insertLast(int value) {
        if (last != null) {
            Node current = new Node();
            last.node = current;
            last = last.node;
            current.value = value;
        }
    }

    public Node deleteFirstNode() {
        if (!isEmpty()) {
            Node temp = first;
            first = first.node;
            return temp;
        } else {
            System.out.println("List is empty!");
            return null;
        }
    }

    public Node deleteFromLastNode() {
        if (!isEmpty()) {
            Node temp = last;
            last = null;
            return temp;
        } else {
            System.out.println("List is empty!");
            return null;
        }
    }

    public void displayList() {
        System.out.println("List (first ---> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.node;
        }
        System.out.println();
    }
}
