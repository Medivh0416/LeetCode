package edu.leetcode.stack;

import java.util.Stack;

public class ImplementQueuebyTwoStacks {
	private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    /**
     * Easy:
     * Set up two skack
     * Stack: First come, last Go
     * Queue: First come, first Go
     */
    public ImplementQueuebyTwoStacks() {
       stack1=new Stack<Integer>();
       stack2=new Stack<Integer>();
    }
    
    public void push(int element) {
        stack1.push(element);
    }

    public int pop() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int value=stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return value;
    }

    public int top() {
        while(!stack1.empty()){
            stack2.push(stack1.pop());
        }
        int value=stack2.peek();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return value;
    }

}
