package org.example.Time_10_12_2024;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*
        // 1) создать любую дату
        // - вывести на консоль на немецком / английском языках
        // - найти, на какой день недели она выпала
        // - вычесть 10 лет из созданной даты, вывести на консоль
        // - посчитать количество дней до нее (ChronoUnit.DAYS)
		// 2) Найти дату последнего четверга ноября 2024 / второй среды мая 2025

		<dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.11.0-M2</version>
        </dependency>
         */

        LocalDate date = LocalDate.now();
        date = LocalDate.of(2026, 11, 27);
        System.out.println(date);
        DateTimeFormatter localizedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println(localizedDate.withLocale(Locale.of("en_NU")).format(date));
        System.out.println(localizedDate.withLocale(Locale.of("de_NU")).format(date));
        System.out.println(localizedDate.withLocale(Locale.GERMAN).format(date));
        List<LocalDate> list = date.datesUntil(date.plusDays(30), Period.ofDays(7)).toList();
        System.out.println(list);
        System.out.println(date.getDayOfWeek());
        LocalDate tenYears = date.minus(10, ChronoUnit.YEARS);
        System.out.println(tenYears);
        System.out.println(ChronoUnit.DAYS.between(tenYears, date));
        date = LocalDate.of(2024, 11, 1);
        System.out.println(date.with(TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY)));
        date = LocalDate.of(2024, 5, 1);
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)).plusDays(7));

    }
}
