public class PlacementReadiness {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        System.out.println((marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Preparation");

        for(int i=1; i<=practiceDays; i++){
            System.out.println("Practice Day: " + i);
        }
    }
}