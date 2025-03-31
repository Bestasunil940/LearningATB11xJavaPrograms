package oops_concept;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");  // Adds to the original string
        System.out.println(sb);  // Output: Hello World

        sb.insert(5, ",");   // Inserts a comma at index 5
        System.out.println(sb);  // Output: Hello, World

        sb.replace(0, 5, "Hi");  // Replaces "Hello" with "Hi"
        System.out.println(sb);  // Output: Hi, World

        sb.reverse();  // Reverses the string
        System.out.println(sb);  // Output: dlroW ,iH
    }
}
