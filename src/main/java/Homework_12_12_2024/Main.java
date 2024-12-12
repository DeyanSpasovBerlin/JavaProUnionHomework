package Homework_12_12_2024;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        LocalDate dateStart = LocalDate.of(2024,12,1);
        LocalDate dateEnd = LocalDate.of(2024,12,31);

        List<List<LocalDate>> res = task1.getLessonStart(dateStart,dateEnd);
        System.out.println("---------------");
        Task2 task2 = new Task2();
        LocalDateTime timeDeparture = LocalDateTime.of(2024,12,12,9,30);
        task2.arrivalTime(timeDeparture,"America/Los_Angeles","CET",650);
    }
}
