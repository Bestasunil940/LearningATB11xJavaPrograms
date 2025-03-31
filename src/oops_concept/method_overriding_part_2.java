package oops_concept;

public class method_overriding_part_2 {
    static class Tree {
        void season (){
            System.out.println("Based on Season");
        }
    }

    static class Mango extends Tree {
        @Override
        void season() {
            System.out.println("summer season");
        }
    }
    static class papaya extends Tree {
        @Override
        void season() {
            System.out.println("all season");
        }
    }

    static class dates extends Tree {
        @Override
        void season() {
            System.out.println("winter season");
        }
    }


    public static class SeasonTrees {
       public static void main(String[] args) {
           Tree t1 = new Mango();
           Tree t2 = new papaya();
           Tree t3 = new dates();
           t1.season();
           t2.season();
           t3.season();
       }
   }
}
