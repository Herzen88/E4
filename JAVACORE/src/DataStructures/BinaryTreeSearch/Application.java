package com.company.DataStructures.BinaryTreeSearch;

import java.util.LinkedList;
import java.util.List;

public class Application {
    static List<Integer> counter = new LinkedList<>();

    public static void main(String[] args) {
        Node root = new Node(5);
        Node n1 = new Node(4);
        Node n2 = new Node(3);
        Node n3 = new Node(2);
        Node n4 = new Node(1);
        Node n5 = new Node(6);
        Node n6 = new Node(6);
        Node n7 = new Node(6);
        Node n8 = new Node(6);
        Node n9 = new Node(6);
        Node n10 = new Node(6);
        root.leftChild = n1;
        root.rightChild = n2;
        root.leftChild.rightChild = n3;
        root.leftChild.leftChild = n4;
        root.rightChild.rightChild = n5;
        root.rightChild.leftChild = n6;
        root.leftChild.rightChild.rightChild = n7;
        root.leftChild.rightChild.leftChild = n8;
        root.leftChild.rightChild.rightChild.leftChild = n9;
        root.leftChild.rightChild.rightChild.rightChild = n10;

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(Node root) {
        return checkChildNodes(root);
    }

    private static int checkChildNodes(Node current) {
        if (current.leftChild == null && current.rightChild == null) return 1;
        else {
            return (checkChildNodes(current.leftChild) > checkChildNodes(current.rightChild) ? checkChildNodes(current.leftChild) :  checkChildNodes(current.rightChild))+1;
        }
    }
}

