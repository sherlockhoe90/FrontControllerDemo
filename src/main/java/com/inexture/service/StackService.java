package com.inexture.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class StackService {
    private LinkedList<Integer> stack;
    private static Logger logger = LogManager.getLogger("LogoutController");


    public StackService() {
        this.stack = new LinkedList<>();
    }
    // inserting/pushing a number to the end of the linked list
    public String push(int number) {
        stack.add(number);
        logger.info("Pushed: " + number);
        logger.info("Stack: " + stack);
        return "Pushed '"+number+"' into the stack.\nThe Stack: "+stack;
    }

    // deleting and returning a number from the end of the linked list
    public String pop() {
        if (stack.isEmpty()) {
            logger.info("Stack is empty.");
            return "Stack Empty";
        }

        int popped = stack.removeLast();
        logger.info("Popped: " + popped);
        logger.info("Stack: " + stack);
        return "Popped '"+popped+"' from the stack.\nThe Stack: "+stack;
    }

    public LinkedList<Integer> getStack() {
        return stack;
    }
}
