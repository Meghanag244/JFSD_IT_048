// Interface for parking operations
import java.util.Scanner;
import java.util.ArrayList;



interface ParkingOperations {
    boolean parkVehicle(String vehicleDetails);
    boolean removeVehicle(String vehicleDetails);
    void viewParkedVehicles();
    boolean checkAvailability();
}

// Abstract class representing a parking spot
abstract class ParkingSpot {
    protected int spotID;
    protected boolean isOccupied;
    protected String vehicleDetails;

    public ParkingSpot(int spotID) {
        this.spotID = spotID;
        this.isOccupied = false;
        this.vehicleDetails = null;
    }

    public int getSpotID() {
        return spotID;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }
}

// Concrete class to manage parking operations

class ParkingLot implements ParkingOperations {
    private ArrayList<ParkingSpot> parkingSpots;
    private int capacity;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.parkingSpots = new ArrayList<>();
        for (int i = 1; i <= capacity; i++) {
            parkingSpots.add(new CarParkingSpot(i));
        }
    }

    @Override
    public boolean parkVehicle(String vehicleDetails) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied) {
                spot.isOccupied = true;
                spot.vehicleDetails = vehicleDetails;
                System.out.println("Vehicle " + vehicleDetails + " parked at Spot " + spot.getSpotID());
                return true;
            }
        }
        System.out.println("No available spots.");
        return false;
    }

    @Override
    public boolean removeVehicle(String vehicleDetails) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isOccupied && spot.vehicleDetails.equals(vehicleDetails)) {
                spot.isOccupied = false;
                spot.vehicleDetails = null;
                System.out.println("Vehicle " + vehicleDetails + " removed from Spot " + spot.getSpotID());
                return true;
            }
        }
        System.out.println("Vehicle not found.");
        return false;
    }

    @Override
    public void viewParkedVehicles() {
        System.out.println("Parked Vehicles:");
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isOccupied) {
                System.out.println("Spot " + spot.getSpotID() + ": " + spot.getVehicleDetails());
            }
        }
    }

    @Override
    public boolean checkAvailability() {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied) {
                return true;
            }
        }
        return false;
    }
}

// Concrete implementation of a parking spot
class CarParkingSpot extends ParkingSpot {
    public CarParkingSpot(int spotID) {
        super(spotID);
    }
}

// Main class to interact with the system


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParkingLot parkingLot = new ParkingLot(5);

        while (true) {
            System.out.println("\nParking Lot Management System");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. View Parked Vehicles");
            System.out.println("4. Check Availability");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle details (plate number): ");
                    String vehicle = scanner.nextLine();
                    parkingLot.parkVehicle(vehicle);
                    break;
                case 2:
                    System.out.print("Enter vehicle details to remove: ");
                    vehicle = scanner.nextLine();
                    parkingLot.removeVehicle(vehicle);
                    break;
                case 3:
                    parkingLot.viewParkedVehicles();
                    break;
                case 4:
                    System.out.println("Availability: " + (parkingLot.checkAvailability() ? "Available" : "Full"));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
