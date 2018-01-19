/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melissabakke
 */
public class ArrayBasedStack {
    // contains the number of integers currently in the stack
    int size = 0;
    // contains the maximum number of integers that can be in the stack
    int capacity;
    // an array of integers that make up the stack
    int[] stack;
    
    // Default constructor
    public ArrayBasedStack() {
        
    }
    
    public ArrayBasedStack(int c) {
        capacity = c;
        stack = new int[capacity];
    }
    
    public void push(int number) {
        // Add integer to the array at the index equivalent to the size of the stack
        stack[size] = number;
        // Increment size so next push/pop will be added to correct index
        size++;
        // Print out what was just added to the stack
        System.out.println(number + " has been added to the stack.");
    }
    
    public void pop() {
        // Print out number being removed from stack before changing it 
        // (size - 1 because size is where the next would be added)
        System.out.println(stack[size - 1] + " has been removed from the stack.");
        
        // If the stack isn't empty
        if (size > 0) {
            // Set integer on top of stack to 0 (remove it)
        stack[size - 1] = 0;
        }
        // If the stack is empty print out statement
        else {
            System.out.println("The stack is empty.");
        }
        
        // Decrement size so next push/pop will be added to correct index
        size--;
    }
    
    public void peek () {
        // Print out the number of top of the stack (size - 1 because size is where the next would be added)
        System.out.println(stack[size - 1] + " is currently on the top of the stack.");
    }
}
