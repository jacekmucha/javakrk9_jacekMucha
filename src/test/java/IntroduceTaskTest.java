import org.junit.Test;
import z01.IntroduceTask;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IntroduceTaskTest {

    @Test
    public void testIsPath(){
        assertTrue(IntroduceTask.isPath("GGLLPPDD"));
        assertFalse(IntroduceTask.isPath("GLPDD"));
        assertTrue(IntroduceTask.isPath(""));
    }


}
