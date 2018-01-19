/**
 *
 * @author melissabakke
 */
public class TestProgram {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new max heap
        MaxHeap maxHeap = new MaxHeap(5);
        
        // Create some nodes
        MaxHeapNode node1 = new MaxHeapNode("John", "Smith", 6);
        MaxHeapNode node2 = new MaxHeapNode("David", "Brown", 3);
        MaxHeapNode node3 = new MaxHeapNode("Anne", "Boleyn", 5);
        MaxHeapNode node4 = new MaxHeapNode("John", "Smith", 1);
        MaxHeapNode node5 = new MaxHeapNode("Samantha", "Cooper", 4);
        
        // Insert nodes
        maxHeap.Insert(node1);
        maxHeap.Insert(node2);
        maxHeap.Insert(node3);
        maxHeap.Insert(node4);
        maxHeap.Insert(node5);
        
        maxHeap.FindMax();
        
        //maxHeap.DeleteMax();
        
    }
}
