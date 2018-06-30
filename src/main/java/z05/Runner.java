package z05;


public class Runner {

    private static class RunerImpl implements Runnable {

        private Long id;

        public RunerImpl(Long id) {
            this.id = id;
        }

        @Override
        public void run() {
            while(true){
                System.out.print(java.lang.String.format("Thread %d is working | ", id));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        new Thread(new RunerImpl(1L)).start();

    }
}
