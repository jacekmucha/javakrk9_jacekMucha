package z05;

import org.junit.Test;
import z04.FunctionsHelper;

import static org.junit.Assert.assertEquals;

public class FunctionsHelperTest {


    @Test
    public void testZero(){
        double vals[] = {-2.0,-1.0,0,1.0,2.0,3.0};

        int index = FunctionsHelper.zero(vals, h->h-2);
        assertEquals(index, 4);



    }

}
