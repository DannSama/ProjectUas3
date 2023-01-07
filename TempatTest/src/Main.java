public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(6);
        ll.add(2);
        ll.add(8);
        bst.toLinkedList(new LinkedList());
        bst.search(2);
        System.out.println(ll.head);
    }
}