/**
 * Melissa Bakke
 * Linked List Queue project
 * 10/07/17
 */

public class TestProgram {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create nodes
        LLNode node5 = new LLNode(105);
        LLNode node4 = new LLNode(104);
        LLNode node3 = new LLNode(103);
        LLNode node2 = new LLNode(102);
        LLNode node1 = new LLNode(101);
        
        // Create a new instance of LinkedListQueue
        LinkedListQueue queue = new LinkedListQueue();
        
        // Add nodes to queue
        queue.Enqueue(node1);
        queue.Enqueue(node2);
        queue.Enqueue(node3);
        queue.Enqueue(node4);
        queue.Enqueue(node5);
        
        // Remove nodes from queue
        queue.Dequeue();
        queue.Dequeue();
//        queue.Dequeue();
//        queue.Dequeue();
//        queue.Dequeue();

        System.out.println("The data of the current node of the queue is: " + queue.Peek());
    }
}
