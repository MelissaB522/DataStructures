/**
 * Melissa Bakke
 * CSC210
 * Binary Search Tree
 */

public class BinarySearchTree {
    // Variables
    private BinaryTreeNode Root;
    private BinaryTreeNode Current;
    
    // Constructor
    public BinarySearchTree () {
        Root = null;
        Current = null;
    }
    
    // Getters and Setters
    /**
     * @return the Root
     */
    public BinaryTreeNode getRoot() {
        return Root;
    }

    /**
     * @param Root the Root to set
     */
    public void setRoot(BinaryTreeNode Root) {
        this.Root = Root;
    }

    /**
     * @return the Current
     */
    public BinaryTreeNode getCurrent() {
        return Current;
    }

    /**
     * @param Current the Current to set
     */
    public void setCurrent(BinaryTreeNode Current) {
        this.Current = Current;
    }
    
    
    public void Insert (char c) {
        // Create new binary tree node
        BinaryTreeNode newNode = new BinaryTreeNode();
        // Set newNode letter to the character passed through method
        newNode.setLetter(c);
        
        
    }
    
    
    public void PrintInorder () {
        
    }
    
    
    public void SearchTree (char c) {
        
    }
    
}
