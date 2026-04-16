public class TrainConsistManagementApp {

    static void reverse(String[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC17 ===");
        String[] bogies = {"BG101","BG102","BG103"};
        reverse(bogies);
    }
}
