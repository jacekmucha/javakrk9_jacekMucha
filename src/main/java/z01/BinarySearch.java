package z01;

public class BinarySearch {


    //zakladamy, ze elementy T sa posortowane nierosnaco
    public static boolean search(int[] T, int x){
        int begin = 0;
        int end  = T.length-1;

        while(begin <= end){                //n/2 iteracji => O(logn) // n = 2^k => ile razy muszę dzielić n na 2, aby otrzymać k)
            int s = (begin + end)/2;

            if(T[s] == x){
                return true;
            }
            if(x < T[s]){
                begin = s+1;
            }

                else //gdy x >= T[s]
                {
                    end = s -1;
                }
            }

       return  false;
    }
}
