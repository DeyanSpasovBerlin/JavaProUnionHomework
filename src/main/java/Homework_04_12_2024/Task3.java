package org.example.Homework_04_12_2024;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.io.*;

public class Task3 {
    File file = new File("org/example/resources/Homework_04_12_202/errors.log");

    public int divisionBy0Exeption(int a,int b) throws DivisinBu0{
        if(b == 0){
            throw new DivisinBu0("Division by 0 is forbiden!\n");
        }
        return a/b;
    }
    public void calldivisionBy0Exeption(int a,int b) {
        try {
            divisionBy0Exeption(a, b);
        } catch (DivisinBu0 e) {
            System.out.println("Forbiden action!");
            e.printStackTrace();
            try (Writer writer = new FileWriter(String.valueOf(file),true); // implements Closable
                 BufferedWriter bufferedWriter = new BufferedWriter(writer);
            ){
                bufferedWriter.write(e.getMessage());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }


        }
    }
}


//org/example/resources/Homework_04_12_202