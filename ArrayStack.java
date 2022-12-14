//package com.grivera64.datastructure.stack;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/23/2022
 * Due Date: 9/29/2022
 * File Name: ArrayStack.java
 * Description: Implements the Stack interface using an Array
 */

public class ArrayStack<E> implements Stack<E> {

    private static final int INITIAL_CAPACITY = 5;      // Default capacity of the stack's array

    private E[] arr;                                    // Underlying array for the stack
    private int tosIndex = -1;                          // Top of Stack (TOS) index in the array

    public ArrayStack() {
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative!");
        }
        this.arr = (E[]) new Object[capacity];          // Array created here
    }

    @Override
    public void push(E element) {
        /* Create more space if the capacity is too small for a new element */
        int capacity = this.arr.length - 1;
        if (capacity <= this.tosIndex) {
            System.out.println("Stack Overflow! Reallocating more space...");
            this.reallocate();
        }

        /* Add the element at the new top of the stack */
        tosIndex++;
        this.arr[tosIndex] = element;
    }

    @SuppressWarnings("unchecked")
    private void reallocate() {
        /* Create and copy the old array to the new array (the top of the stack remains unaffected) */
        E[] newArr = (E[]) new Object[this.arr.length * 2];
        System.arraycopy(this.arr, 0, newArr, 0, this.arr.length);
        this.arr = newArr;
    }

    @Override
    public String toString() {
        /* If the array is empty, then print out an empty stack */
        if (this.isEmpty()) {
            return "[]";
        }

        /* Build a String representation of the Stack */
        StringBuilder sb = new StringBuilder("[");
        for (int index = 0; index < tosIndex; index++) {
            sb.append(this.arr[index]);
            sb.append(" | ");
        }

        sb.append(this.arr[tosIndex]);
        sb.append(']');
        return sb.toString();
    }

    @Override
    public E pop() {
        /* Throw an exception when there are no elements to pop */
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack Underflow!");
        }

        /* The top of the stack moves down, acts like deletion */
        E tmp = this.arr[this.tosIndex];
        this.tosIndex--;

        return tmp;
    }

    @Override
    public E peek() {
        /* Throw an exception if there are no elements to peek at */
        if (this.isEmpty()) {
            throw new IllegalStateException("Stack Underflow!");
        }

        /* Return the element at the top of the stack */
        return this.arr[this.tosIndex];
    }

    @Override
    public boolean isEmpty() {
        return this.tosIndex < 0;           // Negative indices are considered empty
    }
}
