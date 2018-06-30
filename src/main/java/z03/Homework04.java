package z03;

import java.util.List;

public class Homework04 {

    public static <T extends Comparable> T min(List<T> list) throws InvalidArgumentException {

        T min = list.get(0);

        if(list == null || list.size() == 0){
            throw new InvalidArgumentException("invalid arument");
        }
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
        }
        return min;

    }


    public static <T extends Comparable> T max(List<T> list) throws InvalidArgumentException {

        T max = list.get(0);

        if(list == null || list.size() == 0){
            throw new InvalidArgumentException("invalid arument");
        }
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }
        return max;

    }

    public static <T extends  Comparable> T minAndMax (List<T> list) throws InvalidArgumentException {

        T min = list.get(0);
        T max = list.get(0);

        if(list == null || list.size() == 0){
            throw new InvalidArgumentException("invalid arument");
        }
        for(int i = 1; i < list.size(); i++){
            if(list.get(i).compareTo(min) < 0){
                min = list.get(i);
            }
            if (list.get(i).compareTo(max) > 0){
                max = list.get(i);
            }
        }

        return min;

    }

}
