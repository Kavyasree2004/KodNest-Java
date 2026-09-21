import java.util.Scanner;

class StudentUtility {
    // Create the four required methods

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        return 60.0;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        int sum = javaScore + sqlScore;
        double average = sum / 2.0;
        return average;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility utility = new StudentUtility();

        // Read input, call methods and display the result
        int id = scanner.nextInt();
        scanner.nextLine();

        String name = scanner.nextLine();

        int javaScore = scanner.nextInt();
        int sqlScore = scanner.nextInt();

        utility.showReportTitle();
        utility.displayStudent(id, name);

        double percentage = utility.calculatePercentage(javaScore, sqlScore);
        double passingPercentage = utility.getPassingPercentage();

        String result;

        if (percentage >= passingPercentage) {
            result = "PASS";
        } else {
            result = "NEEDS IMPROVEMENT";
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);

        scanner.close();
    }
}