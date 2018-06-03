package z01;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class Homework02 {


    //TODO powt zad 0
    static Integer specialMax(Integer[] T) throws NoSuchElementException {

        int sum = 0;


        for (int i = 0; i < T.length; i++) {
            sum += T[i];
        }

        for (int i = 0; i < T.length; i++) {
            if (T[i] >= sum - T[i]) {
                return T[i];
            }
        }

        throw new NoSuchElementException("\n\nThere is no such element\n");
    }


    //TODO powt zad 1
    static Integer sortTable(Integer[] Tab) {

        Arrays.sort(Tab);

        for (int i = 0; i < Tab.length; i++) {
            if (i == Tab[i])
                return i;
        }

        return -1;
    }

    //TODO powt zad 2
    static int maxDevider(int n) {

        int maxDevider = 0;

        for (int i=1; i < n; i++){
            if(n %i == 0){
                maxDevider =i;
            }

        }
        return maxDevider;
    }


    //TODO powt zad 4
    private static void calculateWords(String input){

        String[] words = new String[];
        words = input.split(" ");

        Map<String, Integer> wordsMap = new HashMap<String, Integer>();

        for (String s : words) {

            int count = 0;
            if (wordsMap.containsKey(s)) {
                count++;

                wordsMap.put(s, count);
            }

            System.out.println(wordsMap);

        }

    }


    public static void main(String[] args) {

        Integer[] TabBad = {1, 1, 1, 1, 1};

        Integer[] TabOK = {100, 50, 25, 10, 5};

        System.out.println("Powt zad 0: " + specialMax(TabOK));

        Integer[] TabN2 = {-1, 1, 3, 6, 9, 9};
        Integer[] TabN = {1,3,5,7};

        System.out.println("Powt zad 1: " + sortTable(TabN2));

        System.out.println("Powt zad 2: " + maxDevider(25));


        String stringInput = "pies kasia kot pies kot pies";
        System.out.println(calculateWords(stringInput));


    }
}
