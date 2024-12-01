package org.example.Homework_19_11_2024.Task4;

import java.util.Arrays;
import java.util.List;

public class Task4 {
    List<Cat> cat = Arrays.asList(
            new Cat("Tom", 5, "broun", true),
            new Cat("Nike", 3, "red", false),
            new Cat("Emma", 1, "white", true),
            new Cat("Jane", 52, "broun", false),
            new Cat("Ella", 1, "black", true),
            new Cat("Mary", 4, "broun", false),
            new Cat("Smiths", 51, "broun", true)
    );
    public void catStat(){
        System.out.println("Initiam list of cat:");
        System.out.println(cat);
        System.out.println("вывести список голодных кошек старше 2 лет");
        System.out.println(cat.stream().filter(c -> c.isHungry() == true).filter(c -> c.getAge() > 2).toList());
        System.out.println("вывести список уникальных цветов кошек");
        System.out.println(cat.stream().map(c -> c.getColour()).distinct().toList());
        System.out.println("вывести список имен кошек возраста 1 год");
        System.out.println(cat.stream().filter(c -> c.getAge() == 1).map(c -> c.getName()).toList());
    }
}
