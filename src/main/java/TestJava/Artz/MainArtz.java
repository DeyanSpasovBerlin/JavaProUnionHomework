package org.example.TestJava.Artz;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MainArtz {
    public static void main(String[] args) {

        Appointment app = new Appointment();
        List<String> terminsTime = app.makeTerminIntervals(LocalTime.parse("09:00"),LocalTime.parse("14:00"),
                Duration.ofMinutes(30));
        app.reserveTermin(terminsTime);
    }

}
