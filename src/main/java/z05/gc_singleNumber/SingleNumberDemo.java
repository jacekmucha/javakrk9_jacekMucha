package z05.gc_singleNumber;

public class SingleNumberDemo {

    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {

            SingleNumber sn = new SingleNumber(i);
            sn = null;
        }

    }


}
