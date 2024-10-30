package org.example.Homework15_29_10_2024.task1;

import java.util.*;

public class MainTask1 {
    public static void main(String[] args) {
        Student stud1 = new Student("John","Deer");
        Student stud2 = new Student("John","Bear");
        Student stud3 = new Student("Jack","London");
        Student stud4 = new Student("Rohn","London");
        Student stud5 = new Student("Pol","Dirak");
        Student stud6 = new Student("Pol","Dirak");
        List<Student> students = new LinkedList<Student>(List.of(stud1,stud2,stud3,stud4,stud5,stud6));
        LinkedList<Student> copy1Students = new LinkedList<>(students);
        Collections.sort(copy1Students);
        System.out.println("The original list is:");
        for (Student s : students){
            System.out.print("\t"+s);
        }
        System.out.println("\n*****************");
        System.out.println("Sorted list is:");
        for (Student s : copy1Students){
            System.out.print("\t"+s);
        }
        System.out.println("\n*****************");
        LinkedList<Student> copy2Students = new LinkedList<>(students);
        System.out.println("Sorted list by name is:");
        Collections.sort(copy2Students, new Student.StudentNameComparator());
        for (Student s : copy2Students){
            System.out.print("\t"+s);
        }
        System.out.println("\n*****************");
        System.out.println("Sorted list by Name is:");
        Collections.sort(copy2Students, new Student.StudentSurNameComparator());
        for (Student s : copy2Students){
            System.out.print("\t"+s);
        }
        System.out.println("\n*****************");
        SortedSet<Student> studSet = new TreeSet<>(new Student.StudentNameComparator()) ;
        studSet.add(stud1);
        studSet.add(stud2);
        studSet.add(stud3);
        studSet.add(stud4);
        studSet.add(stud5);
        studSet.add(stud6);
        System.out.println("Sorted TreeSet by Name is:");
        for (Student s : studSet){
            System.out.print("\t"+s);
        }
        System.out.println("\n*****************");
        SortedSet<Student> studSurNameSet = new TreeSet<>(new Student.StudentSurNameComparator()) ;
        studSurNameSet.add(stud1);
        studSurNameSet.add(stud2);
        studSurNameSet.add(stud3);
        studSurNameSet.add(stud4);
        studSurNameSet.add(stud5);
        studSurNameSet.add(stud6);
        System.out.println("Sorted TreeSet by surName is:");
        for (Student s : studSurNameSet){
            System.out.print("\t"+s);
        }

    }
}
