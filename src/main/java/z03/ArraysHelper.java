package z03;

import java.util.List;

public class ArraysHelper {

    final static int VERSION = 1;

    public static <T> int counter(List<T> list, T obj){

        int result = 0;
        for(T element : list){
            if(obj.equals(element)){
                result++;
            }
        }
        return result;
    }



}
