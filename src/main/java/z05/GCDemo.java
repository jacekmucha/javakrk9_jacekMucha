package z05;

/**
 * GC usuwa obiekt, gdy stwierdzi, że nie ma na niego referencji
 * w momencie usuwania obiektu wywoływana jest metoda finalize
 *
 * Programista java nie moze samoodzielnie zniszczyc obiektu, robi to Garbage Collector
 */
public class GCDemo {

//    private static class Box extends Object{
//
//        private String value;
//
//        public Box(String value){
//            this.value = value;
//        }
//
//        @Override
//        protected void finalize(){
//            System.out.println(String.format("Box with value %s is removing now by GC", value));
//
//        }
//    }

    private static void  f(){
        Box box = new Box("1");
//        box = null;
        //i inne instrukcje
    }

    public static void main(String[] args) {
//         f();
        Box box = new Box("box1");
        box = null;
        System.gc();
        System.out.println("main is working... ");
    }

}
