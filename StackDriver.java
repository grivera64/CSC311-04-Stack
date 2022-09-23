package com.grivera64.datastructure.stack;

public class StackDriver {

    public static void main(String[] args) {
//        Stack<Integer> stack = new ArrayStack<>();
        Stack<Integer> stack = new ArrayStack<>(7);

        stack.push(10);
        System.out.printf("Stack: %s\n", stack);
        stack.push(20);
        System.out.printf("Stack: %s\n", stack);
        stack.push(30);
        System.out.printf("Stack: %s\n", stack);
        stack.push(40);
        System.out.printf("Stack: %s\n", stack);
        stack.push(50);
        System.out.printf("Stack: %s\n", stack);
        stack.push(60);
        System.out.printf("Stack: %s\n", stack);
        stack.push(70);
        System.out.printf("Stack: %s\n", stack);
        stack.push(80);                         // Stack Overflow: it'll reallocate more space
        System.out.printf("Stack: %s\n", stack);
    }
}
