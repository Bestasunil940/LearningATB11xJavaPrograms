package oops_concept;

public class string_builder_part_2 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Sunil");
        s.append(" Besta");
        System.out.println(s);
        s.insert(5, ",");
        System.out.println(s);
        s.replace(7,12,"sonu");
        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
