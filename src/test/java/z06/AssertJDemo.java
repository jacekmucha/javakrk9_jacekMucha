package z06;

import org.junit.Test;
import z03.StringHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

import static org.assertj.core.api.Assertions.assertThat; // <- ten konkretny import
import static org.junit.Assert.assertTrue;

public class AssertJDemo {

    @Test
    public void test() {
        String result = StringHelper.reverse("test");
        assertTrue(result.equals("tset"));
        assertEquals("tset", StringHelper.reverse("test"));

        //można zrobićto bardzie czytelnie i z większymi możliwościami
        assertThat(result).isEqualTo("tset");
        // vs.
        List<String> list = Arrays.asList("abc", "www", "hhh", "test1", "zzz");

        assertTrue(list.contains("www") && list.contains("abc") && list.contains("hhh"));
        // vs.
        assertThat(list).contains("www", "abc", "test1", "zzz");


        String str = "123vzvxdzjvidgzjxWWW";
        assertThat(str).startsWith("123").endsWith("WWW").containsIgnoringCase("JVI");

    }

    @Test
    public void testListRemove(){
        List<Integer> result = new ArrayList<>();
        result.add(10);
        result.add(20);
        result.add(30);
        result.add(30);
        result.add(40);
        result.add(50);

        assertThat(result).startsWith(50).endsWith(10);
    }



}
