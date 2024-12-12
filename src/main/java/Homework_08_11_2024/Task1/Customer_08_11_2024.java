package Homework_08_11_2024.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Customer_08_11_2024 {
    private String name;
    private String email;
    private String country;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer_08_11_2024(int bonusAmount, String country, String email, boolean isEmailConfirmed, String name) {
        this.bonusAmount = bonusAmount;
        this.country = country;
        this.email = email;
        this.isEmailConfirmed = isEmailConfirmed;
        this.name = name;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer_08_11_2024 customer = (Customer_08_11_2024) o;
        return bonusAmount == customer.bonusAmount && isEmailConfirmed == customer.isEmailConfirmed && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(country, customer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, country, bonusAmount, isEmailConfirmed);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bonusAmount=" + bonusAmount +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", isEmailConfirmed=" + isEmailConfirmed +
                '}';
    }
    public Map<String,String> getmapEmailCountry(Set<Customer_08_11_2024> custSet){
        Map<String,String> mapEmailCountry = new HashMap<>();
        for (Customer_08_11_2024 cus : custSet){
            mapEmailCountry.put(cus.getEmail(),cus.getCountry());
        }
        return mapEmailCountry;
    }
    public Map<String,String> getmapEmailBuyer(Set<Customer_08_11_2024> custSet){
        Map<String,String> mapEmailBuyer = new HashMap<>();
        for (Customer_08_11_2024 cus : custSet){
            mapEmailBuyer.put(cus.getEmail(),cus.getName());
        }
        return mapEmailBuyer;
    }
    public Map<Boolean, Integer> getisEmailConfirmed(Set<Customer_08_11_2024> custSet){
        Map<Boolean, Integer> isEmailConfirmed = new HashMap<>();
        int confirmed =0;
        int regect = 0;
        for (Customer_08_11_2024 cus : custSet){
            if(cus.isEmailConfirmed()){
               isEmailConfirmed.put(true,++confirmed) ;
            }else {
                isEmailConfirmed.put(false,++regect);
            }
        }
        return isEmailConfirmed;
    }
    public Map<String, Integer> getCountryBomus(Set<Customer_08_11_2024> custSet){
        Map<String, Integer> countryBomus = new HashMap<>();
        Integer bonus = 0;
        for (Customer_08_11_2024 cus : custSet) {
            if(countryBomus.containsKey(cus.getCountry())){
                bonus = countryBomus.get(cus.getCountry()) + cus.getBonusAmount();
                //System.out.println("bonus= "+bonus);
                countryBomus.put(cus.getCountry(),bonus);
            }else {
                countryBomus.put(cus.getCountry(),cus.getBonusAmount());
            }

        }
        return countryBomus;
    }
    public Map<String, Integer> getCountryBuyer(Set<Customer_08_11_2024> custSet){
        Map<String, Integer> countryBuyer = new HashMap<>();
        Integer buyer = 0;
        for (Customer_08_11_2024 cus : custSet) {
            if(countryBuyer.containsKey(cus.getCountry())){
               // ++buyer ;
                //System.out.println("bonus= "+bonus);
                countryBuyer.put(cus.getCountry(),countryBuyer.get(cus.getCountry())+1);
            }else {
                countryBuyer.put(cus.getCountry(),1);
            }

        }
        return countryBuyer;
    }
}
