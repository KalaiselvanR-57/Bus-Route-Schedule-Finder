package package2;

import java.util.List;
import java.util.Scanner;
import package1.BusData;
import package1.BusData.Bus;

public class BusRouteFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter current location: ");
        String fromCity = scanner.nextLine().trim();

        System.out.print("Enter destination: ");
        String toCity = scanner.nextLine().trim();

        // Get bus data from package1
        List<Bus> buses = BusData.getBuses();

        // Display matching buses
        boolean found = false;
        System.out.println("\nAvailable Buses from " + fromCity + " to " + toCity + ":");

        for (Bus bus : buses) {
            if (bus.fromCity.equalsIgnoreCase(fromCity) && bus.toCity.equalsIgnoreCase(toCity)) {
                System.out.println("Bus: " + bus.busName +
                                   " | Departure: " + bus.departureTime +
                                   " | Arrival: " + bus.arrivalTime);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No buses available for this route.");
        }

        scanner.close();
    }
}
