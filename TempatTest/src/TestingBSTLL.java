public class TestingBSTLL {
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
        Node result = tree.search(4);
        if (result != null) {
            System.out.println("Node found: " + result.key);
        } else {
            System.out.println("Node not found.");
        }
    }
}
