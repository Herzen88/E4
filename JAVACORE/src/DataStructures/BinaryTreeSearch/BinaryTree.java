package com.company.DataStructures.BinaryTreeSearch;

public class BinaryTree {
    private Node root;

    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;

            while (true) {
                parent = current;
                if (key < current.key) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last;
    }

    public Node findMax() {
        Node current = root;
        Node last = null;

        while (current != null) {
            last = current;
            current = current.rightChild;
        }
        return last;
    }

    public int findDepth() {
        Node current= root;
        Node last = null;
        int counter = 0;
        while (current!=null){
            last=current;
            current=current.rightChild;
            counter++;
        }
        return counter;
    }
}
