package trees.binarySearchTree;

public class TreeNode {

    private int value;
    private TreeNode rightChild;
    private TreeNode leftChild;

    public TreeNode(int value) {
        this.value = value;
    }

    public void insert(int value) {

        if (this.value == value) {
            return;
        }

        if (this.value > value) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }

    }

    public void traversalInOrder() {

        if (leftChild != null) {
            leftChild.traversalInOrder();
        }

        System.out.print(value + ", ");

        if (rightChild != null) {
            rightChild.traversalInOrder();
        }

    }

    public TreeNode get(int value) {

        if (this.value == value) {
            return this;
        }

        if (this.value > value) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }

        return null;

    }

    public int minNode() {

        if (leftChild == null) {
            return value;
        } else {
            return leftChild.minNode();
        }

    }

    public int maxNode() {

        if (rightChild == null) {
            return value;
        } else {
            return rightChild.maxNode();
        }

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value + '}';
    }
}