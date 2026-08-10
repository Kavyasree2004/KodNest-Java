public class Conditional {
    public static void main(String[] args) {

        int number = -7;
        int firstScore = 18;
        int secondScore = 25;

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Number type: Positive");
        } else if (number < 0) {
            System.out.println("Number type: Negative");
        } else {
            System.out.println("Number type: Zero");
        }

        // Check whether the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }

        // Find the larger score
        if (firstScore >= secondScore) {
            System.out.println("Larger score: " + firstScore);
        } else {
            System.out.println("Larger score: " + secondScore);
        }
    }
}   
