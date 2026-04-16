public class TrainConsistManagementApp {

    static void linearSearch(String[] arr, String key) {
        for (String s : arr) {
            if (s.equals(key)) {
                System.out.println("[FOUND] " + key);
                return;
            }
        }
        System.out.println("[NOT FOUND] " + key);
    }

    public static void main(String[] args) {
        System.out.println("=== UC18 ===");
        String[] bogies = {"BG101","BG103","BG102"};
        linearSearch(bogies,"BG102");
        linearSearch(bogies,"BG999");
    }
}
