package DoublyLinkedList;

public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int value) {
        Node newNode = new Node();
        newNode.value = value;

        if (isEmpty()) {
            last = newNode;
        } else {
            first.left = newNode;
            newNode.right = first;
        }
        this.first = newNode;
    }

    public void insertLast(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.right = newNode;
            newNode.left = last;
        }
        this.last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if (first.right == null) {
            last = null;
        } else {
            first.right.left = null;
        }
        first = first.right;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if (last.left == null) {
            first = null;
        } else {
            last.left.right = null;
        }
        last = last.left;
        return temp;
    }

    public boolean insertAfter(int key, int value) {
        Node current = first;
        while (current.value != key) {
            current = current.right;
            if (current == null) {
                return false;
            }
        }

        Node newNode = new Node();
        newNode.value = value;

        if (current == last) {
            current.right = null;
            last = newNode;
        } else {
            newNode.right = current.right;
            current.right.left = newNode;
        }

        newNode.left = current;
        current.right = newNode;

        return true;
    }

    public Node deleteKey(int key) {
        Node current = first;
        while (current.value != key) {
            current = current.right;
            if (current == null) {
                System.out.println("No such element " + key);
                return null;
            }
        }
        if (current == first) {
            first = current.right;
        } else {
            current.left.right = current.right;
        }

        if (current == last) {
            last = current.left;
        } else {
            current.right.left = current.left;
        }

        return current;
    }

    public void displayListForward() {
        System.out.println("List (first ---> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.right;
        }
        System.out.println();
    }
    public void displayListBackWord() {
        System.out.println("List (first ---> last)");
        Node current = last;
        while (current != null) {
            current.displayNode();
            current = current.left;
        }
        System.out.println();
    }
}

