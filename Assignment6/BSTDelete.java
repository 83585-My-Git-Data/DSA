
public class BSTDelete {
    TreeNode root;

    public BSTDelete() {
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

    // Function to delete a node with two children
    public TreeNode delete(TreeNode root, int key) {
        if (root == null) return root;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor
            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public void delete(int key) {
        root = delete(root, key);
    }

    // Function to find the minimum value node in a tree
    public int minValue(TreeNode root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}
