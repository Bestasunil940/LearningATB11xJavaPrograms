package ex_02_java_Basic_part2;

public class swapping_num_add {
    public static void main (String[] args){
        int a =10;
        int b = 20;
        System.out.println("Before Swapping" + "\n" + "value of a is: " + a + "\n" + "value of b is: " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping" + "\n" + "value of a is: " + a + "\n" + "value of b is: " + b);
    }
}
