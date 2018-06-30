package z05;

import org.junit.Test;
import z03.Homework04;
import z03.InvalidArgumentException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Homework04Test {

    @Test
    public void min() throws InvalidArgumentException {

        List<Integer> list = new ArrayList<>();
        list.add(999);
        list.add(888);
        list.add(777);
        list.add(666);
        list.add(555);
        list.add(444);
        list.add(333);
        list.add(222);
        list.add(111);

       int result = Homework04.min(list);
       assertEquals(111, result);

    }


    @Test
    public void max() throws InvalidArgumentException {

        List<Integer> listMax = new ArrayList<>();
        listMax.add(111);
        listMax.add(222);
        listMax.add(333);
        listMax.add(444);
        listMax.add(555);
        listMax.add(666);
        listMax.add(777);
        listMax.add(888);
        listMax.add(999);

        int result = Homework04.max(listMax);
        assertEquals(999, result);

    }
}
