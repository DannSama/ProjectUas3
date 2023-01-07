import java.util.Scanner;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Create a comparator to compare strings alphabetically
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };

        BinarySearchTree tree = new BinarySearchTree(comparator);
        SunLinked sunny = new SunLinked();

        // Insert some names into the tree
        tree.insert("Alice");
        tree.insert("Bob");
        tree.insert("Charlie");
        tree.insert("David");
        tree.insert("Eve");
        tree.insert("Frank");
        tree.insert("Greta");
        sunny.bookTicket("abdan", 4);

        // Search for a specific name
        System.out.print("enter passanger name : ");
        Node result = tree.search(read.next());
        if (result != null) {
            System.out.println("Name found: " + result.name);
        } else {
            System.out.println("Name not found.");
        }
    }
}
