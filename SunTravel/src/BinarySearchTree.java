class Node {
    SunLinked sunbus;
    int namae;
    Node left;
    Node right;

    public Node(int namae) {
        this.namae = namae;
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
//
        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;
            if (key < current.namae) {
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
            if (current.namae == key) {
                return current;
            } else if (key < current.namae) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }
}
