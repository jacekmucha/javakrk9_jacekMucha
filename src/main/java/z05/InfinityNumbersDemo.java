package z05;

import java.util.ArrayList;
import java.util.List;

public class InfinityNumbersDemo {

    public static void main(String[] args) {

        List<InfinityNumbers> threads = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            threads.add(new InfinityNumbers("Wątek " + i));
        }
        System.out.println("Main threads is working now... ");
        for (InfinityNumbers element : threads) {
            element.start();
        }
    }
}