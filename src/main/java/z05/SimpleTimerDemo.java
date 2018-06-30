package z05;

public class SimpleTimerDemo {

    /*
    Każdy program powołuje  do życia głowny wątek programu - z metody main
     */

    public static void main(String[] args) {

        Thread simpleTimer = new SimpleTimer("timer1");
        simpleTimer.start();

        try {
            simpleTimer.join();
            // chce, zeby najpierw watek simpleTimer skonczyl swoje zadanie,
            // a pozniej prace kontynuowal glowny watek

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //instrukcja głównego watku programu
        System.out.println("hello kitty");
    }
}
