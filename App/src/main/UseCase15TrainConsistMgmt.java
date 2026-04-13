public class UseCase15TrainConsistMgmtgi {

    public static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    public static class GoodsBogie {
        public String shape;
        public String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment");
                }
                this.cargo = cargo;
            } catch (CargoSafetyException e) {
            } finally {
            }
        }
    }
}