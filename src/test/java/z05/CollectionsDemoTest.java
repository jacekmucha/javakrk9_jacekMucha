package z05;

import org.junit.Test;
import z02.CollectionsDemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionsDemoTest {

    @Test

   public void testJoin(){
        List<String> list = Arrays.asList("dog", "theory", "wolf", "computer");
        String result = CollectionsDemo.join(list, 4, 7);
        assertEquals("theory wolf ", result);
    }
}
