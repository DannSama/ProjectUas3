class Node {
    int value;
    Node next;
    Node left;
    Node right;
    int key;

    public Node(int value) {
        this.value = value;
        next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

class BinarySearchTree {
    Node root;

    public void toLinkedList(LinkedList list) {
        toLinkedList(root, list);
    }

    private void toLinkedList(Node node, LinkedList list) {
        if (node == null) return;
        toLinkedList(node.left , list);
        list.add(node.value);
        toLinkedList(node.right, list);
    }
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
