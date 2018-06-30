//package z04;
//
//public class Fib {
//
//    private static int fibNumbs[] = null;
//
//    private final static int MAX_FIB_NUMBER = 100;
//
//    private Fib() {
//
//    }
//
//    private static void fill() throws InvalidArgumentException {
//        fibNumbs = new int[MAX_FIB_NUMBER];
//        fibNumbs[0] = fibNumbs[1] = 1;
//        for(int i = 2; i < MAX_FIB_NUMBER; i++){
//            fibNumbs[i] = fibNumbs[i-1] + fibNumbs[i-2];
//    }
//
//    public int f(int n) {
//
//        if (n<1 || n > MAX_FIB_NUMBER){
//            throw new InvalidArgumentException("invalid argument's value");
//        }
//        if (fibNumbs == null){
//            fill();
//        }
//            return fibNumbs[n-1];
//
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//
//
//    }
//
//
//
//
//}