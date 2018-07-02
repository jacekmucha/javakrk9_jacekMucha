package z07;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.fail;

/*
TDD
 */
public class StringCommonsTest {

    @Test
    public void testMinPositiveWithoutException() throws IncorrectArgumentException {

        List<Double> test1 = Arrays.asList(-2D, -1D, 0D, 1D, 2D);
        assertThat(NumbersCommons.minPositive(test1)).isEqualTo(0D);

        List<Double> test3 = Arrays.asList(-1D, -1D, 1D, 1D);
        assertThat(NumbersCommons.minPositive(test3)).isEqualTo(1D);

        List<Double> test4 = Arrays.asList(0D);
        assertThat(NumbersCommons.minPositive(test4)).isEqualTo(0D);

        List<Double> test5 = Arrays.asList(-2D, -1D, 0D);
        assertThat(NumbersCommons.minPositive(test5)).isEqualTo(0D); // ???
    }

    @Test
    public void testMinPositiveException(){

        List<Double> test = Arrays.asList(-2D);

        try {
            NumbersCommons.minPositive(test);
            fail();
        } catch (IncorrectArgumentException e){
            System.out.println("IncorrectArgumentException!");
        }
    }

    @Test
    public void testSum() throws IncorrectArgumentException {
        List<Double> test1 = Arrays.asList(-2D, -1D, 0D, 1D, 2D, 3D);
        assertThat(NumbersCommons.sum(test1,0,5)).isEqualTo(3D);

        List<Double> test2 = Arrays.asList(-2D, -1D, 0D, 1D, 2D);
        assertThat(NumbersCommons.sum(test2,0,2)).isEqualTo(-3D);

        List<Double> test3 = Arrays.asList(0D);
        assertThat(NumbersCommons.sum(test3,0,0)).isEqualTo(0D);

    }


    @Test
    public void testConcString(){
        String []test1 = new String[]{"test", "abc", "test", "aaaa"};
        assertThat(StringCommons.concString(test1)).isEqualTo("aaaa_abc_test");

        String []test2 = new String[]{"kubek", "kubek", "flaga", "myszka"};
        assertThat(StringCommons.concString(test2)).isEqualTo("flaga_kubek_myszka");

        String []test3 = new String[]{"aaa", "bbb", "bbb", "ddd", "ccc"};
        assertThat(StringCommons.concString(test3)).isEqualTo("aaa_bbb_ccc_ddd");

        String []test4 = new String[]{"www"};
        assertThat(StringCommons.concString(test4)).isEqualTo("www");

        String []test5 = new String[]{""};
        assertThat(StringCommons.concString(test5)).isEqualTo("");

        String []test6 = new String[]{};
        assertThat(StringCommons.concString(test6)).isEqualTo("");

    }

    @Test
    public void testPalindrom(){
        String test1 = "kajak";
        assertThat(StringCommons.isPalindrom(test1)).isTrue();

        String test2 = "abcd";
        assertThat(StringCommons.isPalindrom(test2)).isFalse();

        String test3 = "aaa";
        assertThat(StringCommons.isPalindrom(test3)).isTrue();

        String test4 = "wwww";
        assertThat(StringCommons.isPalindrom(test4)).isTrue();

        String test5 = "www1";
        assertThat(StringCommons.isPalindrom(test5)).isFalse();

        String test6 = "";
        assertThat(StringCommons.isPalindrom(test6)).isTrue();
    }

    @Test
    public void testChangePairs(){
        String test1 = "abcde";
        assertThat(StringCommons.changePairs(test1)).isEqualTo("badce");

        String test2 = "abcdef";
        assertThat(StringCommons.changePairs(test2)).isEqualTo("badcfe");

        String test3 = "";
        assertThat(StringCommons.changePairs(test3)).isEqualTo("");

        String test4 = "ab";
        assertThat(StringCommons.changePairs(test4)).isEqualTo("ba");

        String test5 = "a";
        assertThat(StringCommons.changePairs(test5)).isEqualTo("a");


    }
}
