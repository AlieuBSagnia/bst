package com.sparta.abs;

import java.util.List;

public class  BinarySearchTree implements BinaryTree {

    private Node root;

    //Constructor
    public BinarySearchTree(int element) {
        root = new Node(element);
    }

    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {
        Node node = new Node( element );
    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        return false;
    }

    @Override
    public int getLeftChild(int element) {
        return 0;
    }

    @Override
    public int getRightChild(int element) {
        return 0;
    }

    @Override
    public List<Integer> getSortedTreeAsc() {
        return null;
    }

    @Override
    public List<Integer> getSortedTreeDesc() {
        return null;
    }
}
