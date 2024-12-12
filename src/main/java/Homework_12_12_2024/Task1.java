package Homework_12_12_2024;

import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

public class Task1 {


    public List<List<LocalDate>> getLessonStart(LocalDate dateStart, LocalDate dateEnd){
        LocalDate dateTus= dateStart.with(TemporalAdjusters.firstInMonth(DayOfWeek.TUESDAY));
        List<LocalDate> allTues = dateTus.datesUntil(dateEnd,Period.ofDays(7)).toList();
        System.out.println(("All lesson in thusday are :" + allTues+" at 9:30 Uhr"));

        LocalDate dateThurs= dateStart.with(TemporalAdjusters.firstInMonth(DayOfWeek.THURSDAY));
        List<LocalDate> allThurs = dateThurs.datesUntil(dateEnd,Period.ofDays(7)).toList();
        System.out.println(("All lesson in thursday are :" + allThurs+" at 9:30 Uhr"));

        LocalDate dateFri= dateStart.with(TemporalAdjusters.firstInMonth(DayOfWeek.FRIDAY));
        List<LocalDate> allFri = dateFri.datesUntil(dateEnd,Period.ofDays(7)).toList();
        System.out.println(("All lesson in friday are :" + allFri+" at 9:30 Uhr"));
        List<List<LocalDate>> listLess = List.of(allTues,allThurs,allFri);
        System.out.println(("All lessons in interval from:" + dateStart + " to " + dateEnd + " are:\n "
                + listLess));
        return listLess;
    }
}
