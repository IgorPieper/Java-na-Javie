package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

public class ArraysStatisticsTest {

    // max

    @Test
    public void maximumShouldBePositiveNumber(){
        Assert.assertEquals(1, ArraysStatistics.max(new int[]{-10,-5,1,-2,-13}));
    }

    @Test
    public void biggestNumber(){
        int biggest = 10;
        Assert.assertEquals(biggest, ArraysStatistics.max(new int[]{10,5,7,-2,-13}));
    }

    // min

    @Test
    public void minimumShouldBeNegativeNumber(){
        Assert.assertEquals(-13, ArraysStatistics.min(new int[]{-10,-5,1,-2,-13}));
    }

    @Test
    public void smallestNumber(){
        int smallest = -2;
        Assert.assertEquals(smallest, ArraysStatistics.min(new int[]{10,5,7,-2,13}));
    }

    // avg

    @Test
    public void averageNumber1(){
        Assert.assertEquals(-5.0, ArraysStatistics.avg(new int[]{-10,-5,1,-2,-13}), 0.1);
    }

    @Test
    public void averageNumber2(){
        Assert.assertEquals(3.0, ArraysStatistics.avg(new int[]{10,-5,1,-2,13}), 0.1);
    }

    // sum

    @Test
    public void sumNumber1(){
        Assert.assertEquals(-29, ArraysStatistics.sum(new int[]{-10,-5,1,-2,-13}));
    }

    @Test
    public void sumNumber2(){
        Assert.assertEquals(17, ArraysStatistics.sum(new int[]{10,-5,1,-2,13}));
    }
}
