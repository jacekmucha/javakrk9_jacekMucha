package z05;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Account { // ta klasa jest "monitorem", bo zawiera metodę z sekcją krytyczną,
                        // która jest obsługiwana przez mechanizm synchronizacji

    private int account = 0;
    private final static Logger logger = Logger.getLogger(Account.class.getName()); // nazwa klasy przekazana przez "reflekcję"


    // sekcja krytyczna, to fragment, w którym min. 2 wątki mogą działac jednoczesnie
//    synchronized public void increment(){
     public void increment(){
         logger.log(Level.INFO, "Thread started changing account... ");

         //opuszczamy semafor
           synchronized (this){
                 int temp = account;
                 temp++;
                 account = temp;
             }
             // zwolnienie semafora


        logger.log(Level.INFO, "Account has been changed");
    }

    public int getAccount() {
        return account;
    }
}
