package Wrapper_class;

public class WrapperExample1 {
    public static void main(String[] args) {
        int x = 5;
        Integer obj = Integer.valueOf(x); // boxing
        int y = obj.intValue(); // unboxing
        System.out.println("x = " + x + ", y = " + y);
    }
}

