
public class BSTLeafCount {
    TreeNode root;

    public BSTLeafCount() {
        root = null;
    }

    public TreeNode insert(TreeNode node, int key) {
        if (node == null) {
            node = new TreeNode(key);
            return node;
        }

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);

        return node;
    }

    public void insert(int key) {
        root = insert(root, key);
    }

    public int countLeafNodes(TreeNode node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        return countLeafNodes(node.left) + countLeafNodes(node.right);
    }

    public int countLeafNodes() {
        return countLeafNodes(root);
    }
}
