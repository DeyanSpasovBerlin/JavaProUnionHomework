package org.example.staskTask;

import java.util.Arrays;
import java.util.LinkedList;

public class GenerateList {
    private String text1 = "Жизнь, господа присяжные заседатели, это сложная штука," +
            " но, господа присяжные заседатели, эта сложная штука открывается " +
            "просто, как ящик. Надо только уметь его открыть. Кто не может открыть," +
            " тот пропадает. ";

//    public GenerateList(String text1) {
//        this.text1 = text1;
//    }


    public String getText1() {
        return text1;
    }

    public LinkedList<String> splitText (){
        String[] splitTextArr;
        System.out.println("Now we split text in String LinkedList:");
        String spliter = "[,. ?]+";
        splitTextArr = this.text1.split(spliter);
        LinkedList<String> splitTextLinkList = new LinkedList<>(Arrays.asList(text1.split(spliter)));
        System.out.println(splitTextLinkList);
        return splitTextLinkList;
    }

}
