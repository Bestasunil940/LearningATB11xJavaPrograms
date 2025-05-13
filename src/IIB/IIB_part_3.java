package IIB;

public class IIB_part_3 {
    public static class Counter {
        static int count = 0;

        {
            count++;
        }

        public Counter() {}

        public static void main(String[] args) {
            new Counter();
            new Counter();
            new Counter();
            System.out.println("Objects created: " + Counter.count);
        }
    }

}
