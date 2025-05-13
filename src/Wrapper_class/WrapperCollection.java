package Wrapper_class;

import java.util.ArrayList;
import java.util.List;

public class WrapperCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); // auto-boxing
        list.add(20);

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}

