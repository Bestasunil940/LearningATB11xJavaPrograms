package ex_02_java_Basic_part2;

public class for_each_loop {
    public static void main (String[] args){
        String[] words = {"My ", "name ", "is ", "Besta Sunil"};

        for(String word : words){
            System.out.print(word);
        }
    }
}
