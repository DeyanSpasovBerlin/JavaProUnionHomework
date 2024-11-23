package org.example.Summary_22_11_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


         // Дан список кошек
        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 6, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        Cat cat6 = new Cat("Vasya", 5, "black", false);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6);

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
//        List<String> combinations = list1.stream()
//                .flatMap(i -> list1.stream()
//                        .flatMap(j -> list2.stream()
//                                .map(k -> "(" + i + ", " + j + ", " + k + ")")))
//                .toList();
//        System.out.println("All variation clas 3 set 3 " + combinations);
//        List<Integer> combinations2 = list1.stream().flatMap(i -> list2.stream().map(k ->"["+i+","+k+"]").toList();
//        System.out.println("combinations2 = "+combinations2);


        Employee employee1 = new Employee("Tim", "Smith", 23, 40, true, "IT");
     Employee employee2 = new Employee("Jane", "Smith", 45, 30, false, "STOCK");
     Employee employee3 = new Employee("Inna", "Smith", 32, 20, true, "IT");
     Employee employee4 = new Employee("Mark", "Smith", 47, 40, false, "ACCOUNTING");
     Employee employee5 = new Employee("John", "Smith", 23, 40, true, "STOCK");
     Employee employee6 = new Employee("Nina", "Smith", 12, 20, false, "IT");
     List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);
        Employee emp = new Employee();
//        С помощью коллекторов создать Map:
//        - <name / Employee>
        Map<String, Employee> nameEmpl = employees.stream().collect(Collectors.toMap(Employee::getName,employee ->employee ));
        System.out.println("<name / Employee> = "+nameEmpl);
//        - <age / количество>
        Map<Integer, Integer> ageEmplQuon = employees.stream().collect(Collectors.toMap(Employee::getAge, employee -> 1, Integer::sum));
        System.out.println("<age / количество> = "+ageEmplQuon);
//        - <isActive / количество>
        Map<Boolean, Integer> isActiveEmplQuon = (Map<Boolean, Integer>) employees.stream().collect(Collectors.toMap(Employee::isActive,
                employee -> 1, Integer::sum));
        System.out.println("<isActive / количество> = "+isActiveEmplQuon);
//        - <department / список сотрудников>
        Map<String,List<Employee> > departmentEmpl = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("<department / список сотрудников> = "+departmentEmpl);
//        - <department / общая сумма рабочих часов>
        Map<String, Integer> departmenEmplworkingHoursInMonth = employees.stream().collect(Collectors.
                groupingBy(Employee::getDepartment, Collectors.mapping(
                        Collectors.summingInt(e-> Employee::getWorkingHoursInMonth Integer::sum)) ));  //-> 1, Integer::sum //value -> value ? 1 : 0
        System.out.println("<department / общая сумма рабочих часов> = "+departmenEmplworkingHoursInMonth);

    }

        static class Cat {
        private String name;
        private int age;
        private String colour;
        private boolean isHungry;

        public Cat(String name, int age, String colour, boolean isHungry) {
            this.name = name;
            this.age = age;
            this.colour = colour;
            this.isHungry = isHungry;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getColour() {
            return colour;
        }

        public boolean isHungry() {
            return isHungry;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", colour='" + colour + '\'' +
                    ", isHungry=" + isHungry +
                    '}';
        }
    }

}


/*
Cat cat1 = new Cat("Tom", 2, "black", true);
Cat cat2 = new Cat("Mikky", 1, "white", false);
Cat cat3 = new Cat("Vasya", 3, "white", true);
Cat cat4 = new Cat("Steve", 1, "grey", false);
Cat cat5 = new Cat("Bob", 2, "black", true);
Cat cat6 = new Cat("Vasya", 5, "black", false);
List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6);
 */