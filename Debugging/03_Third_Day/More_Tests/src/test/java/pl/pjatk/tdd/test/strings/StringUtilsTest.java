package pl.pjatk.tdd.test.strings;

import org.junit.Test;
import pl.pjatk.tdd.strings.StringUtils;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {
    @Test
    public void SumSum1(){
        assertEquals(7, StringUtils.NumberSum("43"));
    }

    @Test
    public void SumSum2(){
        assertEquals(18, StringUtils.NumberSum("99"));
    }
}
