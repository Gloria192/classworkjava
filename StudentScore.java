public class StudentScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Enter the marks between (0-100):");
        int marks = scanner.nextInt(); // Read user input and assign it to 'marks'

        // Check the grade based on the marks
        if (marks > 90 && marks <= 100) {
            System.out.println("Student Score the grade is A");
        } else if (marks > 80 && marks <= 89) {
            System.out.println("Student Score the grade is B");
        } else if (marks > 70 && marks <= 79) {
            System.out.println("Student Score the grade is C");
        } else if (marks > 60 && marks <= 69) {
            System.out.println("Student Score the grade is D");
        } else if (marks >= 0 && marks <= 59) { // Ensure marks fall within valid range
            System.out.println("Student Score the grade is F");
        } else { // Handle invalid input
            System.out.println("Invalid marks! Please enter a value between 0 and 100.");
        }
        
        scanner.close(); // Close the Scanner object
    }
}
    
