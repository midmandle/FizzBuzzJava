import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class NumberEvenlyDivisibleByThreeAndFiveTests {
    @Test
    public void fifteen_returns_fizzbuzz() {
        List<Integer> numberList = asList(15);
        assertEquals("FizzBuzz", new FizzBuzz(numberList).generate());
    }

    @Test
    public void thirty_returns_fizzbuzz() {
        List<Integer> numberList = asList(30);
        assertEquals("FizzBuzz", new FizzBuzz(numberList).generate());
    }
}
