package ENUM;

public class ENUM_part_1 {
    enum Day {
        MONDAY, TUESDAY, FRIDAY
    }

    public static class EnumDemo {
        public static void main(String[] args) {
            Day today = Day.FRIDAY;
            System.out.println("Today is: " + today);
        }
    }

}
