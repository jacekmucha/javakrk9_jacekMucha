package z05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberGenerator extends Thread {

    private Set<Integer> set;
    private int n;

    public RandomNumberGenerator(Set<Integer> set, int n) {
        this.set = set;
        this.n = n;
    }

    @Override
    public void run(){
        Random rand = new Random();

        while (set.size()< n) {
            int num = rand.nextInt(20) + 1;
            set.add(num);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        RandomNumberGenerator rg = new RandomNumberGenerator(set, 10);
        rg.start();
        try {
            rg.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(set.toString());
    }
}
