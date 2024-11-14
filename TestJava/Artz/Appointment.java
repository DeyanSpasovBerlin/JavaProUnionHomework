package org.example.TestJava.Artz;

import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.*;

public class Appointment {
    Scanner reader = new Scanner(System.in);
    public Appointment() {};
    public List<String> makeTerminIntervals(LocalTime startTermin, LocalTime endTermin, TemporalAmount terminTime) {
        List<String> terminsTime = new ArrayList<>();
        int i =0;
        for (LocalTime time = startTermin, nextTime; time.isBefore(endTermin); time = nextTime) {
            nextTime = time.plus(terminTime);
            if (nextTime.isAfter(endTermin))
                break; // sled rabotno vreme
            terminsTime.add(nextTime.toString())  ;
        }
        return terminsTime;
    }

    public Map<String,String> reserveTermin(List<String> terminsTime) {
                Map<String,String> listKrank = new TreeMap<>();
        while (terminsTime.size()>0) {
            for (String lt : terminsTime) {
                System.out.print("\t " + lt);
            }
            System.out.println("\nChoose Termin in fotmat : hh:mm: or choose Exit(E):");
            String kundenChois = reader.nextLine();
            if (terminsTime.contains(kundenChois)) {
                System.out.println("Input Your name:");
                String name = reader.nextLine();
                listKrank.put(kundenChois, name);
                terminsTime.remove(kundenChois);
            } else if (kundenChois.toUpperCase().equals("E")) {
                System.out.println("Goodbyu!");
                break;
            } else {
                System.out.println("Input time in fotmat : hh:mm");
            }
            System.out.println(terminsTime);
            System.out.println(listKrank);
        }
            return listKrank;

    }

}
