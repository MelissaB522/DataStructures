/**
 * Melissa Bakke
 * Linked List project
 * 09/30/17
 */

public class TestProgram {
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create linked list nodes
        LLNode node5 = new LLNode(5, null);
        LLNode node4 = new LLNode(4, node5);
        LLNode node3 = new LLNode(3, node4);
        LLNode node2 = new LLNode(2, node3);
        LLNode node1 = new LLNode(1, node2);
        
        // Create a new instance of LinkedList
        LinkedList linkedList = new LinkedList(node1, node5, node1);
        
        // Loop through the node and print out the data
        while (true) {
            System.out.println("The data in the current node is " + linkedList.getCurrent().getData());
            // Set current node to next node
            linkedList.setCurrent(linkedList.getCurrent().getNext());
            // If current node is back node, print out last data value and break out of loop
            if (linkedList.getCurrent() == linkedList.getBack()) {
                System.out.println("The data in the current node is " + linkedList.getCurrent().getData());
                break;
            }
        }
    }
}
