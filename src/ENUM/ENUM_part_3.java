package ENUM;

public interface ENUM_part_3 {
    enum Planet {
        EARTH(5.97), MARS(0.642);

        double mass;

        Planet(double mass) {
            this.mass = mass;
        }

        public double getMass() {
            return mass;
        }
    }

    class TestEnum {
        public static void main(String[] args) {
            for (Planet p : Planet.values()) {
                System.out.println(p + ": " + p.getMass() + " x10^24 kg");
            }
        }
    }

}
