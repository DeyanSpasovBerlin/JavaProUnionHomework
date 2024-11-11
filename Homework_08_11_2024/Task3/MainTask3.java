package org.example.Homework_08_11_2024.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class MainTask3 {
    public static void main(String[] args) {
        Ticket BerlinLondon = new Ticket("Berlin","London");
        Ticket TokyoSeoul = new Ticket("Tokyo","Seoul");
        Ticket MumbaiBerlin = new Ticket("Mumbai","Berlin");
        Ticket SeoulMumbai = new Ticket("Seoul","Mumbai");
        List<Ticket> setTickets = new ArrayList<>(Arrays.asList(BerlinLondon,TokyoSeoul,MumbaiBerlin,SeoulMumbai));
        System.out.println("List of mixed Ticket:\n"+setTickets);
        System.out.println("--------------");
        System.out.println("Mixed Ticket in HashMap:");
        RouteCoordination route = new RouteCoordination(setTickets);
        Map<String,String> startEndPoint = route.getTicketMap();
        System.out.println("--------------");
        System.out.println("After ordering Ticket HashMap:");
        route.sequanceTicket(startEndPoint);

        System.out.println("--------------");
        Ticket VladivostokTokyo = new Ticket("Vladivostok","Tokyo");
        Ticket MoskauVladivostok = new Ticket("Moskau","Vladivostok");
        Ticket LondonRoma = new Ticket("London","Roma");
        Ticket RomaAthen = new Ticket("Roma","Athen");
        Ticket AthenSofia = new Ticket("Athen","Sofia");
        List<Ticket> setTicketsLong = new ArrayList<>(Arrays.asList(BerlinLondon,TokyoSeoul,MumbaiBerlin,SeoulMumbai,
                AthenSofia,VladivostokTokyo,RomaAthen,MoskauVladivostok,LondonRoma));
        System.out.println("List of mixed LongTrip Ticket:\n"+setTicketsLong);
        System.out.println("--------------");
        System.out.println("Mixed LongTrip Ticket in HashMap:");
        RouteCoordination routeLong = new RouteCoordination(setTicketsLong);
        Map<String,String> startEndPointLong = routeLong.getTicketMap();
        System.out.println("--------------");
        System.out.println("After ordering LongTrip Ticket HashMap:");
        route.sequanceTicket(startEndPointLong);


    }
}
