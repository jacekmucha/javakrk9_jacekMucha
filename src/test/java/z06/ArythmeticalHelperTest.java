package z06;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArythmeticalHelperTest {

    @Test
    public void testSum(){
        assertEquals(12.5,  ArythmeticalHelper.sum(5.0, 7.5));
    }

    @Test
    public void testMultiplication(){
        assertEquals(37.5,  ArythmeticalHelper.multiplication(5.0, 7.5));
        assertEquals(-37.5,  ArythmeticalHelper.multiplication(-5.0, 7.5));
        assertEquals(37.5,  ArythmeticalHelper.multiplication(-5.0, -7.5));

    }


}
