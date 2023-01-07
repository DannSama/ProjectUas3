import java.util.Comparator;
import java.util.Scanner;

class Node {
    String name;
    Node left;
    Node right;


    public Node(String name) {
        this.name = name;
    }
}

class BinarySearchTree {
    Node root;
    Comparator<String> comparator;

    public BinarySearchTree(Comparator<String> comparator) {
        this.comparator = comparator;
    }

    public BinarySearchTree() {
    }

    // Insert a new node into the tree
    public void insert(String name) {
        Node newNode = new Node(name);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        while (true) {
            if (comparator.compare(name, current.name) < 0) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }

    // Search for a node with a specific name in the tree
    public Node search(String name) {
        Node current = root;
        while (current != null) {
            if (current.name.equals(name)) {
                return current;
            } else if (comparator.compare(name, current.name) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}

