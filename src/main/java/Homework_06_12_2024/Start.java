package Homework_06_12_2024;

import java.util.Scanner;

public class Start {
    Scanner reader = new Scanner(System.in);
    Task1 task1 = new Task1();
    Task2 task2 = new Task2();
    Task3 task3 =  new Task3();
    public void start(){
        Boolean flag = true;
        while (flag){
            System.out.print("\tTask1    \tTask2    \tTask3              \t Exit\n");
            System.out.print("\t  1       \t  2      \t  3                \t  E\n");
            String chois = reader.nextLine().toUpperCase();
            switch (chois){
                case "1" -> {
                    task1.validateTelNum("123 4567");
                    task1.validateTelNum("1234567");
                    task1.validateTelNum("123-4567");
                    task1.validateTelNum("023-4567");System.out.print("\t0 in first position\n");;//0 in first position
                    task1.validateTelNum("12334567");System.out.print("\t8 num\n");// 8 num
                    task1.validateTelNum("123  4567");System.out.print("\t2 space\n");//2 space
                    task1.validateTelNum("123_4567");System.out.print("\tunder score\n");//under score
                    System.out.println("-----------------");
                }
                case "2" -> {
                    task2.validateEmail("dac@abv.bg");
                    task2.validateEmail("dfdfff_h-u.ac@abv.bg");
                    task2.validateEmail("pislpe@gmail.com");
                    task2.validateEmail("pis@lpe@gmail.com"); System.out.print("\tTwo @\n");//2 @
                    task2.validateEmail("pislpe@gm.ail.com");System.out.print("\tTwo .\n");//2 ..
                    task2.validateEmail("0pislpe@gmail.com");System.out.print("\tFirst sign is num\n");//first sign is num
                    task2.validateEmail("pislpe@gm ail.com");System.out.print("\tHas space\n");//space
                    task2.validateEmail("pis lpe@gmail.com");System.out.print("\tHas space in first part\n");//space
                    task2.validateEmail("pislpe@gmail.c om");System.out.print("\tHas space in third part\n");//space
                    task2.validateEmail("pislpe@gmail.c-om");System.out.print("\tHas - in third  part\n");//space
                    task2.validateEmail("pislpe@gmail.c.om");System.out.print("\tHas . in third  part\n");
                    System.out.println("-----------------");
                }
                case "3" -> {
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


                case "E" -> {
                    System.out.println("GOOOOOODbyе!");
                    flag = false;
                }
                default -> System.out.println(" Only 1,2,3 and E are allowed!");
            }
        }
    }

}
