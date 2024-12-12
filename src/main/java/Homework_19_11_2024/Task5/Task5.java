package org.example.Homework_19_11_2024.Task5;



import java.util.*;
import java.util.stream.Collectors;

public class Task5 {

        List<Employee> employees = Arrays.asList(
                new Employee("Tom", "Smiths", 23, 40),
                new Employee("Tom", "Smiths", 23, 40),
                new Employee("Nike", "Smiths", 23, 26),
                new Employee("Emma", "Bear", 35, 29),
                new Employee("Mary", "Smiths", 23, 40),
                new Employee("Tom", "Weinberg", 23, 20),
                new Employee("Jane", "Smiths", 32, 35),
                new Employee("John", "Smiths", 19, 40),
                new Employee("Ella", "Leroy", 29, 31)
        );

    public Task5() {};

    public Task5(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void task5() {
        System.out.println("Initial list of employees:");
        System.out.println("employees = " + employees);
        //employees.forEach(e -> System.out.println(e.getAge()));// proben test
        List<Employee> sortedEmployeeByAge = new ArrayList<>();
        sortedEmployeeByAge = employees.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).toList();
        //System.out.println("sortedEmployeeByAge = " + sortedEmployeeByAge);// proben test
        System.out.println("-----------------");
        List<Employee> sortedEmployeeByAgeFilterByAge = new ArrayList<>();
        sortedEmployeeByAge.stream().takeWhile(e -> e.getAge() > 20)
                .forEach(sortedEmployeeByAgeFilterByAge::add);
        System.out.println("-----------------");// proben test
        System.out.println("Filtered list by age > 20 with takeWhile method");
        System.out.println("sortedEmployeeByAgeFilterByAge = " + sortedEmployeeByAgeFilterByAge);
        System.out.println("-----------------");
        System.out.println("Filtered list by age > 20 with partitioningBy method");
        Map<Boolean,List<Employee>> filterAgedEmployee =  employees.stream().collect(Collectors.partitioningBy(e ->e.getAge()>20));
        System.out.println(filterAgedEmployee.get(true));
        System.out.println("-----------------");
        System.out.println("- вывести список сотрудников, работающих более 30 часов:");
        Map<Boolean,List<Employee>> filterWorkHourEmployee =  employees.stream().collect(Collectors.partitioningBy(
                e ->e.getWorkingHoursInMonth()>30));
        System.out.println(filterWorkHourEmployee.get(true));
        System.out.println("-----------------");
        System.out.println("- вывести список сотрудников, с именем, начинающимся на J:");
        Map<Boolean,List<Employee>> nameWithJ = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getName().substring(0,1).equals("J")));
        System.out.println(nameWithJ.get(true));
        System.out.println("-----------------");
        System.out.println("- вывести список фамилий сотрудников с именем John:");
        Map<Boolean,List<Employee>> nameJohn = employees.stream()
                .collect(Collectors.partitioningBy(e -> e.getName().equals("John")));
        System.out.println(nameJohn.get(true));
        System.out.println("-----------------");
        System.out.println("-  вывести список всех уникальных имен сотрудников:");
        List<String> nameUnick = employees.stream()
                .map(e -> e.getName()).distinct().toList();
        System.out.println(nameUnick);
        System.out.println("-----------------");
        System.out.println("- вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J:");
        List<Employee> result = employees.stream().filter(e ->e.getName().substring(0,1).equals("J")).filter(
                e -> e.getWorkingHoursInMonth() > 30).toList();
        System.out.println(result);
        System.out.println("-----------------");
        System.out.println("- Через 2 последовательных partitioningBy:");
        Map<Boolean,List<Employee>>  resultDoublepartitioningBy = filterWorkHourEmployee.get(true).stream()
                .collect(Collectors.partitioningBy(e -> e.getName().substring(0,1).equals("J")));
        System.out.println(resultDoublepartitioningBy.get(true));
    }
}



/*
5. Создать список из экземпляров класса Employee.
public class Employee {
    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;
}

С помощью стримов:
- вывести список активных сотрудников старше 20 лет
- вывести список сотрудников, работающих более 30 часов, с именем, начинающимся на J
- вывести список фамилий сотрудников с именем John
- вывести список всех уникальных имен сотрудников
 */