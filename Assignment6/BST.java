

public class BST {
    TreeNode root;

    public BST() {
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


    public TreeNode search(int key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }


    public void delete(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


    public int countLeafNodes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countLeafNodes'");
    }


    public int countNonLeafNodes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countNonLeafNodes'");
    }
}
