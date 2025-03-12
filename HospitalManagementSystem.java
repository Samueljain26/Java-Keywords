class Patient {
    private static String hospitalName = "City Hospital"; // Static variable 
    private static int totalPatients = 0; // Static counter 
    private final int patientID; // Final variable
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' 
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment patient count
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) { 
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    // Static method 
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
}

// Main class 
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient(101, "Aman", 22, "Fever");
        Patient patient2 = new Patient(102, "Adarsh", 23, "Cold");

        // Displaying patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Displaying total patients admitted
        Patient.getTotalPatients();
    }
}
/*Hospital Name: City Hospital
Patient ID: 101
Name: Aman
Age: 22
Ailment: Fever
Hospital Name: City Hospital
Patient ID: 102
Name: Adarsh
Age: 23
Ailment: Cold
Total Patients Admitted: 2
 */