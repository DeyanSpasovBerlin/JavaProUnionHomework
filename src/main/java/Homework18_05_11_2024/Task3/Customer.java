package org.example.Homework18_05_11_2024.Task3;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private String name;
    private String email;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer(int bonusAmount, String email, boolean isEmailConfirmed, String name) {
        this.bonusAmount = bonusAmount;
        this.email = email;
        this.isEmailConfirmed = isEmailConfirmed;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return bonusAmount == customer.bonusAmount && isEmailConfirmed == customer.isEmailConfirmed && Objects.equals(name, customer.name) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, bonusAmount, isEmailConfirmed);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "bonusAmount=" + bonusAmount +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", isEmailConfirmed=" + isEmailConfirmed +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        int result = this.name.compareTo(o.name);
        if(result == 0){
            result = this.email.compareTo(o.email);
        }
        if (result == 0){
            result = Integer.compare(this.bonusAmount,o.bonusAmount);
        }
        if(result == 0){
            result =  Boolean.compare(this.isEmailConfirmed,o.isEmailConfirmed);
        }
        return result;
    }
}
