package ex_02_java_Basic_part2;

public class swapping_num_temp {
    public static void main (String[] args){
        int a =10;
        int b = 20;
        System.out.println("Before Swapping" + "\n" + "value of a is: " + a + "\n" + "value of b is: " + b);
        int temp;
        temp =a;
        a = b;
        b = temp;
        System.out.println("After Swapping" + "\n" + "value of a is: " + a + "\n" + "value of b is: " + b);
    }
}
