package z06;

import z03.InvalidArgumentException;

public class ArrayCommons {


    /*
    [2,3,1,9,0], 2, 4, -1   ->   [2, 3, -1, -1, -1]
     */

    public static <T> void replace(T[] arr, int begin, int end, T obj)
    throws InvalidArgumentException {

       if(arr == null || begin < 0 || end > arr.length-1 || begin > arr.length-1){
           throw new InvalidArgumentException("invalid argument");
       }

        for (int i = begin; i <= end; i++){
            arr[i] = obj;
        }
    }


    public static Double[] tableReplace(Double[] tab1, Double[] tab2) throws InvalidArgumentException{

        Double[]tabResult = new Double[tab1.length];

        if(tab1.length != tab2.length){
            throw new InvalidArgumentException("Invalid arguments!");
        }
        else if (tab1.length == tab2.length){

            for (int i = 0; i <= tabResult.length-1; i++){
                tabResult[tabResult.length-1-i] = tab1[i] + tab2[i];

            }
        } return tabResult;
    }
}
