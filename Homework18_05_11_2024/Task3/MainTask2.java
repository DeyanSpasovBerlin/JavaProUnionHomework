package org.example.Homework18_05_11_2024.Task3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainTask2 {
    public static void main(String[] args) {
        Customer cus1 = new Customer(5,"aaa@gmail",true,"John");
        Customer cus2 = new Customer(4,"bbb@gmail",false,"Ben");
        Customer cus3 = new Customer(3,"ccc@gmail",true,"Jorge");
        Customer cus4 = new Customer(6,"ddd@gmail",false,"Ralf");
        Customer cus5 = new Customer(1,"oxa@gmail",true,"Ivan");

        Set<Customer> custSet = new HashSet<>(List.of(cus1,cus2,cus3,cus4,cus5));
        System.out.println(custSet);
        custSet = new TreeSet<>(List.of(cus1,cus2,cus3,cus4,cus5));
        System.out.println(custSet);
    }



    }

