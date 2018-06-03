package z02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {


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



        List<Double> numbers = new LinkedList<Double>(); // zlozonosc O(logn)
        numbers.add(23.1);
        // (prev, 23.1, next) -> lista dwukierunkowa
        numbers.add(99.0);
        // (23.1, 99.0, next) -> lista dwukierunkowa // każdy obiekt listy wskazuje na swój poprzednik i następnik

        print(numbers);


        System.out.println(join(Arrays.asList("dog", "theory", "wolf", "computer"), 4, 7));







    }


}

