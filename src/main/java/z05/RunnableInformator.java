package z05;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableInformator implements Runnable {

    private Long id;
    private int n; // tyle razy watek wypisze swoje informacje
    private final static Logger logger = Logger.getLogger(RunnableInformator.class.getName());
    private final static Random rand = new Random();

    public RunnableInformator(Long id, int n) {
        this.id = id;
        this.n = n;
    }

    @Override
    public void run() {

        for(int i = 1; i<=n; i++){
            logger.log(Level.INFO, String.format("Teraz działa wątek nr %d", id));
            try {
                Thread.sleep(200 + rand.nextInt(501));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
