
public class BST6 {
    private BSTNode root;

    public BST6() {
        root = null;
    }

    // Insert, Inorder, Search, and Count Non-Leaf Nodes methods...

    public int getNodeDepth(int data) {
        return getNodeDepthRec(root, data, 0);
    }

    private int getNodeDepthRec(BSTNode root, int data, int depth) {
        if (root == null) {
            return -1;
        }
        if (root.data == data) {
            return depth;
        }
        int level = getNodeDepthRec(root.left, data, depth + 1);
        if (level != -1) {
            return level;
        }
        return getNodeDepthRec(root.right, data, depth + 1);
    }
}
