package com.mikolo.algs.Interfaces;

import com.mikolo.algs.Structures.Stack.StackItem;
import com.mikolo.algs.Structures.Stack.StackItem;

public interface IStack {
    void push(StackItem i);
    StackItem pop();
    boolean isEmpty();
    StackItem top();
    void printStack();

}
