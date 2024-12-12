package org.example.Homework_08_11_2024.Task3;

import java.util.Map;
import java.util.Objects;

public class Ticket {
//    private Map<String,String> ticketMap;
//    private Map.Entry<String,String> startEndPoint = (Map.Entry<String, String>) ticketMap.entrySet();
    private String startPoint;
    private String endPoint;

    public Ticket( String startPoint,String endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(startPoint, ticket.startPoint) && Objects.equals(endPoint, ticket.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                ", startPoint='" + startPoint + '\'' +
                "endPoint='" + endPoint + '\'' +
                '}';
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getStartPoint() {
        return startPoint;
    }
}
