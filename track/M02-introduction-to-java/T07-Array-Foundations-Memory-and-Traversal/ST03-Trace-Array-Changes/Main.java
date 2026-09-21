public class Main {
    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        
        // Required variables as given
        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // 1. Create snapshot with the same length as original
        int[] snapshot = new int[original.length];
        
        // 2. Copy every element into snapshot using an index-based loop
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // 3. Assigning liveView = original intentionally creates an alias
        int[] liveView = original;
        
        // Validate updateIndex before the update is performed
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updatedValue;
        }

        // Display original
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Display snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        // Display the reference comparison
        System.out.println("Same object: " + (original == liveView));

        // Validate requestedIndex before accessing original
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}
