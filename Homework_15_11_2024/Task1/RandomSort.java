package org.example.Homework_15_11_2024.Task1;

import java.awt.*;
import java.util.*;
import java.util.List;

public class RandomSort {
    Random rand = new Random();
    Reservuar res = new Reservuar();
    private ArrayList<String> inputList = (ArrayList<String>) res.getInputList();
    private ArrayList<String> copyList = (ArrayList<String>) inputList.clone();

    public String makeRandomList() {
        String bufer = null;
        if(copyList.isEmpty()){
            copyList = (ArrayList<String>) inputList.clone();
        }
        int randChois = rand.nextInt(copyList.size());
        bufer = copyList.get(randChois);
        copyList.remove(randChois);
        return  bufer;
    }
}
