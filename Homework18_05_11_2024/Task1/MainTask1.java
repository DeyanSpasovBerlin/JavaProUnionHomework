package org.example.Homework18_05_11_2024.Task1;

import static org.example.Homework18_05_11_2024.Task1.MyStack.lg;
import static org.example.Homework18_05_11_2024.Task1.MyStack.s;

public class MainTask1 {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        System.out.println("Check push method:");
        for (int i = 0; i < lg; i++) {
            System.out.println(s[i]);
            ms.push(s[i]);
        }
        System.out.println("------------");
        //ms.push("Over"); // Ето проверка на появление ArrayIndexOutOfBoundsException
        System.out.println("------------");
        System.out.println("Check peek method:");
        System.out.println(ms.peek());
        System.out.println("------------");
        System.out.println("Check size method:");
        System.out.println(ms.size());
        System.out.println("------------");
        System.out.println("Check isEmpty method:");
        System.out.println(ms.isEmpty());
        System.out.println("------------");
        System.out.println("Check pop method:");
        for (int i =0;i< lg; i++){
            System.out.println(ms.pop());
        }
        System.out.println("------------");
        System.out.println(ms.pop());
        System.out.println("------------");
        System.out.println("Check isEmpty method:");
        System.out.println(ms.isEmpty());
    }
}
