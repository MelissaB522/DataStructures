/**
 * Melissa Bakke
 * CSC210
 * Binary Tree Node
 */

public class BinaryTreeNode {
    private char Letter;
    private BinaryTreeNode Left;
    private BinaryTreeNode Right;
    
    public BinaryTreeNode () {
        Letter = '\0';
        Left = null;
        Right = null;
    }
    
    /**
     * @return the Letter
     */
    public char getLetter() {
        return Letter;
    }

    /**
     * @param Letter the Letter to set
     */
    public void setLetter(char Letter) {
        this.Letter = Letter;
    }

    /**
     * @return the Left
     */
    public BinaryTreeNode getLeft() {
        return Left;
    }

    /**
     * @param Left the Left to set
     */
    public void setLeft(BinaryTreeNode Left) {
        this.Left = Left;
    }

    /**
     * @return the Right
     */
    public BinaryTreeNode getRight() {
        return Right;
    }

    /**
     * @param Right the Right to set
     */
    public void setRight(BinaryTreeNode Right) {
        this.Right = Right;
    }
}
