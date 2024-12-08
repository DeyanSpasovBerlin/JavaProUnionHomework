package org.example.Homework_06_12_2024;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
//    Напишите метод проверки логина и пароля. Создать статический метод
//    который принимает на вход три параметра: login, password и confirmPassword.
//    Login должен содержать только латинские буквы, длина login должна быть от 3 до 20 символов.
//    Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//    Password должен содержать только цифры и латинские буквы. Длина password должна
//    быть от 5 до 20 символов. Также password и confirmPassword должны быть равны.
//    Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//    WrongPasswordException и WrongLoginException - пользовательские классы исключения
//    с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения
//    и передает его в конструктор класса Exception. Обработка исключений проводится внутри метода.
//    Используем multi-catch block. Метод возвращает true, если значения верны или
//    false в другом случае. Пример вызова метода:
//    checkLoginAndPassword(john, 1234a, 1234a) --> true checkLoginAndPassword(john, 12345, 123456)
//    --> false checkLoginAndPassword(john, 12345@, 12345@) -->
//    false checkLoginAndPassword(john1, 12345, 12345) --> false
        public Boolean validateLoginPass(String login,String pass, String confirmPass){
            Boolean resLogin = null;
            Boolean resPass = null;
            Boolean resConfirmPass = null;
            System.out.println("\tInput data:  \t login: " + login + "  \tpass: " + pass +
                    "  \tconfirmPass: " + confirmPass);
            try {
                String regexLogin = "[a-zA=Z]{3,20}";
                Pattern patternLogin = Pattern.compile(regexLogin, Pattern.CASE_INSENSITIVE);
                Matcher matcherLogin = patternLogin.matcher(login);
                 resLogin = matcherLogin.matches();
                System.out.println("resLogin = " + resLogin);
                if (!resLogin) {
                    throw new WrongLoginException("Login contein only a-z and only 3-20 sign!");
                }
            }catch (WrongLoginException e){
                System.out.println("Wrong login!");
                e.printStackTrace();
            }

            try {
                String regexPass = "[\\w]{5,20}";
                Pattern paternPass = Pattern.compile(regexPass, Pattern.CASE_INSENSITIVE);
                Matcher matcherPass = paternPass.matcher(pass);
                resPass = matcherPass.matches();
                System.out.println("resPass = " + resPass);
                if(!resPass){
                    throw new WrongPasswordException("Pass contein only a-z, 0-9 and only 5-20 sign!");
                }
            }catch (WrongPasswordException e){
                System.out.println("Wrong Pass!");
                e.printStackTrace();
            }

            try {
                String regexConfirmPass = pass;
                Pattern paternConfirmPass = Pattern.compile(regexConfirmPass);
                Matcher matcherConfirmPass = paternConfirmPass.matcher(confirmPass);
                resConfirmPass = matcherConfirmPass.matches();
                System.out.println("resConfirmPass = " + resConfirmPass);
                if(!resConfirmPass){
                    throw new WrongPasswordException("The Pass and ConfirmPass are diferent!");
                }
            }catch (WrongPasswordException e){
                System.out.println("Wrong confirmPass!");
                e.printStackTrace();
            }

            Boolean res = resLogin && resPass && resConfirmPass;
            System.out.println("resLogin && resPass && resConfirmPass = "+res);
            System.out.println("\tInput data:  \t login: " + login + "  \tpass: " + pass +
                    "  \tconfirmPass: " + confirmPass + "  \tresult: " + res);

            return res;
        }

    public Boolean validateLoginPassMultiCatch(String login,String pass, String confirmPass) {
        Boolean resLogin = null;
        Boolean resPass = null;
        Boolean resConfirmPass = null;
        System.out.println("\tInput data:  \t login: " + login + "  \tpass: " + pass +
                "  \tconfirmPass: " + confirmPass);
        try {
            String regexLogin = "[a-zA=Z]{3,20}";
            Pattern patternLogin = Pattern.compile(regexLogin, Pattern.CASE_INSENSITIVE);
            Matcher matcherLogin = patternLogin.matcher(login);
            resLogin = matcherLogin.matches();
            System.out.println("resLogin = " + resLogin);
            if (!resLogin) {
                throw new WrongLoginException("Login contein only a-z and only 3-20 sign!");
            }
            String regexPass = "[\\w]{5,20}";
            Pattern paternPass = Pattern.compile(regexPass, Pattern.CASE_INSENSITIVE);
            Matcher matcherPass = paternPass.matcher(pass);
            resPass = matcherPass.matches();
            System.out.println("resPass = " + resPass);
            if (!resPass) {
                throw new WrongPasswordException("Pass contein only a-z, 0-9 and only 5-20 sign!");
            }
            String regexConfirmPass = pass;
            Pattern paternConfirmPass = Pattern.compile(regexConfirmPass);
            Matcher matcherConfirmPass = paternConfirmPass.matcher(confirmPass);
            resConfirmPass = matcherConfirmPass.matches();
            System.out.println("resConfirmPass = " + resConfirmPass);
            if (!resConfirmPass) {
                throw new WrongPasswordException("The Pass and ConfirmPass are diferent!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Wrong input!");
            e.printStackTrace();
        }
        Boolean res = resLogin && resPass && resConfirmPass;
        System.out.println("resLogin && resPass && resConfirmPass = "+res);
        System.out.println("\tInput data:  \t login: " + login + "  \tpass: " + pass +
                "  \tconfirmPass: " + confirmPass + "  \tresult: " + res);
        return res;
    }

}
