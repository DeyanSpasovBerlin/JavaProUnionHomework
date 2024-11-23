package org.example.Summary_22_11_2024;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;
    private boolean isActive;
    private String department;

    public Employee(){};

    public Employee(String name, String surname, int age, int workingHoursInMonth, boolean isActive, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
        this.isActive = isActive;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", workingHoursInMonth=" + workingHoursInMonth +
                ", isActive=" + isActive +
                ", department='" + department + '\'' +
                '}';
    }
}
