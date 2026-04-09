import java.util.Arrays;
import java.util.List;

public class TrainConsistManagementApp {
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            if (capacity < 0)
                throw new IllegalArgumentException("[ERROR] Invalid capacity: " + capacity +
                    " for bogie '" + name + "'. Capacity cannot be negative.");
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " (capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String[]> bogieData = Arrays.asList(
            new String[]{"Sleeper", "72"},
            new String[]{"AC Chair", "-5"},
            new String[]{"First Class", "18"},
            new String[]{"Pantry Car", "-1"}
        );

        for (String[] data : bogieData) {
            try {
                int cap = Integer.parseInt(data[1]);
                Bogie b = new Bogie(data[0], cap);
                System.out.println("[SUCCESS] Added: " + b);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
