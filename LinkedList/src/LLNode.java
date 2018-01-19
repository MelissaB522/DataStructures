/**
 * Melissa Bakke
 * Linked List project
 * 09/30/17
 */

public class LLNode {
    private int data;
    private LLNode next;
    
    // Default constructor
    public LLNode () {
        
    }
    
    // Constructor
    public LLNode (int Data, LLNode Next) {
        data = Data;
        next = Next;        
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public LLNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(LLNode next) {
        this.next = next;
    }
}
