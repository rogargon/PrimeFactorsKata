import com.kata.junit.PrimeFactors;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsTest {
    private final PrimeFactors primeFactors = new PrimeFactors();

    @Test
    public void oneGeneratesEmptyList() {
        List<Integer> actualResult = primeFactors.generate(1);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void twoGeneratesTwo() {
        List<Integer> actualResult = primeFactors.generate(2);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void fourGeneratesTwoTwo() {
        List<Integer> actualResult = primeFactors.generate(4);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void eightGeneratesTwoTwoTwo() {
        List<Integer> actualResult = primeFactors.generate(8);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void nineGeneratesThreeThree() {
        List<Integer> actualResult = primeFactors.generate(9);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void thirteenHundredGeneratesTwoTwiceFiveTwiceAndThirteen() {
        List<Integer> actualResult = primeFactors.generate(1300);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(2);
        expectedResult.add(5);
        expectedResult.add(5);
        expectedResult.add(13);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void input25410Generates2_3_5_7_11_11() {
        List<Integer> actualResult = primeFactors.generate(25410);
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(3);
        expectedResult.add(5);
        expectedResult.add(7);
        expectedResult.add(11);
        expectedResult.add(11);
        assertEquals(expectedResult, actualResult);
    }
}
