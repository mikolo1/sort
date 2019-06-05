package com.mikolo.algs.Structures.Stack;

import com.mikolo.algs.Interfaces.IStack;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Stack implements IStack {

    private StackItem[]stackItems;
    private int top = -1;
    private static int numberOfStackOnStack = 0;

    public Stack(int stackSize){
        this.stackItems = new StackItem[stackSize];
        numberOfStackOnStack ++;
    }
    Date date;
    @Override
    public void push(StackItem i) {
        if(top==stackItems.length-1)throw new StackOverflowError();
        stackItems[++top] = i;
    }

    @Override
    public StackItem pop() {
        if(isEmpty())throw new ArrayIndexOutOfBoundsException();
        return stackItems[top--];
    }

    @Override
    public boolean isEmpty() {
        return top <0;
    }

    @Override
    public StackItem top() {
        return stackItems[top];
    }

    @Override
    public void printStack() {
        for (int i = top; i>= top; i--){
            System.out.println(stackItems[i]);
        }

    }

    private void printnumberOfStackOnStack(){
        System.out.println(numberOfStackOnStack);
    }
}
