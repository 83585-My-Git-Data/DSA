
public class BSTDeleteTester {
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

        System.out.println("BST created with inserted nodes.");

        // Delete node with two children
        tree.delete(50);

        System.out.println("Node 50 deleted. Inorder successor replaced it.");
    }
}
