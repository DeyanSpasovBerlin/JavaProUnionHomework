package org.example.Algoritms.Lesson18_11_2024;

import java.util.Arrays;

public class Main11_11_2024 {
    public static void main(String[] args) {
        DynamicArray dna = new DynamicArray();
        System.out.println("Initial null array (negative count mean empty array):");
        System.out.println(dna);
        System.out.println("Add 1 element=5:");
        dna.addElement(5);
        System.out.println(dna);
        System.out.println("Add ones more time 1 element=11:");
        dna.addElement(11);
        System.out.println(dna);
        System.out.println("Add  3 elements {15,16,17}:");
        dna.addElement(15);
        dna.addElement(16);
        dna.addElement(17);
        System.out.println(dna);
        System.out.println("Remove 1 element:");
        dna.remove();
        System.out.println(dna);
        System.out.println("Remove 2 aditional time 2 elements:");
        dna.remove();
        dna.remove();
        System.out.println(dna);
        System.out.println("Add  2 elements {21,22}:");
        dna.addElement(21);
        dna.addElement(22);
        System.out.println(dna);
        System.out.println("Remove 4 element:");
        dna.remove();
        dna.remove();
        dna.remove();
        dna.remove();
        System.out.println(dna);
        System.out.println("Try to remove element from empty array (negative count mean empty array):");
        dna.remove();
        System.out.println("Add  4 elements {55,56,57,58}:");
        dna.addElement(55);
        dna.addElement(56);
        dna.addElement(57);
        dna.addElement(58);
        System.out.println(dna);

    }
}
