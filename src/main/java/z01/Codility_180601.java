package z01;

public class Codility_180601 {

    public static int solution(int N) {
        // write your code in Java SE 8

        String binary = Integer.toBinaryString(N);

        int gapMax = 0;
        int gapTmp = 0;

        boolean counting = false;


        for (int i = 1; i < binary.length(); i++) {

            if (binary.charAt(i - 1) == '1' && binary.charAt(i) == '0') {
                counting = true;
            }

            if (binary.charAt(i - 1) == '0' && binary.charAt(i) == '1') {
                counting = false;

                if (gapTmp > gapMax) {
                    gapMax = gapTmp;
                }
                gapTmp = 0;
            }

            if (counting && binary.charAt(i) == '0'){
                gapTmp++;
            }
        }
        return gapMax;
    }
}
