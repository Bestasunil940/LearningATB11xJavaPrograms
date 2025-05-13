package Generic;

public class Generic_multi_types {
    static class Pair<K, V> {
        K key;
        V value;

        Pair(K k, V v) {
            key = k;
            value = v;
        }

        void show() {
            System.out.println(key + " : " + value);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Pair<String, Integer> p = new Pair<>("Age", 30);
            p.show();
        }
    }

}
