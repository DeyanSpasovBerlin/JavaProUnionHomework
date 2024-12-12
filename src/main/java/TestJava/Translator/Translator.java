package org.example.TestJava.Translator;

import java.util.*;

public class Translator {
    Scanner reader = new Scanner(System.in);
    private HashMap<String, String> dictionary;

    public Translator(HashMap<String, String> dictionary) {
        this.dictionary = dictionary;
    }

    public HashMap<String, String> getDictionary() {
        return dictionary;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dictionary);
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }
    public void start(){
        Integer chois;
        do{
            System.out.println("\nChoose: \t1. New word                \t2.  Exit");
            chois= reader.nextInt();
            if(chois.equals(1)){
                translator();
            }else if (chois.equals(2)) {
                System.out.println("Goodbyu!");
                break;
            }else {
                System.out.println("Input 1 or 2");
            }

        }while (true);
    }
    public String translator(){//, String> dictionary
        System.out.println("Please input word in english:");
        String word = reader.next();
        String result = null;
        Boolean flag = null;
        for (Map.Entry<String,String> entr : dictionary.entrySet()){
            if(Objects.equals(word.toUpperCase(),entr.getKey().toUpperCase())){
                flag = true;
                result = entr.getValue();
                break;
            }else {
                flag = false;
            }
        }
         if(flag){
             System.out.println("Translation is: "+word+" = "+result);
         }else{
           System.out.println("Your word  not present in our dictionary!");
             System.out.println("Please input Your's translation:");
             String newWordTranslation = reader.next();
             dictionary.put(word,newWordTranslation);
             result = newWordTranslation;
        }
        System.out.println(result);
        System.out.println(dictionary);
        return result;
    }
}
