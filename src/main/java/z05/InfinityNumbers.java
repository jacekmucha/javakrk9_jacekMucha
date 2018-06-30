package z05;

import java.util.Random;

public class InfinityNumbers extends Thread {

    public InfinityNumbers(String name) {
        super(name);
    }

    public InfinityNumbers() {
    }

    public void run(){

        final Random rand = new Random();
        int n = 1;

        //petla nieskonczona
        while (true){

            if(n%2 == 0){
                System.out.println(String.format("%s: liczba %d jest parzysta", super.getName(), n));
            }
            else if (n%2 != 0){
                System.out.println(String.format("%s: liczba %d jest nieparzysta",super.getName(), n));
            }
                try {
                    Thread.sleep(1 + rand.nextInt(2)*500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                n++;
        }
    }

    public static void main(String[] args) {

//        Thread watekA = new InfinityNumbers();
//        Thread watekB = new InfinityNumbers();
//        Thread watekC = new InfinityNumbers();


//        InfinityNumbers numbers = new InfinityNumbers();
//        numbers.start();
//        try {
//            numbers.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        InfinityNumbers numbers = new InfinityNumbers();
        numbers.start();
        try {
            numbers.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
