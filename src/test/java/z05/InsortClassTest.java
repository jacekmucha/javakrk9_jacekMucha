package z05;

import org.junit.Test;
import z04.InsortClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsortClassTest {

//    @Test
//    public void insortGen(){
//        List test = new ArrayList();
//        test.add("ccc");
//        test.add("bbb");
//        test.add("aaa");
//
//        InsortClass.insortGen(test);
//
//    }

    @Test
    public void quickSortTest(){
        Double []tab = {10.5, -2.5, 9.0, -2.5, 4.0};
        InsortClass.quicksort(tab);
        System.out.println(Arrays.toString(tab));
    }




}
