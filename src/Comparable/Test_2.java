package Comparable;

import java.util.Arrays;

public class Test_2 {
    static class Product implements Comparable<Product> {
        int id;
        Product(int id) { this.id = id; }

        public int compareTo(Product p) {
            return this.id - p.id;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Product[] products = {new Product(200), new Product(100)};
            Arrays.sort(products);

            for (Product p : products)
                System.out.println(p.id);
        }
    }

}
