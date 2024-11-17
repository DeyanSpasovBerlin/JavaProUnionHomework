package org.example.Homework_15_11_2024.Task1;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Start {
    Scanner reader = new Scanner(System.in);
    Reservuar re = new Reservuar();
//    Random rand = new Random();
    public  void startJoke(){
        do{
            System.out.print("\tDo you wont a joke?         \t Exit\n");
            System.out.print("\t        Y                    \t  E\n");
            String chois = reader.nextLine();
            if(chois.toUpperCase().equals("Y")){
                Supplier<String> randomJoke =() ->{
                    return re.getInputList().get(new Random().nextInt(re.getInputList().size()));
                };
                System.out.println(randomJoke.get());
            } else if (chois.toUpperCase().equals("E")) {
                System.out.println("GOOOOOODbyе!");
                break;
            }else {
                System.out.println(" Only Y and E are allowed!");
                continue;
            }
        }while (true);
    }
}
