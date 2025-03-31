package oops_concept;

public class string_buffer {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");

        s.append(" world");

        System.out.println(s);

        s.insert(11,"!!");
        System.out.println(s);

        s.delete(11,13);
        System.out.println(s);


    }
}
