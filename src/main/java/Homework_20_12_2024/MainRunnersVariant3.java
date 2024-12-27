package Homework_20_12_2024;

import java.util.ArrayList;
import java.util.Random;

public class MainRunnersVariant3 {
    public static void main(String[] args) {

        RunnersRecords rec = new RunnersRecords();
        System.out.println("Befor competition:");
        System.out.println(rec);
        Bridge bridge = new Bridge();
        RunnersVariant3 run1 =new RunnersVariant3("Runner1",bridge);
        RunnersVariant3 run2 =new RunnersVariant3("Runner2",bridge);
        RunnersVariant3 run3 =new RunnersVariant3("Runner3",bridge);

        run3.putRecords(run3,rec);
        run1.putRecords(run1,rec);
        run2.putRecords(run2,rec);
        rec.sortedRecords(rec);
        rec.sortedMapRecords(rec);
        System.out.println("After competition:");
        System.out.println(rec);

    }
}
