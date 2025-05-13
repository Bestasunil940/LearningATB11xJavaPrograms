package Static;

public class Static_part_3 {
    public static class StaticBlockExample {
        static {
            System.out.println("Static block runs first");
        }

        public static void main(String[] args) {
            System.out.println("Main method runs next");
        }
    }

}
