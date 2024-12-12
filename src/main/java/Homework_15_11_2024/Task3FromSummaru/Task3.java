package org.example.Homework_15_11_2024.Task3FromSummaru;

import java.util.List;

public class Task3 {



    public List<String>  probe(Filter fil, List<String> str){
        str.forEach(s ->fil.apply(s));
        return str;
    }

}
