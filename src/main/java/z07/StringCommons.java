package z07;

import java.util.*;

public class StringCommons {
    public static String changePairs(String test1) {

        StringBuilder sb = new StringBuilder();
        int size = test1.length();
        int lstIndex = size %2 == 0 ? size-2 : size-3;

        for(int i = 0; i <= lstIndex; i+=2){
            sb.append(test1.charAt(i+1)).append(test1.charAt(i));
        }
        if(size%2 == 1) {
            sb.append(test1.charAt(size-1));
        }
        
        return sb.toString();

    }

    public static boolean isPalindrom(String test1) {
//    throw new NotImplementedException(); // <- gdy nieskonczone

        int i = 0;
        int j= test1.length()-1;
        while (i < j) {
            if(test1.charAt(i) != test1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static String concString(String[] test1) {
        StringBuilder sb = new StringBuilder();

        if (test1.length >= 1){
            Set<String> set = new TreeSet<>();
            for(String el : test1){
                set.add(el);
            }

//        for(String el: set){
//            sb.append(el).append("_");
//        }

            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()){
                sb.append(iterator.next()).append("_");
            }
            return sb.deleteCharAt(sb.length()-1).toString();
        }
        else if (test1.length == 0){
            return "";
        }
        return sb.toString();
    }
}
