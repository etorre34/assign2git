package src.com.csc205.demos.module11;

/**
 * Created by Ray on 4/10/2017.
 */


import java.util.*;

/**
 * Created by rzf8th on 7/6/2016.
 */
public class BinaryTreeImpl<T> implements BinaryTree<T> {

    private BinaryTreeNode<T> root;
    private int count;

    public BinaryTreeImpl() {
        this.root = null;
        this.count = 0;
    }

    @Override
    public T getRootElement() {
        return this.root.element;
    }

    @Override
    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public int size() {
      return this.count;
    }

    @Override
    public boolean contains(T targetElement) {
        boolean containsElement = false;

        try {
            containsElement = find(targetElement) != null;
        } catch (ElementNotFoundException e) {
            System.err.println("Element not found");
        }
        return containsElement;
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree.  Throws a ElementNotFoundException if
     * the specified target element is not found in the binary tree.
     *
     * @param targetElement the element being sought in this tree
     * @return a reference to the specified target
     * @throws ElementNotFoundException if the element is not in the tree
     */
    public T find(T targetElement) throws ElementNotFoundException {
        BinaryTreeNode<T> current = findNode(targetElement, root);

        if (current == null)
            throw new ElementNotFoundException(this.getClass().getCanonicalName());

        return (current.getElement());
    }

    /**
     * Returns a reference to the specified target element if it is
     * found in this binary tree.
     * <p>
     * Performance is O(n) because we have to search all nodes.
     *
     * @param targetElement the element being sought in this tree
     * @param next          the element to begin searching from
     */
    private BinaryTreeNode<T> findNode(T targetElement,
                                       BinaryTreeNode<T> next) {
        if (next == null)
            return null;

        if (next.getElement().equals(targetElement))
            return next;

        BinaryTreeNode<T> temp = findNode(targetElement, next.getLeft());

        if (temp == null)
            temp = findNode(targetElement, next.getRight());

        return temp;
    }

    public void insert(T element) {

      if (this.root == null) {
    	  this.root = new BinaryTreeNode(element);
    	  
      }else {
    	  Iterator<BinaryTreeNode<T>> iterator = insertionIterator();
    	  while(iterator.hasNext()) {
    		  BinaryTreeNode<T> node = iterator.next();
    		  if(node.element == null) {
    			  node.element = element;
    			  node.left = new BinaryTreeNode();
    			  node.right = new BinaryTreeNode();
    			  break;
    		  }
    	  }
      }

    }

    @Override
    public Iterator<T> iterator() {
        return iteratorLevelOrder();
    }

    @Override
    public Iterator<T> iteratorInOrder() {

        Queue<T> tempList = new LinkedList<>();
        inOrder(root, tempList);

        return tempList.iterator();
    }

    /**
     * Performs a recursive inorder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param tempList the temporary list for use in this traversal
     */
    protected void inOrder(BinaryTreeNode<T> node,
                           Queue<T> tempList) {
        if(node != null) {
        	inOrder(node.getLeft(), tempList);
        	tempList.add(node.getElement());
        	inOrder(node.getRight(), tempList);
        	
        	
        	
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {

        Queue<T> tempList = new LinkedList<>();
        preOrder(root, tempList);

        return tempList.iterator();
    }

    /**
     * Performs a recursive preOrder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param tempList the temporary list for use in this traversal
     */
    protected void preOrder(BinaryTreeNode<T> node,
                            Queue<T> tempList) {
    	  if(node != null) {
    		  tempList.add(node.getElement());
          	preOrder(node.getLeft(), tempList);
          	preOrder(node.getRight(), tempList);
          	
          	
          	
          }
    }

    @Override
    public Iterator<T> iteratorPostOrder() {

        Queue<T> tempList = new LinkedList<>();
        postOrder(root, tempList);

        return tempList.iterator();
    }

    /**
     * Performs a recursive postOrder traversal.
     *
     * @param node     the node to be used as the root for this traversal
     * @param tempList the temporary list for use in this traversal
     */
    protected void postOrder(BinaryTreeNode<T> node,
                             Queue<T> tempList) {
    	if(node != null) {
        	postOrder(node.getLeft(), tempList);
        	postOrder(node.getRight(), tempList);
        	tempList.add(node.getElement());
        	
        	
        	
        }
    }

    @Override
    public Iterator<T> iteratorLevelOrder() {

        Queue<T> tempList = new LinkedList<>();
        levelOrder(root, tempList);

        return tempList.iterator();
    }


    /**
     * Performs an iterative levelOrder traversal.
     *
     * @param node
     * @param tempList
     */
    public void levelOrder(BinaryTreeNode<T> node,
                           Queue<T> tempList) {

        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()) {
        	
        	BinaryTreeNode<T> tempNode = queue.poll();//queue is not empty
        	tempList.add(tempNode.element);//Took the value out and added it to the LinkedList
        	
        	if(tempNode.left != null) {
        		queue.add(tempNode.left);//If there is a left hand node, we load it into B
        	}
        	
        	if(tempNode.right != null) {
        		queue.add(tempNode.right);
        	}
        	
        }
    }

    private Iterator<BinaryTreeNode<T>> insertionIterator() {

        Queue<BinaryTreeNode<T>> tempList = new LinkedList<>();
        levelOrderInsertionIterator(root, tempList);

        return tempList.iterator();
    }


    /**
     * Performs an iterative levelOrder traversal for insertion of nodes.
     *
     * @param node
     * @param tempList
     */
    private void levelOrderInsertionIterator(BinaryTreeNode<T> node,
                                             Queue<BinaryTreeNode<T>> tempList) {

        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {

            BinaryTreeNode<T> tempNode = queue.poll();
            tempList.add(tempNode);

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }

        }
    }

    /**
     * Prints a graphical representation of the tree
     */
    public void printTopDownTree() {

        List<List<String>> lines = new ArrayList<List<String>>();
        List<BinaryTreeNode<T>> level = new ArrayList<>();
        List<BinaryTreeNode<T>> next = new ArrayList<>();

        level.add(this.root);
        int nn = 1;

        int widest = 0;

        while (nn != 0) {
            List<String> line = new ArrayList<String>();

            nn = 0;

            for (BinaryTreeNode<T> n : level) {

                if (n == null) {
                    line.add(null);
                    next.add(null);
                    next.add(null);
                } else {
                    String aa;
                    if (n.getElement() != null) {
                        aa = n.getElement().toString();
                    } else {
                        aa = "null";
                    }
                    line.add(aa);
                    if (aa.length() > widest)
                        widest = aa.length();

                    next.add(n.getLeft());
                    next.add(n.getRight());

                    if (n.getLeft() != null)
                        nn++;
                    if (n.getRight() != null)
                        nn++;

                }
            }

            if (widest % 2 == 1)
                widest++;

            lines.add(line);

            List<BinaryTreeNode<T>> tmp = level;
            level = next;
            next = tmp;
            next.clear();
        }

        int perPiece = lines.get(lines.size() - 1).size() * (widest + 4);
        for (int i = 0; i < lines.size(); i++) {
            List<String> line = lines.get(i);
            int hpw = (int) Math.floor(perPiece / 2f) - 1;

            if (i > 0) {
                for (int j = 0; j < line.size(); j++) {

                    // split node
                    char c = ' ';
                    if (j % 2 == 1) {
                        if (line.get(j - 1) != null) {
                            c = (line.get(j) != null) ? '|' : '|';
                        } else {
                            if (j < line.size() && line.get(j) != null)
                                c = '|';
                        }
                    }
                    System.out.print(c);

                    // lines and spaces
                    if (line.get(j) == null) {
                        for (int k = 0; k < perPiece - 1; k++) {
                            System.out.print(" ");
                        }
                    } else {

                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? " " : "-");
                        }
                        System.out.print(j % 2 == 0 ? "|" : "|");
                        for (int k = 0; k < hpw; k++) {
                            System.out.print(j % 2 == 0 ? "-" : " ");
                        }
                    }
                }
                System.out.println();
            }

            // print line of numbers
            for (int j = 0; j < line.size(); j++) {

                String f = line.get(j);
                if (f == null)
                    f = "";
                int gap1 = (int) Math.ceil(perPiece / 2f - f.length() / 2f);
                int gap2 = (int) Math.floor(perPiece / 2f - f.length() / 2f);

                // a number
                for (int k = 0; k < gap1; k++) {
                    System.out.print(" ");
                }
                System.out.print(f);
                for (int k = 0; k < gap2; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();

            perPiece /= 2;
        }
    }

    /**
     * Basic generic BinaryTreeNode
     */
    private class BinaryTreeNode<T> {

        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        T element;

        BinaryTreeNode() {
            this.left = null;
            this.right = null;
            this.element = null;
        }

        BinaryTreeNode(T element) {
            this.element = element;
            this.left = new BinaryTreeNode();
            this.right = new BinaryTreeNode();
        }

        T getElement() {
            return element;
        }

        BinaryTreeNode<T> getLeft() {
          return left;
        }

        BinaryTreeNode<T> getRight() {
         return right;
        }

    }

}

