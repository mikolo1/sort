package com.mikolo.algs.Structures;

import com.mikolo.algs.Interfaces.ITreeNode;

public class NodeTree implements ITreeNode {

    Node root = null;

    @Override
    public void add(Node node) {
        Node temp;
        Node parent;

        if (root == null)
            root = node;
        else {
            Node current = root;
            temp = current;
            parent = null;

            while (current != null) {
                parent = current;
                if (current.value > node.value) {
                    if (current.left == null) {
                        temp = current;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        temp = current;
                    }
                    current = current.right;
                }
            }

            if (node.value < temp.value) {
                temp.left = node;
            } else {
                temp.right = node;
            }

//            if (parent.value > node.value) {
//                parent.left = new Node(node.value);
//                parent.left.parent = parent;
//            } else {
//                parent.right = new Node(node.value);
//                parent.right.parent = parent;
//            }

        }
    }
}
