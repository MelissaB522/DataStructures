/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author melissabakke
 */
public class TestProgram {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new instance of an array based stack, with capacity of 10
        ArrayBasedStack newStack = new ArrayBasedStack(10);
        
        // Add some numbers to the top of the stack
        newStack.push(250);
        newStack.push(56);
        newStack.push(109);
        newStack.push(33);
        newStack.push(98);
        
        // Remove a number from the top of the stack
        newStack.pop();
        
        // See what is currently at the top of the stack
        newStack.peek();
    }
}
