public class Main {
    public static void main(String[] args) {
        // Input values
        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;

        // Update each element in the array by adding the bonus
        for (int i = 0; i < values.length; i++) {
            values[i] += bonus; 
        }

        // Print the updated values
        System.out.print("Updated values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
}
