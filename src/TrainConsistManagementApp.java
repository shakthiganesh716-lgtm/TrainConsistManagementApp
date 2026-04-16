import java.util.*;

public class TrainConsistManagementApp {

    static void search(List<String> bogies, String key) {
        if (bogies.isEmpty()) {
            throw new IllegalStateException("Train is empty!");
        }

        if (bogies.contains(key))
            System.out.println("[FOUND] " + key);
        else
            System.out.println("[NOT FOUND] " + key);
    }

    public static void main(String[] args) {
        System.out.println("=== UC20 ===");

        try {
            search(new ArrayList<>(),"BG101");
        } catch (Exception e) {
            System.out.println("[ERROR] " + e.getMessage());
        }

        List<String> list = Arrays.asList("BG101","BG102");
        search(list,"BG102");
    }
}
