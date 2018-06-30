package z02;

import java.util.*;

public class CollectionsDemo {


    private static class Box{
        private String name;
        private Integer val;

        public Box(String name, Integer val) {
            this.name = name;
            this.val = val;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Box box = (Box) o;
            return Objects.equals(name, box.name) &&
                    Objects.equals(val, box.val);
        }

        @Override
        public int hashCode() {

            return Objects.hash(name, val);
        }
    }


    private static String print(List list){

        StringBuilder result = new StringBuilder();

        list.forEach(x-> result.append(x));

        return result.toString();

    }


    public static String join(List<String> words, int wordLengthMin, int wordLengthMax){

        StringBuilder result = new StringBuilder();

//        for (String x : words) {
//
//            if(x.length() >= wordLengthMin && x.length() <= wordLengthMax) {
//                result.append(x).append(" ");
//            }
//        }

        words.stream()
                .forEach(x -> {
                    if(x.length() >= wordLengthMin && x.length() <= wordLengthMax){
                        result.append(x).append(" ");
                    }
                }
                );

        return result.toString();

    }


    public static void main(String[] args) {


        List<String> words = new ArrayList<String>(); //oparta na tablicy, przy implementacji tworzy tablicę, zlozonosc O(1)
                                                        //w konstruktorze () można podać rozmiar ArrayListy
        words.add("String");

        //dodaje elementy to prepełnienia listy, potem tworzy nową, większą liste i kopiuje do niej to, co było w liście wczeniejszej
        //ArrayListy używamy, gdy jest dużo wywołać metody .get(i)


        List<Double> numbers = new LinkedList<Double>(); // zlozonosc O(logn)
        numbers.add(23.1);
        // (prev, 23.1, next) -> lista dwukierunkowa
        numbers.add(99.0);
        // (23.1, 99.0, next) -> lista dwukierunkowa // każdy obiekt listy wskazuje na swój poprzednik i następnik
        // używamy, gdy dominuje usuwanie elementów


        print(numbers);

        System.out.println(join(Arrays.asList("dog", "theory", "wolf", "computer"), 4, 7));


        HashSet<String> wordSet = new HashSet<>();
        wordSet.add("jeden");
        wordSet.add("jeden");

        System.out.println(wordSet.size());


        Set<Box> set = new HashSet<>();

        set.add(new Box("box1",10));
        set.add(new Box("box1",10));

        System.out.println(set.size());







    }


}

