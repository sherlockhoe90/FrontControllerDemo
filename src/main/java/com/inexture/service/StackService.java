package com.inexture.service;

import com.inexture.frontcontrollerdemo.FrontControllerDemoApplication;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class StackService {
    private LinkedList<Integer> stack;

    public StackService() {
        this.stack = new LinkedList<>();
    }
    // inserting/pushing a number to the end of the linked list
    public String push(int number) {
        stack.add(number);
        System.out.println("Pushed: " + number);
        System.out.println("Stack: " + stack);
        return "Pushed '"+number+"' into the stack.\nThe Stack: "+stack;
    }

    // deleting and returning a number from the end of the linked list
    public String pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return "Stack Empty";
        }

        int popped = stack.removeLast();
        System.out.println("Popped: " + popped);
        System.out.println("Stack: " + stack);
        return "Popped '"+popped+"' from the stack.\nThe Stack: "+stack;
    }

    public LinkedList<Integer> getStack() {
        return stack;
    }
}
