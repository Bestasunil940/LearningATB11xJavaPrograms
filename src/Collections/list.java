package Collections;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main (String[]args){
        List<String> Animal = new ArrayList<>();
        Animal.add("Dog");
        Animal.add("Cat");
        Animal.addFirst("Rat");
        Animal.addLast("Horse");
        System.out.println(Animal);
        System.out.println(Animal.size());
        System.out.println(Animal.get(1));
    }
}
