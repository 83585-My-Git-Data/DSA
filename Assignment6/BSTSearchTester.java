
public class BSTSearchTester {
    public static void main(String[] args) {
        BST tree = new BST();

        // Insert nodes
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Search for nodes
        int key = 40;
        TreeNode result = tree.search(key);
        if (result != null) {
            System.out.println("Node with key " + key + " found.");
        } else {
            System.out.println("Node with key " + key + " not found.");
        }

        key = 25;
        result = tree.search(key);
        if (result != null) {
            System.out.println("Node with key " + key + " found.");
        } else {
            System.out.println("Node with key " + key + " not found.");
        }
    }
}
