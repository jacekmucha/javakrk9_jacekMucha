package z01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Codility_180603_Distinct {

    static int[] A = new int[6];



    public static int solution(int[] A) {

        HashSet<Integer> hashSet = new HashSet<>();

        for (int x:A){
            hashSet.add(x);
        }

        return hashSet.size();

    }

    public static void main(String[] args) {

        A[0] = 2;
        A[1] = 1;
        A[2] = 1;
        A[3] = 2;
        A[4] = 3;
        A[5] = 1;

//        System.out.println(solution(A));


        Map<String,Integer> map = new HashMap<>();
        map.put("kasia", 2);
        map.put("ola", 3);
        map.put("ola", 9);

        //w czasie O(1) mamy dostęp do wartości pary

        System.out.println(map);

    }


}
