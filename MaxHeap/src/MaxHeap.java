/**
 *
 * @author melissabakke
 */
public class MaxHeap {
    // Create an array to hold the heap
    MaxHeapNode[] heap;

    public MaxHeap (int size) {
        heap = new MaxHeapNode[size+1];
    }
    
    public void Insert(MaxHeapNode node) {
        for (int i = 1; i < heap.length; i++) {
            // If the heap is empty, the first node is the current max
            if (heap[i] == null) {
                heap[i] = node;
                break;
            }
            // If the new last name is greater than the current last name
            // store current in a temp node, place new into the current index
            // and recursively call the insert method with the temp node
            if (node.getLastName().compareTo(heap[i].getLastName()) > 0) {
                MaxHeapNode temp = heap[i];
                heap[i] = node;
                Insert(temp);
            } 
            // If the new last name is equal to the current last name
            else if (node.getLastName().compareTo(heap[i].getLastName()) == 0) {
                // And if the new first name is greater than the current first name
                // store current in a temp node, place new into the current index
                // and recursively call the insert method with the temp node
                if (node.getFirstName().compareTo(heap[i].getFirstName()) > 0) {
                    MaxHeapNode temp = heap[i];
                    heap[i] = node;
                    Insert(temp);
                }
                // If the new first name is equal to the current first name
                else if (node.getFirstName().compareTo(heap[i].getFirstName()) == 0) {
                    // And if the new id is greater than the current id
                    // store current in a temp node, place new into the current index
                    // and recursively call the insert method with the temp node
                    if (node.getIDnumber() > heap[i].getIDnumber()) {
                        MaxHeapNode temp = heap[i];
                        heap[i] = node;
                        Insert(temp);
                    }
                }
            }
        }
    }
    
    public void FindMax () {
        // This is a max heap so the first node should be the max
        // Print out the first node
        System.out.println(heap[1].toString());
    }
    
    public void DeleteMax () {
        if (heap[1] == null) {
            System.out.println("Heap is empty.");
            }
        else {
            for (int i = 1; i < heap.length; i++) {
                // To be completed
            }
        }
    }
}
