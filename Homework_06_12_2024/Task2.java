package org.example.Homework_06_12_2024;

public class Task2 {
//    Напишите метод валидации введенного пользователем адреcа электронной почты.
    public Boolean validateEmail(String email){
        String regex = "([\\w[^@\s]]+)@([\\w[^@\s]]+).([a-z]+)";
        Boolean res = email.matches(regex);
        System.out.println("Validation of the E mail "+email+" is "+res);
        return null;
    }
}
