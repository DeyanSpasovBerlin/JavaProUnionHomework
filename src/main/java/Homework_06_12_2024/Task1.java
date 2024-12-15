package Homework_06_12_2024;

public class Task1 {
    public Boolean validateTelNum(String telNum){
        String regex = "[1-9]{1}[0-9]{2}[ ]{1}[0-9]{4}";
        String regex1 = "[1-9]{1}[0-9]{6}";
        String regex2 = "[1-9]{1}[0-9]{2}[-]{1}[0-9]{4}";
        Boolean res = telNum.matches(regex)||telNum.matches(regex1)||telNum.matches(regex2);
        System.out.println("Validation of the telNum "+telNum+" is "+res);
        return res;

    }
}
