package org.example.staskTask;

import java.util.List;
import java.util.Stack;

public class MainStaskTask {
    public static void main(String[] args) {
        GenerateList g = new GenerateList();
        System.out.println("We will use the next text to generate List of String for Stack of Strings");
        System.out.println(g.getText1());
        List<String> probenListString = g.splitText();
        System.out.println("Now we declare new Stack<String> stackProben = new Stack<>()");
        Stack<String> stackProben = new Stack<>();
        StaskClass s = new StaskClass();
        System.out.println("The Stask stastackProben is empty?");
        System.out.println(s.staskCheck(stackProben));
        System.out.println("Now we push the list of string in Stack stackProben");
        Stack<String> probenStackString = s.addElements(probenListString);
        System.out.println("Now we check is the new Stack is empty?");
        System.out.println(s.staskCheck(probenStackString));
        System.out.println("Noe we will watch the upper element in Stack:");
        System.out.println(s.watchUpperElement(probenStackString));
        System.out.println("Now we will pop every element from Stack an will remove it and print it:");
        Stack<String> finalStackString = s.popEveryElement(probenStackString);
        System.out.println("\nNow we will check is the final Stack is epty?");
        System.out.println(s.staskCheck(finalStackString));
    }
}
