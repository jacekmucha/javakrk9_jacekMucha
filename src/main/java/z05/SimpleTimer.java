package z05;

import java.text.DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleTimer extends Thread {

    public SimpleTimer(String name){
        super(name);
    }


    @Override
    public void run(){
        DateFormat df  = new SimpleDateFormat("MM-yyyy HH:mm");
        Date date = new Date();
        String sdate = df.format(date);
        System.out.println(sdate);
    }
}
