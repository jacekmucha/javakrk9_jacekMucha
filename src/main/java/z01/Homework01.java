package z01;

public class Homework01 {

    public static void main(String[] args) {

        int n = 10; // 1*2^3 + 0*2^2 + 1*2^1 +0*2^0
        //1010

        while(n>0){
            int bit = n%2;
            n = n / 2;
        }

        String bins = Integer.toBinaryString(100);
        System.out.println(bins);


    }


}
