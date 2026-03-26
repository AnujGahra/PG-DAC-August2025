import java.util.*;

public class HorseRidingProblem {

    // Function to check if we can place horses with minimum distance
    public static boolean canPlace(int[] stalls, int k, int dist) {
        int count = 1; // first horse placed
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
            if (count == k) return true;
        }
        return false;
    }

    public static int maxMinDistance(int[] stalls, int k) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canPlace(stalls, k, mid)) {
                result = mid;
                low = mid + 1; // try bigger distance
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;

        System.out.println("Maximum minimum distance: " + maxMinDistance(stalls, k));
    }
}