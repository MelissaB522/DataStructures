/**
 * Melissa Bakke
 * CSC210
 * Binary Tree
 */

public class TestProgram {    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // Create binary tree nodes
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        
        // Set letters and positions of nodes
        node1.setLetter('1');
        node1.setLeft(node2);
        node2.setLetter('2');
        node1.setRight(node3);
        node3.setLetter('3');
        
        // Output binary tree information
        System.out.println("Binary Tree ");
        System.out.println("Node "+ node1.getLetter() + ": " + 
                "Left - " + node1.getLeft().getLetter()+ 
                ", Right - " + node1.getRight().getLetter());
    }
}
