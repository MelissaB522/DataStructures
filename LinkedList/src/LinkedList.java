/**
 * Melissa Bakke
 * Linked List project
 * 09/30/17
 */

public class LinkedList {
    private LLNode front;
    private LLNode back;
    private LLNode current;
    
    // Default constructor
    public LinkedList () {
    }
    
    // Constructor
    public LinkedList (LLNode Front, LLNode Back, LLNode Current) {
        front = Front;
        back = Back;
        current = Current;
    }

    /**
     * @return the front
     */
    public LLNode getFront() {
        return front;
    }

    /**
     * @param front the front to set
     */
    public void setFront(LLNode front) {
        this.front = front;
    }

    /**
     * @return the back
     */
    public LLNode getBack() {
        return back;
    }

    /**
     * @param back the back to set
     */
    public void setBack(LLNode back) {
        this.back = back;
    }

    /**
     * @return the current
     */
    public LLNode getCurrent() {
        return current;
    }

    /**
     * @param current the current to set
     */
    public void setCurrent(LLNode current) {
        this.current = current;
    }
    
}
