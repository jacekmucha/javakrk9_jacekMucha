package z05;

public class ZadSimpleTimer implements Runnable {

    private int sec = 1;
    private int min = 0;

    @Override
    public void run() {

        for(;;){
            if (sec %60 == 0){
                min++;
                System.out.println(String.format("\n-> %d min\n", min));
                sec = 1;
            }
            else if (sec %60 != 0){
                System.out.println(String.format("%d s", sec));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sec++;
        }

    }
}
