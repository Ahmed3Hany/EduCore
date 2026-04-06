
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1- Add Student");
        System.out.println("2- Add Subject to Student");
        System.out.println("3- Display Student Information");
        System.out.println("4- Calculate Student GPA");
        System.out.println("5- Display All Students");
        System.out.println("6- Remove Student");
        System.out.println("7- Remove Subject");
        System.out.println("8- Show student with highest GPA");
        System.out.println("9- Convert numeric grade to letter grade");
        System.out.println("10- Exit");


        outer:
        while (true) {
            System.out.print("\nEnter the operation number: ");
            int operation = sc.nextInt();

            switch (operation) {
                case 1 -> {
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
                case 7 -> {
                }
                case 8 -> {
                }
                case 9 -> {
                }
                case 10 -> {
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    break outer;
                }
                default -> System.out.println("Invalid operation. Please try again.");
            }
            // Add Subject to Student logic
            // Calculate Student GPA logic
            // Display All Students logic
            // Remove Student logic
            // Remove Subject logic
            // Show student with highest GPA logic
            // Convert numeric grade to letter grade logic
                    }
    }
}
