
public class CountNonLeafNodesTester {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        int nonLeafNodeCount = tree.countNonLeafNodes();
        System.out.println("Number of non-leaf nodes: " + nonLeafNodeCount);
    }
}
