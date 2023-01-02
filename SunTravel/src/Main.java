class Node {
    int key;
    Node left;
    Node right;

    public Node(int key) {
        this.key = key;
    }
}

class BinarySearchTree {
    Node root;

    // Insert a new node into the tree
    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (key < current.key) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    // Search for a node with a specific key in the tree
    public Node search(int key) {
        Node current = root;
        while (current != null) {
            if (current.key == key) {
                return current;
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert some nodes into the tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Search for a specific node
        Node result = tree.search(40);
        if (result != null) {
            System.out.println("Node found: " + result.key);
        } else {
            System.out.println("Node not found.");
        }
    }
}
