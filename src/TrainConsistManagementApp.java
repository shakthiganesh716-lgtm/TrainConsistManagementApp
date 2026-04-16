import java.util.Arrays;

public class TrainConsistManagementApp {

    static void binarySearch(String[] arr, String key) {
        Arrays.sort(arr);
        int low = 0, high = arr.length-1;

        while (low <= high) {
            int mid = (low+high)/2;
            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                System.out.println("[FOUND] " + key);
                return;
            } else if (cmp > 0) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        System.out.println("[NOT FOUND] " + key);
    }

    public static void main(String[] args) {
        System.out.println("=== UC19 ===");
        String[] arr = {"BG101","BG102","BG103"};
        binarySearch(arr,"BG102");
        binarySearch(arr,"BG999");
    }
}
