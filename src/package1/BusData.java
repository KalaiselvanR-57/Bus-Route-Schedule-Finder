package package1;

import java.util.*;

public class BusData {

    public static class Bus {
        public String busNumber;
        public String startCity;
        public String endCity;
        public List<String> stops;
        public List<String> stopTimes;

        public Bus(String busNumber, String startCity, String endCity,
                   List<String> stops, List<String> stopTimes) {
            if (stops.size() != stopTimes.size()) {
                throw new IllegalArgumentException("Stops and stop times must have the same length.");
            }
            this.busNumber = busNumber;
            this.startCity = startCity;
            this.endCity = endCity;
            this.stops = stops;
            this.stopTimes = stopTimes;
        }
    }

    public static List<Bus> getBuses() {
        List<Bus> buses = new ArrayList<>();

        buses.add(new Bus(
                "TN-01-AA-1001", "Coimbatore", "Madurai",
                Arrays.asList("Coimbatore", "Pollachi", "Udumalpet", "Palani", "Oddanchatram", "PSNA", "Dindigul", "Madurai"),
                Arrays.asList("06:00", "07:00", "07:40", "08:10", "08:45", "09:15", "09:45", "11:00")
        ));

        buses.add(new Bus(
                "TN-02-BB-2002", "Ottanchathiram", "Dindigul",
                Arrays.asList("Ottanchathiram", "Vedasandur", "PSNA", "Dindigul"),
                Arrays.asList("07:30", "07:45", "08:00", "08:20")
        ));

        buses.add(new Bus(
                "TN-03-CC-3003", "Tiruppur", "Dindigul",
                Arrays.asList("Tiruppur", "Kangeyam", "Karur", "Vedasandur", "PSNA", "Dindigul"),
                Arrays.asList("05:30", "06:10", "07:10", "08:20", "08:40", "09:00")
        ));

        buses.add(new Bus(
                "TN-04-DD-4004", "Coimbatore", "Trichy",
                Arrays.asList("Coimbatore", "Sulur", "Palladam", "Karur", "Kulithalai", "Trichy"),
                Arrays.asList("06:15", "06:40", "07:10", "08:20", "09:15", "10:30")
        ));

        buses.add(new Bus(
                "TN-05-EE-5005", "Palani", "Dindigul",
                Arrays.asList("Palani", "Oddanchatram", "Vedasandur", "PSNA", "Dindigul"),
                Arrays.asList("08:10", "08:30", "08:40", "08:50", "09:10")
        ));

        buses.add(new Bus(
                "TN-06-FF-6006", "Karur", "Madurai",
                Arrays.asList("Karur", "Vedasandur", "Nilakottai", "Sholavandan", "Madurai"),
                Arrays.asList("09:00", "09:40", "10:10", "10:40", "11:15")
        ));

        buses.add(new Bus(
                "TN-07-GG-7007", "Dindigul", "Theni",
                Arrays.asList("Dindigul", "Seelapadi", "Batlagundu", "Periyakulam", "Theni"),
                Arrays.asList("06:50", "07:00", "07:40", "08:10", "08:40")
        ));

        buses.add(new Bus(
                "TN-08-HH-8008", "Oddanchatram", "Karur",
                Arrays.asList("Oddanchatram", "Vedasandur", "Karur"),
                Arrays.asList("05:45", "06:10", "07:00")
        ));

        buses.add(new Bus(
                "TN-09-II-9009", "Erode", "Madurai",
                Arrays.asList("Erode", "Karur", "Vedasandur", "PSNA", "Dindigul", "Madurai"),
                Arrays.asList("07:20", "08:10", "09:00", "09:15", "09:35", "10:50")
        ));

        buses.add(new Bus(
                "TN-10-JJ-1010", "Palani", "Theni",
                Arrays.asList("Palani", "Oddanchatram", "Kodaikanal Road", "Periyakulam", "Theni"),
                Arrays.asList("04:50", "05:20", "06:10", "07:00", "07:30")
        ));

        return buses;
    }
}
