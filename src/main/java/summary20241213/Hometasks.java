package summary20241213;

import java.time.*;
import java.util.List;

public class Hometasks {

    public static void main(String[] args) {
        // 1) Составить список времен начала всех занятий по Java на декабрь 2024, если предположить,
        //что они проходят каждый вторник/четверг/пятницу c 9:30 CET.
        List<ZonedDateTime> classesTime = LocalDate.of(2024, Month.DECEMBER, 1)
                .datesUntil(LocalDate.of(2024, Month.DECEMBER, 22))
                .filter(date -> date.getDayOfWeek() == DayOfWeek.THURSDAY ||
                        date.getDayOfWeek() == DayOfWeek.TUESDAY ||
                        date.getDayOfWeek() == DayOfWeek.FRIDAY)
                .map(localDate -> ZonedDateTime.of(localDate, LocalTime.of(9, 30), ZoneId.of("CET")))
                .toList();
        classesTime.forEach(System.out::println);

        // 2) Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
        //Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.
        ZonedDateTime timeOfArrival = calculateTimeOfArrival(ZonedDateTime.of(2024, 12, 13, 15, 5, 0, 0, ZoneId.of("America/Los_Angeles")),
                Duration.ofHours(10).plusMinutes(50L), ZoneId.of("Europe/Berlin"));
        System.out.println(timeOfArrival);
    }

    public static ZonedDateTime calculateTimeOfArrival(ZonedDateTime departureTime, Duration flightDuration, ZoneId arrivalZoneId) {
        return departureTime.plus(flightDuration).withZoneSameInstant(arrivalZoneId);
    }


}
