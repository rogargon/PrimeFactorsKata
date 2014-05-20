import com.kata.junit.PrimeFactors;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest {
    private PrimeFactors primeFactors;

    @Before
    public void setUp() throws Exception {
        primeFactors = new PrimeFactors();
    }

    @Test
    public void oneGeneratesEmptyList() throws Exception {
        List actualResult = primeFactors.generate(1);
        ArrayList expectedResult = new ArrayList<Integer>();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void twoGeneratesTwo() throws Exception {
        List actualResult = primeFactors.generate(2);
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fourGeneratesTwoTwo() throws Exception {
        List actualResult = primeFactors.generate(4);
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eightGeneratesTwoTwoTwo() throws Exception {
        List actualResult = primeFactors.generate(8);
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void nineGeneratesThreeThree() throws Exception {
        List actualResult = primeFactors.generate(9);
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(3);
        expectedResult.add(3);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void thirteenHundredGeneratesTwoTwiceFiveTwiceAndThirteen() {
        List actualResult = primeFactors.generate(1300);
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(5);
        expectedResult.add(5);
        expectedResult.add(13);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void input25410Generates2_3_5_7_11_11() {
        List actualResult = primeFactors.generate(25410);
        ArrayList expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(11);
        expectedResult.add(11);
        Assert.assertEquals(expectedResult, actualResult);
    }
}