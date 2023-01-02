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
        while (true) {
            if (key < current.key) {
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
