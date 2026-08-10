import java.util.Scanner;

public class InteractiveLearner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        int solvedProblems = scanner.nextInt();
        double assessment = scanner.nextDouble();

        System.out.println("Learner: " + firstName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessment);

        
    }
}