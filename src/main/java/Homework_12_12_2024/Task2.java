package Homework_12_12_2024;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Task2 {

    public ZonedDateTime arrivalTime(LocalDateTime timeDeparture,String departureZoneId,String arrivalZoneId,int flyTime){
        LocalDateTime landingTime = timeDeparture.plus(flyTime, ChronoUnit.MINUTES);
        ZonedDateTime arrivalTime = ZonedDateTime.of(landingTime, ZoneId.of(departureZoneId));
        ZonedDateTime localArrivalTime = arrivalTime.withZoneSameInstant(ZoneId.of(arrivalZoneId));
        System.out.println(("Scheduled departure " + timeDeparture));
        System.out.println(("Flight duration in minutes: " + flyTime));
        System.out.println(("Scheduled landing local time: " + localArrivalTime));
        return localArrivalTime;
    }
}
