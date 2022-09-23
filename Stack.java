package com.grivera64.datastructure.stack;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/23/2022
 * Due Date: 9/29/2022
 * File Name: Stack.java
 * Description: Represents the "Bare Bones" interface of a Stack's public methods
 */

public interface Stack<E> {

    void push(E element);       // adds elements to the top of the stack
    E pop();                    // removes top element from the stack
    E peek();                   // gets the top element without deleting it
    boolean isEmpty();          // checks if the stack is empty
}
