package z07;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;


@RunWith(Parameterized.class)
public class DateCommonsTest {

    private enum Operation {
        TRUE, FALSE_ALL, FALSE_PART
    }

    private int inputDate;
    private boolean result;
    private Operation operation;

    public DateCommonsTest(int inputDate, boolean result, Operation operation) {
        this.inputDate = inputDate;
        this.result = result;
        this.operation = operation;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){
        Object[][] params = new Object[][]{

                {00000000, false, Operation.FALSE_ALL},
                {00001354, false, Operation.FALSE_ALL},
                {99999999, false, Operation.FALSE_PART},
                {99991231, false, Operation.FALSE_PART},
                {19997101, false, Operation.FALSE_PART},
                {19990230, false, Operation.FALSE_PART},
                {20001228, true, Operation.TRUE},
                {20000130, true, Operation.TRUE},
                {99991231, true, Operation.TRUE}

        }; return Arrays.asList(params);
    }

    @Test
    public void testDateVerFalseAll(){
        assumeTrue(operation == Operation.FALSE_ALL);
        assertEquals(result, DateCommons.dateVer(inputDate));
    }
    @Test
    public void testDateVerFalsePart(){
        assumeTrue(operation == Operation.FALSE_PART);
        assertEquals(result, DateCommons.dateVer(inputDate));
    }
    @Test
    public void testDateVerTrueAll(){
        assumeTrue(operation == Operation.TRUE);
        assertEquals(result, DateCommons.dateVer(inputDate));
    }

}




