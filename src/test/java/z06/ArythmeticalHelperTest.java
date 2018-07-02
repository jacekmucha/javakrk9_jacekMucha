package z06;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assume.assumeTrue;


//TESTUJEMY SUME

@RunWith(Parameterized.class)
public class ArythmeticalHelperTest {

    private enum Opertation {
        SUM, MULTI, ABS
    }

    private Double val1, val2; // argumenty testowanej metody
    private Double result; // wynik
    private Opertation op; // identyfikator dla metody testowej z danymi testowymi


    public ArythmeticalHelperTest(Double val1, Double val2, Double result, Opertation op) {
        this.val1 = val1;
        this.val2 = val2;
        this.result = result;
        this.op = op;
    }

    //ta metoda przygotowuje konkretne dane, które będą aplikowane asercji
    @Parameterized.Parameters
    public static Collection<Object[]> getParameters(){ // dowolna nazwa metody, ale obowiazkowa adnotacja

        //dwuwymiarową tablice obiektow zamieniamy na listę jednowymiarowych tablic

        Object[][] params = new Object[][]{
                {-2.0, 2.0, 0.0, Opertation.SUM},
                {4.5, 2.3, 6.8, Opertation.SUM},
                {-4.0, 2.0, -2.0, Opertation.SUM},
                {0.0, 2.3, 2.3, Opertation.SUM},
                {-4.0, 2.0, -8.0, Opertation.MULTI},
                {0.0, 2.3, 0.0, Opertation.MULTI},
                {-4.0, 2.0, 4.0, Opertation.ABS},
                {10.0, -11.0, 11.0, Opertation.ABS}
        };
        return Arrays.asList(params);
    }


    @Test
    public void testSum(){
        assumeTrue(op == Opertation.SUM);
        assertEquals(result, ArythmeticalHelper.sum(val1, val2));
    }
    @Test
    public void testMulti(){
        assumeTrue(op == Opertation.MULTI);
        assertEquals(result, ArythmeticalHelper.multiplication(val1, val2));
    }

    @Test
    public void testMaxAbsValue(){
        assumeTrue(op == Opertation.ABS);
        assertEquals(result, ArythmeticalHelper.maxAbsValue(val1, val2));

    }


    //    @Test
//    public void testSum(){
//        assertEquals(12.5,  ArythmeticalHelper.sum(5.0, 7.5));
//    }
//
//    @Test
//    public void testMultiplication(){
//        assertEquals(37.5,  ArythmeticalHelper.multiplication(5.0, 7.5));
//        assertEquals(-37.5,  ArythmeticalHelper.multiplication(-5.0, 7.5));
//        assertEquals(37.5,  ArythmeticalHelper.multiplication(-5.0, -7.5));
//    }





}

