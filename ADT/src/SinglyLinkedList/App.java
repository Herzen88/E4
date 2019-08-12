package SinglyLinkedList;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(40);
        singlyLinkedList.insertFirst(30);
        singlyLinkedList.insertFirst(20);
        singlyLinkedList.insertFirst(10);
        singlyLinkedList.insertLast(200);
        singlyLinkedList.insertLast(300);
        singlyLinkedList.deleteFromLastNode();
        singlyLinkedList.displayList();
    }
}
