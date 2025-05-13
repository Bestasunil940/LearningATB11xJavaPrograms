package IIB;

public class IIB_part_2 {
    public static class Book {
        int pages;

        {
            pages = 100;
        }

        public Book(int customPages) {
            if (customPages > 0) {
                pages = customPages;
            }
        }

        public static void main(String[] args) {
            Book b1 = new Book(150);
            Book b2 = new Book(0);
            System.out.println(b1.pages); // 150
            System.out.println(b2.pages); // 100
        }
    }

}
