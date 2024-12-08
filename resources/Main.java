package org.example.resources;

import org.example.Homework_06_12_2024.Task1;
import org.example.Homework_06_12_2024.Task2;
import org.example.Homework_06_12_2024.Task3;

public class Main {
    public static void main(String[] args) {
//        1 уровень сложности: 1) Напишите регулярное выражение,
//        которое соответствует любому номеру телефона согласно формату:
//        телефонный номер состоит из 7 цифр подряд или из 3х цифр,
//        пробела или тире, а затем из 4 цифр (1234567, 123-4567, 123 4567).

        Task1 task1 = new Task1();
        task1.validateTelNum("123 4567");
        task1.validateTelNum("1234567");
        task1.validateTelNum("123-4567");
        task1.validateTelNum("023-4567");//0 in first position
        task1.validateTelNum("12334567");// 8 num
        task1.validateTelNum("123  4567");//2 space
        task1.validateTelNum("123_4567");//under score
        System.out.println("-----------------");
        Task2 task2 = new Task2();
        task2.validateEmail("dac@abv.bg");
        task2.validateEmail("pislpe@gmail.com");
        task2.validateEmail("pis@lpe@gmail.com");//2 @
        task2.validateEmail("pis@lpe@gm.ail.com");//2 ..
        task2.validateEmail("pis lpe@gmail.com");//space
        System.out.println("-----------------");
        Task3 task3 =  new Task3();
        task3.validateLoginPass("dsgsAjhsksk","0dak1jli5i9","0dak1jli5i9");
        System.out.println("-----------------");
        task3.validateLoginPass("dsgs1Ajhsksk","0dak1jli5i9","0dak1jli5i9");////1)Login has num1;
        System.out.println("-----------------");
        task3.validateLoginPass("dsgsAjhsksk","0da","0da");// Pass is small than 5 sign;
        System.out.println("-----------------");
        task3.validateLoginPass("dsgsAjhsksk","0daj18od4","0daj19od4");//ConfirmPass is diferent from Pass
        System.out.println("-----------------");
        task3.validateLoginPass("dsgs1Ajhsksk","0dak1jl i5i9","0dak2jli5i9");//1)Login has num1;
        // Pass has space;ConfirmPass is diferent from Pass
        System.out.println("-----------------");
        task3.validateLoginPass("john","1234a","1234a");
        System.out.println("-----------------");
        task3.validateLoginPass("john","12345","123456");
        System.out.println("-----------------");
        task3.validateLoginPass("john","12345@","12345@");
        System.out.println("-----------------");
        task3.validateLoginPass("john1","12345","12345");
        System.out.println("-----------------");
        System.out.println("Общий блок catch (WrongLoginException | WrongPasswordException e) не позволяет детальное сообщение\n " +
                "что имменно случилось. Разбиение на отдельных блоках\n" +
                "tru-catch позволяет для каждого случая отдельное сообщение. ");
        System.out.println("-----------------");
        task3.validateLoginPassMultiCatch("john","1234a","1234a");
        System.out.println("-----------------");
        task3.validateLoginPassMultiCatch("john","12345","123456");
        System.out.println("-----------------");
        task3.validateLoginPassMultiCatch("john","12345@","12345@");
        System.out.println("-----------------");
        task3.validateLoginPassMultiCatch("john1","12345","12345");
        System.out.println("-----------------");

    }
}
