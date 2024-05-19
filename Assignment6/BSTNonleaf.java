
public class BSTNonleaf {
    private BSTNode root;

    public BSTNonleaf() {
        root = null;
    }

    // Insert, Inorder, and Search methods from previous code...

    public int countNonLeafNodes() {
        return countNonLeafNodesRec(root);
    }

    private int countNonLeafNodesRec(BSTNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return 0;
        }
        return 1 + countNonLeafNodesRec(root.left) + countNonLeafNodesRec(root.right);
    }
}
