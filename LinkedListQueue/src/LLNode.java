/**
 * Melissa Bakke
 * Linked List Queue project
 * 10/07/17
 */

public class LLNode {
    private int data;
    private LLNode next;
    
    // Default constructor
    public LLNode () {
        
    }
    
    // Constructor with data
    public LLNode (int Data) {
        data = Data;
    }
    
    // Constructor with data and pointer
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
