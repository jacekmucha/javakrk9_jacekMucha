package z05;

public class RunnableInformatorDemo {

    public static void main(String[] args) {

        final int NUB_OF_THREADS = 20;
        for (int i= 0; i<= NUB_OF_THREADS; i++){
            RunnableInformator inf  = new RunnableInformator(new Long(i), i*2);

            Thread th = new Thread(inf);
            th.start();

            // to to samo co:
            // new Thread(new RunnableInformator(new Long(i), i*2)).start();
        }


    }
}
