package org.example.Homework13_24_10_2024.task1And2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomeworkTask {
    public void readFile(String nameOfFile){
        try {
            File myObj = new File(nameOfFile);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("\n**********************\n");
    }

    public String fileInfo(String nameOfFile){
        File myObj = new File(nameOfFile);
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable " + myObj.canRead());
            System.out.println("File size in bytes " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
        System.out.println("\n**********************\n");
        return myObj.getAbsolutePath();
    }
}
