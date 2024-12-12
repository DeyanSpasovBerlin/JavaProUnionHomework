package org.example.Homework15_29_10_2024.task2;

import java.util.Comparator;
import java.util.Objects;

public class Card {
    private MasterCard masterCard;
    private Visa visa;

    public Card(MasterCard masterCard) {
        this.masterCard = masterCard;
    }

    public Card(Visa visa) {
        this.visa = visa;
    }

    public Card(MasterCard masterCard, Visa visa) {
        this.masterCard = masterCard;
        this.visa = visa;
    }

    public MasterCard getMasterCard() {
        return masterCard;
    }

    public Visa getVisa() {
        return visa;
    }

    @Override
    public String toString() {
        return "Card{" +
                "masterCard=" + masterCard +
                ", visa=" + visa +
                '}';
    }
    public static class MasterIdComparator implements Comparator<Card> {

        @Override
        public int compare(Card o1, Card o2) {
            return  Integer.compare(o1.getMasterCard().getMasterCardId(),o2.getMasterCard().getMasterCardId());
        }
    }

    public static class VisaIdCompare implements Comparator<Card>{

        @Override
        public int compare(Card o1, Card o2) {
            return Integer.compare(o1.getVisa().getVisaId(),o2.getVisa().getVisaId());
        }
    }
}
