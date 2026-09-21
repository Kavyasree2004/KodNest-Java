import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner firstLearner = new Learner();
        firstLearner.id = scanner.nextInt();
        firstLearner.name = scanner.next();
        firstLearner.javaScore = scanner.nextInt();

        Learner secondLearner = new Learner();
        secondLearner.id = scanner.nextInt();
        secondLearner.name = scanner.next();
        secondLearner.javaScore = scanner.nextInt();

        int newFirstScore = scanner.nextInt();

        System.out.println("Before Update");
        System.out.println(firstLearner.id + " - " + firstLearner.name + " - " + firstLearner.javaScore);
        System.out.println(secondLearner.id + " - " + secondLearner.name + " - " + secondLearner.javaScore);

        firstLearner.javaScore = newFirstScore;

        System.out.println("After Update");
        System.out.println(firstLearner.id + " - " + firstLearner.name + " - " + firstLearner.javaScore);
        System.out.println(secondLearner.id + " - " + secondLearner.name + " - " + secondLearner.javaScore);
    }
}