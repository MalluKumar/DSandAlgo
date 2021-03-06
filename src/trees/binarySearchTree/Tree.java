package trees.binarySearchTree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {

        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }

    }
    
    public int maxDepth() {

        if (root == null) {
            return 0;
        } else {
            return root.depth(root);
        }

    }

    public void traverseInOrder() {

        if (root != null) {
            root.traversalInOrder();
        }

    }

    public void traversePreOrder() {

        if (root != null) {
            root.traversalPreOrder();
        }

    }

    public void traversePostOrder() {

        if (root != null) {
            root.traversalPostOrder();
        }

    }

    public TreeNode get(int value) {

        if (root != null) {
            return root.get(value);
        } else {
            return null;
        }

    }

    public int min() {

        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.minNode();
        }

    }

    public int max() {

        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.maxNode();
        }

    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {

        if (subtreeRoot == null) {
            return null;
        }

        if (subtreeRoot.getValue() > value) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if(subtreeRoot.getValue() < value) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            // For case 1 and case 2
            // Case 1: When the parent node has no child nodes
            // Case 2: When the parent node has one child
            if(subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            // Case 3: When parent node has two children
            // Replace the value in the subtreeRoot node with the smallest value from the right subtree
            subtreeRoot.setValue(subtreeRoot.getRightChild().minNode());

            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getValue()));
        }

        return subtreeRoot;
    }

}
