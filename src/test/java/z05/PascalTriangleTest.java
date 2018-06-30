package z05;

import z03.InvalidArgumentException;
import z04.PascalTriangle;

import static org.junit.Assert.assertEquals;

public class PascalTriangleTest {

    public void testNewtonNK() throws InvalidArgumentException {
        int res = PascalTriangle.newtonNK(4,2);
        assertEquals(6, res);
    }
}
