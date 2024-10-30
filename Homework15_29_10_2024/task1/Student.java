package org.example.Homework15_29_10_2024.task1;

import java.util.Comparator;

public class Student implements Comparable<Student>{
    private String name;
    private  String surName;

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }



    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if(result == 0){
            result = this.surName.compareTo(o.surName);
        }
        return result;
    }

    public static class StudentNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class StudentSurNameComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o1.getSurName().compareTo(o2.getSurName());
        }
    }

}
