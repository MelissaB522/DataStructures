
import java.util.Random;

/**
 * Melissa Bakke
 * CSC210 Data Structures
 * 09/23/2017
 */

public class RandomCounterSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new random object
        Random rand = new Random();
        // Initialize new array with 100000 integers
        int [] newArray = new int[100000];
        // Variable to hold the range of numbers in array
        int arrayRange = 500;
        // Counter variable to control do while loop
        int counter = 1;
        
        // loop through the program 1000 times
        do {   
            // For loop to fill array with random integers 0-499
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = rand.nextInt(arrayRange);
            }
            
            CounterSort(newArray, arrayRange, counter);
            checkSort(newArray, counter);
            counter++;
        } while (counter <= 1000);
    }
    
    /**
     * A method to sort an array of integers using a counter sort.
     * @param dataArray 
     */
    private static void CounterSort(int[] dataArray, int range, int counter) {
        // Index array - to span the range of numbers used
        int[] indexArray = new int[range];
        
        // For loop to cycle through the data array
        for (int i = 0; i < dataArray.length; i++) {
            // For the index of the indexArray at dataArray index i, 
            // increment that index of the indexArray by 1, essentially keeping
            // a tally of the values in dataArray using the indexes of indexArray
            indexArray[dataArray[i]] = indexArray[dataArray[i]] + 1;
        }
        
//        // Print out the index array, for testing purposes
//        System.out.println("Index Array: ");
//        for (int i = 0; i < indexArray.length; i++) {
//            System.out.print(indexArray[i] + " ");
//        }
        
        
        int j = 0;
        // For loop to cycle through indexArray
        for (int i = 0; i < indexArray.length; i++) {
            // Set new variable to value of indexArray at index i
            int indexValue = indexArray[i];
            // While indexValue is greater than 0, set dataArray at index j to i
            while (indexValue > 0) {
                dataArray[j] = i;
                // Increment j variable to move to the next index in dataArray
                j++;
                // Decrement indexValue
                indexValue--;
            }
        }
        
//        //Print out the sorted array, for testing and verification purposes
//        System.out.println("\nData Array: ");
//        for (int i = 0; i < dataArray.length; i++) {
//            System.out.print(dataArray[i] + " ");
//        }
//        System.out.println();
        
        //checkSort(dataArray, counter);
    }
    
    /**
     * A method to determine if an array of integers is sorted in ascending order.
     * @param dataArray 
     */
    private static void checkSort(int[] dataArray, int counter) {
        boolean sorted = true;
        // For loop to cycle through dataArray
        for (int i = 0; i < dataArray.length - 1; i++) {
            // If dataArray index i is greater than the index after it,
            // array is not sorted and boolean variable is set to false
            if (dataArray[i] > dataArray[i + 1]) {
                sorted = false;
            }
        }
        // If boolean variable is true, print message
        if (sorted) {
            System.out.println("Array " + counter + " is sorted.");
        }
        // If boolean value is false, print message
        else {
            System.out.println("ERROR! Array " + counter + " is not sorted.");
        }
    }
    
}
