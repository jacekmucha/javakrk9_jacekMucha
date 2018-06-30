package z05;

import z03.StringHelper;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.fail;

public class StringHelperTest {

    @Test
    public void StringHelperTest(){

        char []test = {'f','e','c','b','b','a','a'};
        StringHelper.sortChars(test);
        System.out.println(Arrays.toString(test));
        for (int i = 0; i < test.length - 1; i++){
            int asci1 = (int)test[i];
            int asci2 = (int)test[i + 1];
            if (asci1 > asci2){
                fail();
            }

        }

    }

}