class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String msg) {
        super(msg);
    }
}

public class TrainConsistManagementApp {

    static void assignCargo(String shape, String cargo) {
        try {
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }
            System.out.println("[SUCCESS] Cargo assigned safely.");
        } catch (CargoSafetyException e) {
            System.out.println("[ERROR] " + e.getMessage());
        } finally {
            System.out.println("[LOG] Operation completed.");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== UC15 ===");
        assignCargo("Rectangular", "Petroleum");
        assignCargo("Cylindrical", "Petroleum");
    }
}
