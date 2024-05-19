
public class BSTLeafCountTester {
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

        // Count leaf nodes
        int leafCount = tree.countLeafNodes();
        System.out.println("Number of leaf nodes: " + leafCount);
    }
}
