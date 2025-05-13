package ENUM;

public class ENUM_part_2 {
    enum TrafficSignal {
        RED, YELLOW, GREEN
    }

    public static class SignalCheck {
        public static void main(String[] args) {
            TrafficSignal signal = TrafficSignal.RED;
            signal =TrafficSignal.YELLOW;
            signal = TrafficSignal.GREEN;

            switch (signal) {
                case RED:
                    System.out.println("Stop");
                    break;
                case GREEN:
                    System.out.println("Go");
                    break;
                case YELLOW:
                    System.out.println("Wait");
                    break;
            }
        }
    }
}
