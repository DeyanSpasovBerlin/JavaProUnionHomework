package org.example.Homework_08_11_2024.Task3;


import java.util.*;

public class RouteCoordination {
    private List<Ticket> setTickets;

    public RouteCoordination(List<Ticket> setTickets) {
        this.setTickets = setTickets;
    }

    public Map<String, String> getTicketMap() {
        Map<String, String> startEndPoint = new HashMap<>();
        setTickets.forEach((ticket) -> startEndPoint.put(ticket.getStartPoint(), ticket.getEndPoint()));
        System.out.println(startEndPoint);
        return startEndPoint;
    }

    public LinkedHashMap<String, String> sequanceTicket(Map<String, String> map) {
        HashMap<String, String> finalRoute = new LinkedHashMap<>();
        Set<String> startPoint = map.keySet();
        List<String> st = new ArrayList<>(map.keySet());
        String bufer = null;
        String buferValue = null;
        Boolean flag = null;
        for (int i = 0; i < st.size(); i++) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (st.get(i).equals(entry.getValue())) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (!flag) {
                finalRoute.put(st.get(i), map.get(st.get(i)));
                bufer = st.get(i);
                buferValue = map.get(st.get(i));
            }
        }
        map.remove(finalRoute.keySet().stream().toList().getLast());
        int boundary = map.size();
        int count =0;
          while (count<boundary) {//map.size()
              for (Map.Entry<String, String> o : map.entrySet()) {
                  if (finalRoute.values().stream().toList().getLast().equals(o.getKey())) {
                      finalRoute.put(o.getKey(), o.getValue());
                      map.remove(o.getKey());
                      count++;
                      break;
                  }
              }
          }
        System.out.println("finalRoute = " + finalRoute);
        return (LinkedHashMap<String, String>) finalRoute;
    }
}


