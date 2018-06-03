package z01;

import java.util.Random;



public class IntroduceTask {

    private static int fib(int n){
        int f1 = 1;
        int f2 = 1;
        int temp;

        int i = 3;

        while (i <= n) {

            temp = f2;

            f2 = f1 + f2;
            f1 = temp;
            i++;

        }
        return f2;
    }

    private static int fibRec(int n){
        if(n <=2){
            return 1;
        }
        return fibRec(n-1) + fibRec(n-2);
    }




    private static boolean findValue(int []T, int val){
        for(int x: T){
            if(x == val){
            }
            return  true;
        }
        return false;
            }


    // transpozycja macierzy
    private static void f(int T[][]) {

        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < i; j++) { // for (int j = 0; j <= i; j++) { <- bez znaku równości, unikamy zamieniania wartości na przekatnej tablicy

                int v = T[i][j];
                T[i][j] = T[j][i];
                T[j][i] = v;
            }
        }
    }

public static boolean isPath(String path){

    int x = 0;
    int y = 0;

    for(char c:path.toCharArray()){
        switch(c){
            case 'L': x++; break;
            case 'P': x--; break;
            case 'G': y++; break;
            case 'D': y--; break;
        }
    }

    return x == 0 && y == 0;
    }





    public static void main(String[] args) {

        final int n = 100;
        int[]T = new int[n];

        Random rand = new Random();
        for(int i =0; i<n; i++){
            T[i] = rand.nextInt(200)+1;
        }


        int T2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        f(T2);

        for (int i = 0; i < T2.length; i++) {

            for (int j = 0; j < T2[i].length; j++) {
                System.out.print(T2[i][j]+" ");
            }
            System.out.println();
        }


        int count;

        String text = "PPDDLLGG";
        System.out.println(isPath(text));

        System.out.println(fib(5));

    }
}
