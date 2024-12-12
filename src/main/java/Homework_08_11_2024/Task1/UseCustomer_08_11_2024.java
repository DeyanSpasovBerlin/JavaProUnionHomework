package org.example.Homework_08_11_2024.Task1;

import Homework_08_11_2024.Task1.Customer_08_11_2024;

import java.util.*;

public class UseCustomer_08_11_2024 {
    public static void main(String[] args) {
        Customer_08_11_2024 cus0 =  new Customer_08_11_2024(8,"Bg","aza.gmail.com",true, "John");
        Customer_08_11_2024 cus1 = new Customer_08_11_2024(5,"En","aaa@gmail",true,"John");
        Customer_08_11_2024 cus2 = new Customer_08_11_2024(4,"Fr","bbb@gmail",false,"Ben");
        Customer_08_11_2024 cus3 = new Customer_08_11_2024(3,"De","ccc@gmail",true,"Jorge");
        Customer_08_11_2024 cus4 = new Customer_08_11_2024(6,"It","ddd@gmail",false,"Ralf");
        Customer_08_11_2024 cus5 = new Customer_08_11_2024(1,"Be","oxa@gmail",true,"Ivan");
        Customer_08_11_2024 cus6 = new Customer_08_11_2024(6,"Be","opxa@gmail",false,"Bogdan");
        Customer_08_11_2024 cus7 = new Customer_08_11_2024(5,"De","ctc@gmail",true,"Johanson");
        Customer_08_11_2024 cus8 = new Customer_08_11_2024(3,"It","didd@gmail",false,"Jovani");
        Customer_08_11_2024 cus9 = new Customer_08_11_2024(11,"It","ddi@gmail",true,"Marcella");
        Customer_08_11_2024 cus10 = new Customer_08_11_2024(13,"De","dtc@gmail",false,"Rielke");
        Customer_08_11_2024 cus11 = new Customer_08_11_2024(7,"De","ctd@gmail",true,"Bergmann");



        Set<Customer_08_11_2024> custSet = new HashSet<>(List.of(cus0,cus1,cus2,cus3,cus4,cus5,cus6,cus7,cus8,cus9,
                cus10,cus11));
        System.out.println("Set of Customer_08_11_2024 objects:");
        System.out.println(custSet);
        System.out.println("---------------");
        Map<String, String> mapEmailCountry = cus0.getmapEmailCountry(custSet);
        System.out.println("Map email-country:");
        System.out.println(mapEmailCountry);
        System.out.println("---------------");
        Map<String,String> mapEmailBuyer = cus0.getmapEmailBuyer(custSet);
        System.out.println("Map email-Buyer:");
        System.out.println(mapEmailBuyer);
        System.out.println("---------------");
        Map<Boolean, Integer> isEmailConfirmed = cus0.getisEmailConfirmed(custSet);
        System.out.println("Map isEmailConfirmed-number:");
        System.out.println(isEmailConfirmed);
        System.out.println("---------------");
        Map<String, Integer> countryBomus = cus0.getCountryBomus(custSet);
        System.out.println("Map country-total bonus:");
        System.out.println(countryBomus);
        System.out.println("---------------");
        Map<String, Integer> countryBuyer = cus0.getCountryBuyer(custSet);
        System.out.println("Map country-total Buyer:");
        System.out.println(countryBuyer);

    }
}
