package org.example.Homework_19_11_2024.Task3;

import java.util.ArrayList;
import java.util.List;
public class Task3 {
    private  List<String> nameList = List.of("Tom","Nike","Emma","Mary","Tom","Jane","John","Ella");
    public void findName(){
        System.out.println("Initial list of names:");
        System.out.println(nameList);
        System.out.println("Из списка имен вывести первые три по алфавиту, предпоследнее имя по алфавиту");
        System.out.println("Sorted list:");
        List<String> sortedNameList =  new ArrayList<>();
        nameList.stream().sorted().forEach(sortedNameList::add);
        System.out.println(sortedNameList);
        System.out.println("первые три по алфавиту, предпоследнее имя по алфавиту");
        sortedNameList.stream().limit(3).forEach(s ->System.out.print("\t"+s));
        sortedNameList.stream().skip(sortedNameList.size() - 2).limit(1).forEach(s ->System.out.print("\t  " +s+"\n"));


    }

}
