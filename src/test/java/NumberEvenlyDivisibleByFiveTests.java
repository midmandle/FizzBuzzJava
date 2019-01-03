import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class NumberEvenlyDivisibleByFiveTests {
    @Test
    public void five_returns_string_buzz() {
        List<Integer> numberList = asList(5);
        assertEquals("Buzz", new FizzBuzz(numberList).generate());
    }

    @Test
    public void ten_returns_string_buzz() {
        List<Integer> numberList = asList(10);
        assertEquals("Buzz", new FizzBuzz(numberList).generate());
    }
}
