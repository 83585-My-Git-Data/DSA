
public class BSTSearch {
    TreeNode root;

    public BSTSearch() {
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

    // Recursive function to search a key in BST
    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key)
            return root;

        if (root.data > key)
            return search(root.left, key);

        return search(root.right, key);
    }

    public TreeNode search(int key) {
        return search(root, key);
    }
}
