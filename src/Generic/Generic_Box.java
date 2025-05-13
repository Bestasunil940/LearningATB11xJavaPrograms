package Generic;

public class Generic_Box {
    static class Box<Tool> {
        Tool value;
        void set(Tool value) { this.value = value; }
        Tool get() { return value; }
    }

    public static class GenericDemo {
        public static void main(String[] args) {
            Box<String> b = new Box<>();
            b.set("Hello");
            System.out.println(b.get());
        }
    }

}
