package org.example.Homework13_24_10_2024.task1And2;

import java.util.*;

public class GenerateLinkedList {
    private String text1 = "Жизнь, господа присяжные заседатели, это сложная штука," +
            " но, господа присяжные заседатели, эта сложная штука открывается " +
            "просто, как ящик. Надо только уметь его открыть. Кто не может открыть," +
            " тот пропадает. ";
    private String text2 = "Хотите услышать мое излюбленное определение человека? Это существо, " +
            "которое охотнее всего рассуждает о том, в чем меньше всего разбирается.";

    public  GenerateLinkedList(){};

    public GenerateLinkedList(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public LinkedList<String> splitText (String text){
        String[] splitTextArr;
        System.out.println("Now we split text in String LinkedList:");
        String spliter = "[,. ?]+";
        splitTextArr = text.split(spliter);
        LinkedList<String> splitTextLinkList = new LinkedList<>(Arrays.asList(text.split(spliter)));
        System.out.println(splitTextLinkList);
        return splitTextLinkList;
    }

    public Integer getShortestString(LinkedList<String> l){
        int buferMax = l.getFirst().length();
        int buferMin = l.getFirst().length();
        System.out.println("The length of element's of LikedList is:");
        System.out.print("\tlength: ");
        for (String it : l){
            System.out.print("\t"+it.length());
            if(it.length() > buferMax){
                buferMax = it.length();
            } else if (it.length() < buferMin) {
                buferMin = it.length();
            }
        }
        System.out.println("\nThe max length is:"+buferMax);
        System.out.println("The min length is:"+buferMin);
        return buferMin;
    }
    public Integer getShortestStringIter(LinkedList<String> l){
        int buferMax = l.getFirst().length();
        int buferMin = l.getFirst().length();
        int bufer = 0;
        System.out.println("The length of element's of LikedList  with Iterator is :");
        System.out.print("\tlength: ");
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()){
            bufer = iter.next().length();
            System.out.print("\t"+bufer);
            if(bufer > buferMax){
                buferMax = bufer;
            } else if (bufer < buferMin) {
                buferMin = bufer;
            }
        }
        System.out.println("\nThe max length is:"+buferMax);
        System.out.println("The min length is:"+buferMin);
        return buferMin;
    }
    public String getConcatString(LinkedList<String> l){
        String conStr = "";
        System.out.println(" Now we concat all element of LinkedList: ");
        for (String s : l){
            conStr = String.join("|",conStr,s);
        }
        System.out.println(conStr);
        return conStr;
    }
    public String getConcatStringWithIter(LinkedList<String> l) {
        String conStr = "";
        System.out.println(" Now we concat all element of LinkedList with Iterator: ");
        Iterator<String> iter = l.iterator();
        while (iter.hasNext()) {
            conStr = String.join("|", conStr, iter.next());
        }
        System.out.println(conStr);
        return conStr;
    }
}
