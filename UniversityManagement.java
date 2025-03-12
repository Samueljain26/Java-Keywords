class Student {
    private static String universityName = "Chitkara"; // Static variable
    private final int rollNumber; // Final variable
    private String name;
    private String grade;
    private static int totalstudents=0;; //static variable

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalstudents++; //counter to count number of students
    }
    //method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
    //static method
    public static void getTotalStudents(){
        System.out.println("Total students: "+ totalstudents);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Aman", "A");
        Student stu2 = new Student(102, "Adarsh", "B");
        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
        Student.getTotalStudents();
    }
}
/*University: Chitkara
Roll Number: 101
Name: Aman
Grade: A
University: Chitkara
Roll Number: 102
Name: Adarsh
Grade: B
Total students: 2
 */