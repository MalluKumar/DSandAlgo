package trees.binarySearchTree;

public class BinarySearchTreeMain {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(90);
        tree.insert(30);
        tree.insert(70);
        tree.insert(40);

        System.out.println(tree.maxDepth());

        tree.traverseInOrder();
        System.out.println();
        System.out.println("------------------------------------");

        System.out.println(tree.get(90));
        System.out.println(tree.get(10));
        System.out.println("------------------------------------");

        System.out.println(tree.min());
        System.out.println(tree.max());
        System.out.println("------------------------------------");

        // tree.delete(70);
        // tree.delete(50);
        // tree.delete(40);
        tree.traversePreOrder();
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        tree.traversePostOrder();

    }

}
