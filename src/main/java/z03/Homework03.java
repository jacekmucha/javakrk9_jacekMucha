package z03;

import java.util.HashMap;
import java.util.Map;

public class Homework03 {



    static Map<Double, Integer> countNumbers(Double []T) {

        int counter = 0;

        Map<Double, Integer> hashMap = new HashMap<>();

        for (Double element : T) {

            if (hashMap.containsKey(element) == true) {
                Integer existingCounter = hashMap.get(element);
                hashMap.put(element, existingCounter + 1);
            }

            if (hashMap.containsKey(element) == false) {
                counter = 1;
                hashMap.put(element, counter);
            }

        }
        return hashMap;
    }

    public static void main(String[] args) {

        Double[]T = {-0.01, 2.3, -0.01, 7.8, 2.3, 2.3};

        System.out.println(countNumbers(T));

    }

}
