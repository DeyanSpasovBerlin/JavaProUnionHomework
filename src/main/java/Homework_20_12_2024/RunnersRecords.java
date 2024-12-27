package Homework_20_12_2024;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class RunnersRecords {
    ArrayList<Long> recordsWrite = new ArrayList<>();
    Map<String, Long> raceRecords = new TreeMap<>();

    public RunnersRecords() {
    }

    public ArrayList<Long> getRecords() {
        return recordsWrite;
    }

    @Override
    public String toString() {
        return "RunnersRecords{" +
                "recordsWrite=" + recordsWrite +
                ", raceRecords=" + raceRecords +
                '}';
    }

    public    ArrayList<Long> sortedRecords(RunnersRecords r){
        System.out.println("The Unsorted list race times with 3 sec on the bridge are: "+r.getRecords());
        ArrayList<Long> sortedRaceTime = new ArrayList<>();
        r.recordsWrite.sort(Long::compareTo);
        System.out.println("The sorted list race times with 3 sec on the bridge are: "+r.getRecords());
        System.out.println("----------");
        System.out.println("Map:");
        for (Map.Entry<String, Long> entry : raceRecords.entrySet()){
            String runner = entry.getKey();
            Long raceTime = entry.getValue();
            System.out.println(runner + " : " + raceTime);
        }
        return this.recordsWrite;
    }
    public  <String, Long extends Comparable<Long>>  Map<String,Long> sortedMapRecords(RunnersRecords r){
        Comparator<String> valueComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int valueComp = r.raceRecords.get(o1).compareTo(r.raceRecords.get(o2));
                if(valueComp == 0){
                    return 1;
                }else {
                    return valueComp;
                }
            }
        };
        Map<String,Long> sortedMapRaceTimes = new TreeMap<>(valueComparator);
        sortedMapRaceTimes.putAll((Map<? extends String, ? extends Long>) r.raceRecords);
        System.out.println("----------");
        System.out.println("Sorted Map is :");
        for (Map.Entry<String, Long> entry : sortedMapRaceTimes.entrySet()){
            String runner = entry.getKey();
            Long raceTime = entry.getValue();
            System.out.println(runner + " : " + raceTime);
        }
        System.out.println("----------");
        return sortedMapRaceTimes;
    }
}
