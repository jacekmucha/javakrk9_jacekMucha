package z03;

import java.util.Objects;

public class CollectionsDemo {

    private static class Pair<T, U> {

        protected T value1;
        protected U value2;

        public T getValue1() {
            return value1;
        }

        public void setValue1(T value1) {
            this.value1 = value1;
        }

        public U getValue2() {
            return value2;
        }

        public void setValue2(U value2) {
            this.value2 = value2;
        }

        public Pair(T value1, U value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(value1, pair.value1) &&
                    Objects.equals(value2, pair.value2);
        }

        @Override
        public int hashCode() {

            return Objects.hash(value1, value2);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "value1=" + value1 +
                    ", value2=" + value2 +
                    '}';
        }
    }

    public static void main(String[] args) {

        Pair<String, Integer> myPairs1 = new Pair<>("AAA",1);
        Pair<String, Integer> myPairs2 = new Pair<>("BBB",2);
        Pair<String, Integer> myPairs3 = new Pair<>("CCC",3);

        System.out.println(myPairs1);
        System.out.println(myPairs2);
        System.out.println(myPairs3);


    }


}
