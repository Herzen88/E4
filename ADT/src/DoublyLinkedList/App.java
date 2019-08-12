package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(100);
        doublyLinkedList.insertFirst(200);
        doublyLinkedList.insertFirst(300);
        doublyLinkedList.insertLast(400);
        doublyLinkedList.insertAfter(200, 500);
        doublyLinkedList.deleteKey(100);
        doublyLinkedList.displayListForward();
        doublyLinkedList.displayListBackWord();
    }
}
