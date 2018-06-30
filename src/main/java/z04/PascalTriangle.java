package z04;


import z03.InvalidArgumentException;

public class PascalTriangle {

    private final static int HEIGHT = 20;
    private static int T[][] = null;

    private PascalTriangle(){

    }

    private static void fill(){
        T = new int[HEIGHT][HEIGHT];
        T[0][0] = T[1][0] =T [1][1] = 1;
        for (int i = 2; i < HEIGHT; i++) {
            T[i][0] = T[i][i] = 1;
            for(int j =1; j< i;j++){
                T[i][j] = T[i-1][j-1] + T[i-1][j];
            }
        }
    }

    //metoda, ktora zwraca symbol Newtona (n k) - jakas wartosc komorki trójkąta Pascala
    public static int newtonNK(int n, int k) throws InvalidArgumentException {

        if(n<1 || n> HEIGHT || k<1 || k> HEIGHT){
            throw new InvalidArgumentException("invalid argument");
        }
        if(T == null){
            fill();

            }
            return T[n][k];
    }

    public static String print() {
        //TODO

        StringBuilder sb = new StringBuilder();

        if (T == null) {
            fill();
        }

            for (int i = 0; i < HEIGHT; i++) {
                for (int j = 0; j <= i; j++) {
                    sb.append(T[i][j]).append(" ");
                }
                sb.append("\n");
            }
        return sb.toString();
    }


    public static void main(String[] args) {

        System.out.println(print());
    }
}
