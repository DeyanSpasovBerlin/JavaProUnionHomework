package Homework_04_12_2024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
//    public static void method1() {
//        System.out.println(1 / 0);
//    }
    public static void method2(String s) {
        if(s == null){
            throw new NullPointerException("nulls everywhere!");
        }
    }
    public static void method3(String s) throws IOException {
        if(s.equals("")){
            throw new IOException("File not found");
        }
    }
    public void call3Method(){
        try {
            method1(3,0);
        } catch (DivisinBu0 e) {
            System.out.println("Forbiden action!");
            e.printStackTrace();
        }
        try {
            String s = null;
            method2(s);
        }catch (NullPointerException e){
            System.out.println("String = null!");
            e.printStackTrace();
        }

        try {
            method3("");
            } catch ( IOException ex) {//IOException ex
            System.out.println("No such File!");
            ex.printStackTrace();
        }





    }
    public int method1(int a,int b) throws DivisinBu0{
        if(b == 0){
            throw new DivisinBu0("Division by 0 is forbiden!");
        }
        return a/b;
    }
}
