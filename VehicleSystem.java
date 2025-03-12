class Vehicle {
    private static double registrationFee = 500.0; // Static variable
    private final String registrationNumber; // Final variable
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Using instanceof
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
        }
    }
    public static void updateRegisterationFees(double fees){
        registrationFee = fees;

    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("XYZ", "Aman", "Car");
        Vehicle vehicle2 = new Vehicle("ABC", "Raj", "Motorcycle");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegisterationFees(1000.0);
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
/*Registration Number: XYZ
Owner Name: Aman
Vehicle Type: Car
Registration Fee: Rs.500.0
Registration Number: ABC
Owner Name: Raj
Vehicle Type: Motorcycle
Registration Fee: Rs.500.0
Registration Number: XYZ
Owner Name: Aman
Vehicle Type: Car
Registration Fee: Rs.1000.0
Registration Number: ABC
Owner Name: Raj
Vehicle Type: Motorcycle
Registration Fee: Rs.1000.0
 */