package z06;

import org.junit.Test;
import z03.InvalidArgumentException;

import static org.junit.Assert.*;

public class ArrayCommonsTest {

    @Test
    public void testReplaceCorrectArgs(){
        try {
           Integer[]arr = new Integer[]{2,3,1,0,5};

            ArrayCommons.replace(arr,2,4,-1);
            assertTrue(arr[2].equals((-1)) && arr[3].equals(-1) && arr[4].equals(-1));
            assertTrue(!arr[0].equals(-1) && arr[2].equals((-1)) && arr[3].equals(-1) && arr[4].equals(-1));
            ArrayCommons.replace(new Integer[]{1},0,0,-1);

        } catch (InvalidArgumentException e) {
            fail();
        }
    }

    @Test(expected = InvalidArgumentException.class) // test zaliczony, jeżeli metoda rzuci wyjatek
    public void testReplaceIncorrectArgs2() throws InvalidArgumentException {
        ArrayCommons.replace(null,-2,4,-1);
    }

    @Test
    public void testReplaceIncorrectArgs(){

        boolean q  = false; // zakladamy, ze nie rzuci wyjatku

        try {
            Integer[]arr = new Integer[]{2,3,1,0,5};
            ArrayCommons.replace(arr,-2,4,-1);

        } catch (InvalidArgumentException e) {
            q = true;
        }

        assertTrue(q);
    }

    @Test
    public void testTableReplace() throws InvalidArgumentException {

        Double[] tab1 = new Double[]{2.3, -4.0, 1.5};
        Double[] tab2 = new Double[]{4.5, 4.0, 2.1};
        Double[] res = ArrayCommons.tableReplace(tab1, tab2);

        assertTrue(res[0].equals((3.6)) && res[1].equals(0.0) && res[2].equals(6.8));
    }

}
