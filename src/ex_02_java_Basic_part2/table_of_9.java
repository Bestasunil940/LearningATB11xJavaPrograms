package ex_02_java_Basic_part2;

public class table_of_9 {
    public static void main(String[] args) {
        int num = 9; // Table of 9
        char n = '\n';

        System.out.printf("Printing the table of %d%n",num);
        System.out.printf("%d x 1 = %d"+n, num, num);
        System.out.printf("%d x 2 = %d"+n, num, num * 2);
        System.out.printf("%d x 3 = %d"+n, num, num * 3);
        System.out.printf("%d x 4 = %d%n", num, num * 4);
        System.out.printf("%d x 5 = %d%n", num, num * 5);
        System.out.printf("%d x 6 = %d%n", num, num * 6);
        System.out.printf("%d x 7 = %d%n", num, num * 7);
        System.out.printf("%d x 8 = %d%n", num, num * 8);
        System.out.printf("%d x 9 = %d%n", num, num * 9);
        System.out.printf("%d x 10 = %d"+n, num, num * 10);
    }
}
