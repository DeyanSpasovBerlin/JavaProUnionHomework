package org.example.Lesson_2024_12_05;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println(Pattern.matches("[0-9]{4}", "1234")); // one or many times
        System.out.println(Pattern.matches("F[1-9]{1}[1-2]{1}", "F12"));
        System.out.println(Pattern.matches("F[1-9]{1}[1-2]{1}", "F15"));
        System.out.println(Pattern.matches("F[1]{1}[1-2]{1}", "F91"));
        System.out.println(Pattern.matches("F[1]{1}[1-2]{1}", "F91"));
        System.out.println(Pattern.matches("F[0-9]?+F[1]?[1-2]?", "F2"));

        System.out.println(Pattern.matches("https://[a-zA-Z]+[//.][a-zA-Z]+", "https://someaddress.someending"));
    }
}
  /*

  1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
3) Напишите регулярное выражение, которое соответствует URL-адресу сайта вида https://someaddress.someending
   */