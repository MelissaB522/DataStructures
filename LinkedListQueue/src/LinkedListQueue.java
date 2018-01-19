/**
 * Melissa Bakke
 * Linked List Queue project
 * 10/07/17
 */

public class LinkedListQueue {
    private LinkedList LLQueue;
    
    // Default constructor
    public LinkedListQueue () {
        LLQueue = new LinkedList();
    }

    /**
     * A method to add an item to the back of a queue
     * @param node 
     */
    public void Enqueue(LLNode node) {
        // If queue is empty, set node to front, back and current
        if (LLQueue.getBack() == null) {
            LLQueue.setFront(node);
            LLQueue.setCurrent(node);
            LLQueue.setBack(node);
        }
        // Otherwise move the pointer to the new node, and set it to back
        else {
            LLQueue.getBack().setNext(node);
            LLQueue.setBack(node);
        }
    }
    
    /**
     * A method to remove the item at the front of a queue
     */
    public void Dequeue() {
        // If queue is empty, print out statement
        if (LLQueue.getFront() == null) {
            System.out.println("The queue is empty.");
        }
        // Otherwise move the front pointer to second item and set it as front
        else {
            LLQueue.setFront(LLQueue.getFront().getNext());
            LLQueue.setCurrent(LLQueue.getFront());
        }
    }
    
    /**
     * A method to see the data in the current node of the queue
     * @return the data of the current node
     */
    public int Peek() {
        // If queue is empty, print out statement (also handles null pointer exception)
        if (LLQueue.getCurrent() == null) {
            System.out.println("The queue is empty.");
            return 0;
        }
        // Otherwise return the data of the current node
        else {
            return LLQueue.getCurrent().getData();
        }
    }
}
