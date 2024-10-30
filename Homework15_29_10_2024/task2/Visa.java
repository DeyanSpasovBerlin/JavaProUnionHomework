package org.example.Homework15_29_10_2024.task2;

public class Visa {
    private int visaId;

    public Visa(int visaId) {
        this.visaId = visaId;
    }

    public int getVisaId() {
        return visaId;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "visaId=" + visaId +
                '}';
    }
}
