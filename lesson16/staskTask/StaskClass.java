package org.example.staskTask;

import java.util.List;
import java.util.Stack;

public class StaskClass {
    public boolean staskCheck(Stack<String> st){
        boolean result;
        if(st.isEmpty()){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
    public Stack<String> addElements(List<String> list){
        Stack<String> generatedStack =  new Stack<>();
        for (String s : list){
            generatedStack.push(s);
        }
        return generatedStack;
    }
    public String watchUpperElement(Stack<String> stack){
        String upperElement = "";
        upperElement = stack.peek();
        return upperElement;
    }
    public Stack<String> popEveryElement(Stack<String> stack){
        Stack<String> resultStack  = new Stack<>();
        while (!stack.isEmpty()){
            System.out.print("\t"+stack.pop());
        }
        return resultStack;
    }
}
