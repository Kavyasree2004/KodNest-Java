
import java.util.Scanner;

public class InteractiveLearnerProgress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int days = scanner.nextInt();
        int total = 0;

        for (int day = 1; day <= days; day++) {
            int solvedProblems = scanner.nextInt();
            total += solvedProblems;
        }

        double average = (double) total / days;
        String status;

        if (average >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + total);
        System.out.println("Daily average: " + average);
        System.out.println("Status: " + status);

    }
}
