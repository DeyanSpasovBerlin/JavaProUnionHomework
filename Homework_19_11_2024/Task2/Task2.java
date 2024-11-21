package org.example.Homework_19_11_2024.Task2;

import org.example.Homework_19_11_2024.Task5.Task5;
import org.example.Lesson_19_11_2024.Task1.Employee;

import java.util.List;

public class Task2 {
    Task5 task5 = new Task5();
    List<Employee> employees = task5.getEmployees();
    public void nameTom(){
        System.out.println("Initial list of employees:");
        System.out.println(employees);
        System.out.println("С помощью стримов посчитать количество людей с именем \"Tom\" в списке имен");
        System.out.println(employees.stream().filter(e -> e.getName().equals("Tom")).count());
    }
}
