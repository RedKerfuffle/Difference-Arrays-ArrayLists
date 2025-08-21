import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ===== ARRAYS =====
        // An array has a fixed size. Once you create it, the length cannot change.
        int[] scores = new int[5];   // This array can hold 5 integers
        scores[0] = 90;              // Put 90 in the first spot
        scores[1] = 85;              // Put 85 in the second spot
        scores[2] = 88;              // etc.
        scores[3] = 92;
        scores[4] = 95;

        // Calculate the average of the array values
        int sumArray = 0;
        for (int i = 0; i < scores.length; i++) {
            sumArray += scores[i];   // Add each score to the total
        }
        System.out.println("Array: " + Arrays.toString(scores));
        System.out.println("Array average = " + (sumArray / (double) scores.length));

        // ===== ARRAYLIST =====
        // An ArrayList can grow or shrink as needed.
        // Note: ArrayLists cannot hold primitive types like int directly,
        // so we use the wrapper class Integer instead.
        ArrayList<Integer> scoreList = new ArrayList<>();

        // Add numbers to the ArrayList
        scoreList.add(90);
        scoreList.add(85);
        scoreList.add(88);
        scoreList.add(92);
        scoreList.add(95); // Unlike arrays, we didn’t have to set a size in advance!

        // Remove the value 85 from the list
        scoreList.remove(Integer.valueOf(85));

        // Change the value 92 to 93 if it exists in the list
        if (scoreList.contains(92)) {
            int index = scoreList.indexOf(92);
            scoreList.set(index, 93);
        }

        // Calculate the average of the ArrayList values
        int sumList = 0;
        for (int score : scoreList) {
            sumList += score;   // Each Integer is automatically handled like an int here
        }
        System.out.println("ArrayList: " + scoreList);
        System.out.println("ArrayList average = " + (sumList / (double) scoreList.size()));

        // ===== SUMMARY =====
        System.out.println("\nKey differences:");
        System.out.println("- Array: fixed size, can hold numbers (primitives) directly.");
        System.out.println("- ArrayList: flexible size, uses objects (like Integer),");
        System.out.println("  and has handy methods like add, remove, and contains.");
    }
}
