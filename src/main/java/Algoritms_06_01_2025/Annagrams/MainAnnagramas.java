package Algoritms_06_01_2025.Annagrams;



import java.util.Arrays;
import java.util.Map;

public class MainAnnagramas {
    public static void main(String[] args) {

        System.out.println((int)'a');
        System.out.println((int)'b');
        System.out.println((int)'z');
        System.out.println('e'-'a');


//        String myStr = "Hello";
//        char[] myArray = myStr.toCharArray();
//        System.out.println(Arrays.toString(myStr.toCharArray()));


       TextContein txt = new TextContein();
        String text = txt.getText();
        System.out.println("We have the next start text:");
        System.out.println("--------------");
        System.out.println(text);
        System.out.println("--------------");
        GenerateStringList generList = new GenerateStringList();
        String[] txtList = generList.makeStringArr(text);
        System.out.println("We have the next start list of words:");
        System.out.println("--------------");
        System.out.println(Arrays.toString(txtList));
        System.out.println("--------------");

        Dictionary dict = new Dictionary(txtList);
        Map<String,Integer> dictMap = dict.getMapText();
        System.out.println("From this list of words we make HashMap word -> number of ocurance in text:");
        System.out.println("--------------");
        System.out.println(dictMap);
        System.out.println("--------------");

        System.out.println("Reduce map to map with valus > 1:");
        Map<String,Integer> more1EntryMap =dict.findRepetedWords(dictMap);
        System.out.println(more1EntryMap);
        System.out.println("--------------");

//        a t e ; e a t ; t e a ; b a t
        String [] ana = {"ate","eat","tea","bat"};
        int i = 0;
          char[][] anaArray= new char[4][3];
        for(String str : ana){
          anaArray[i] =  str.toCharArray();
          i++;
        }
//        System.out.println(Arrays.toString(anaArray));
        for(int j = 0; j < anaArray.length; j++){
            System.out.println(Arrays.toString(anaArray[j]));
            Arrays.sort(anaArray[j]);
            System.out.println(Arrays.toString(anaArray[j]));

        }


    }

}
