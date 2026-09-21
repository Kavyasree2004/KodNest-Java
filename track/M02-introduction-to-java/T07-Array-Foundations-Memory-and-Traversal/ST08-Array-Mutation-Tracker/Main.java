public class Main {
    public static void main(String[] args) {
        // Write your code here
        int[] readings = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        int snapshot[] = new int[readings.length];

        System.out.print("Snapshot: ");
        for (int i = 0; i < readings.length; i++) {
            snapshot[i] = readings[i];
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        readings[updateIndex] = newValue;

        System.out.print("Updated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + " ");
        }
    }
}