/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melissabakke
 */
public class CounterSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create array with 50 same value integers
        int[] array1 = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 
            3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3 };
        // Create array with 50 integer values in ascending order
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50 };
        // Create array with 50 integer values in descending order
        int[] array3 = {99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 
            79, 78, 77, 76, 75, 74, 73, 72, 71, 70, 69, 68, 67, 66, 65, 64, 63, 62, 61, 60, 
            59, 58, 57, 56, 55, 54, 53, 52, 51, 50 };
        // Create array with 50 random integers between 0 and 99
        int[] array4 = {27, 44, 1, 86, 74, 99, 97, 72, 15, 0, 16, 11, 55, 76, 93, 81, 96, 36, 60, 54, 
            32, 75, 14, 4, 58, 89, 17, 42, 95, 28, 52, 2, 65, 22, 98, 49, 92, 3, 45, 18, 
            3, 67, 94, 62, 19, 82, 0, 26, 35, 50 };
        
        // Call counterSort method and pass it each array
        CounterSort(array1);
        CounterSort(array2);
        CounterSort(array3);
        CounterSort(array4);
        
        }

    /**
     * A method to sort an array of integers using a counter sort.
     * @param dataArray 
     */
    private static void CounterSort(int[] dataArray) {
        // Index array - to span the range of numbers used
        int[] indexArray = new int[100];
        
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
        
        //Print out the sorted array, for testing and verification purposes
        System.out.println("\nData Array: ");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + " ");
        }
        System.out.println();
        
        checkSort(dataArray);
    }
    
    /**
     * A method to determine if an array of integers is sorted in ascending order.
     * @param dataArray 
     */
    private static void checkSort(int[] dataArray) {
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
            System.out.println("Array is sorted.");
        }
        // If boolean value is false, print message
        else {
            System.out.println("Array is not sorted.");
        }
    }
    
}
