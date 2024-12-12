package org.example.Homework15_29_10_2024.task2;

public class MasterCard {
    private int masterCardId;

    public MasterCard(int masterCardId) {
        this.masterCardId = masterCardId;
    }

    public int getMasterCardId() {
        return masterCardId;
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "masterCardId=" + masterCardId +
                '}';
    }
}
