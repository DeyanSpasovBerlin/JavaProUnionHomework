package Homework_13_12_2024;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CustomDynamicArray cda = new CustomDynamicArray();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.add(1);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.add(2);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.add(3);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.add(4);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.add(5);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
//        cda.addAt(6,6);//Index is out of bounds
//        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.addAt(2,22);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.growSize();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.removeAt(4);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.remove();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.remove();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.set(1,21);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        System.out.println(cda.contains(21));
        System.out.println(cda.isEmpty());
        cda.clear();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        System.out.println(cda.isEmpty());
        cda = new CustomDynamicArray();
        cda.add(1);
        cda.add(2);
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        Iterator<Integer> iter = cda.iterator();
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        cda.growSize();
        cda.growSize();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
        cda.shrinkSize();
        System.out.println("Data: "+cda+" size: "+cda.getSize()+" last index: "+cda.getCount());
    }
}
