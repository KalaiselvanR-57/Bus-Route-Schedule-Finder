package package1;

import java.util.ArrayList;
import java.util.List;

public class BusData {

    public static class Bus {
        public String fromCity;
        public String toCity;
        public String busName;
        public String departureTime;
        public String arrivalTime;

        public Bus(String fromCity, String toCity, String busName, String departureTime, String arrivalTime) {
            this.fromCity = fromCity;
            this.toCity = toCity;
            this.busName = busName;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
        }
    }

    public static List<Bus> getBuses() {
        List<Bus> buses = new ArrayList<>();

        // Sample bus data
        buses.add(new Bus("Madurai", "Chennai", "TN Express", "06:00", "12:00"));
        buses.add(new Bus("Madurai", "Chennai", "City Travels", "10:00", "16:00"));
        buses.add(new Bus("Madurai", "Chennai", "SRS Bus", "18:00", "23:59"));
        buses.add(new Bus("Chennai", "Madurai", "TN Express", "07:00", "13:00"));
        buses.add(new Bus("Chennai", "Coimbatore", "Greenline", "08:00", "15:00"));
        buses.add(new Bus("Coimbatore", "Madurai", "RapidBus", "09:00", "13:30"));

        return buses;
    }
}
