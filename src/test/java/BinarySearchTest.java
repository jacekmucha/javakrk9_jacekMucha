import org.junit.Test;
import z01.BinarySearch;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class BinarySearchTest {

    @Test
    public void test(){
        int T[] = {100,100,95,78,78,78,69,50,50,25,20,10,9,9,3};

        boolean q = BinarySearch.search(T, 9);

        assertTrue(q);

        int T2[] = {100,100,95,78,78,78,69,50,50,25,20,10,9,9,3};

        boolean q2 = BinarySearch.search(T, 50);
        assertFalse(q2);


    }
}
