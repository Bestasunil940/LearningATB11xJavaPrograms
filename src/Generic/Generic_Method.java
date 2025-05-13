package Generic;

public class Generic_Method {
    public static class GenericMethod {
        public static <T> void print(T value) {
            System.out.println(value);
        }

        public static void main(String[] args) {
            print(100);
            print("Generics");
        }
    }

}
