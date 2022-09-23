package com.grivera64.datastructure.stack;

/*
 * Name: Giovanni Rivera
 * Instructor: Dr. Chatterjee
 * Course: CSC 311-04
 * Creation Date: 9/23/2022
 * Due Date: 9/29/2022
 * File Name: StackDriver.java
 * Description: Tests the ArrayStack implementation
 */

public class StackDriver {

    public static void main(String[] args) {
//        Stack<Integer> stack = new ArrayStack<>();
        Stack<Integer> stack = new ArrayStack<>(7);

        /* Test Push */
        stack.push(10);
        System.out.printf("Stack: %s\n", stack);

        stack.pop();
        System.out.printf("Stack: %s\n", stack);

//        stack.pop();                                // Stack Underflow!
//        System.out.printf("Stack: %s\n", stack);

        stack.push(20);
        System.out.printf("Stack: %s\n", stack);
        stack.push(30);
        System.out.printf("Stack: %s\n", stack);
        stack.push(40);
        System.out.printf("Stack: %s\n", stack);
        stack.push(50);
        System.out.printf("Stack: %s\n", stack);

        System.out.printf("The top of the stack is: %s\n", stack.peek());

        stack.push(60);
        System.out.printf("Stack: %s\n", stack);
        stack.push(70);
        System.out.printf("Stack: %s\n", stack);

        System.out.printf("The top of the stack is: %s\n", stack.peek());

//        stack.push(80);                         // Stack Overflow: it'll reallocate more space
//        System.out.printf("Stack: %s\n", stack);

        stack.pop();
        System.out.printf("Stack: %s\n", stack);
        stack.pop();
        System.out.printf("Stack: %s\n", stack);
        stack.pop();
        System.out.printf("Stack: %s\n", stack);
        stack.pop();
        System.out.printf("Stack: %s\n", stack);
        stack.pop();
        System.out.printf("Stack: %s\n", stack);
        stack.pop();
        System.out.printf("Stack: %s\n", stack);
//        stack.pop();                                  // Stack Underflow
//        System.out.printf("Stack: %s\n", stack);
    }
}
