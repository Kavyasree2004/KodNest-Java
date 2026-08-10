public class Main {
    public static void main(String[] args) {

        // Simple Interest
        double principal = 10000.0;
        double rate = 6.5;
        double time = 2.0;

        double simpleInterest =
            principal * rate * time / 100.0;

        double total =
            principal + simpleInterest;

        // BMI
        double weight = 72.0;
        double height = 1.8;

        double bmi = weight / (height * height);

        // Marks
        int java = 78;
        int sql = 84;
        int comm = 69;
        int aptitude = 91;
        int reas = 88;

        int marks =
            java + sql + comm + aptitude + reas;

        double percentage = marks * 100.0 / 500;

        // Output
        System.out.println("Simple Interest: " + simpleInterest);
        System.out.println("Total Amount: " + total);
        System.out.println("BMI: " + bmi);
        System.out.println("Total Marks: " + marks);
        System.out.println("Percentage: " + percentage);
    }
}