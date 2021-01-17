package src.com.csc205.demos.module11;

import java.util.Iterator;

/**
 * Created by Ray on 4/10/2017.
 */
public class BinaryTreeDriver {

    public static void main(String[] args) {

        BinaryTreeImpl<Integer> binaryTree = new BinaryTreeImpl<>();
        binaryTree.insert(new Integer(1));
        binaryTree.insert(new Integer(2));
        binaryTree.insert(new Integer(3));
        binaryTree.insert(new Integer(4));
        binaryTree.insert(new Integer(5));
        binaryTree.insert(new Integer(6));
        binaryTree.insert(new Integer(7));

        System.out.println("In Order traversal of binary tree will be:");
        printTraversal(binaryTree.iteratorInOrder());

        System.out.println("\nPost Order traversal of binary tree will be:");
        printTraversal(binaryTree.iteratorPostOrder());

        System.out.println("\nPre Order traversal of binary tree will be:");
        printTraversal(binaryTree.iteratorPreOrder());

        System.out.println("\nLevel Order traversal of binary tree will be:");
        printTraversal(binaryTree.iteratorLevelOrder());
        
        System.out.println();
        binaryTree.printTopDownTree();
       
      
    }

    private static void printTraversal(Iterator iterator) {

        while(iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj != null) {
                System.out.print(obj + " ");
            }
        }
    }
}
