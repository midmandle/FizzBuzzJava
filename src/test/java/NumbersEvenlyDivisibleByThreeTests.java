import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class NumbersEvenlyDivisibleByThreeTests {

    @Test
    public void three_returns_string_three() {
        List<Integer> numberList = asList(3);
        assertEquals("Fizz", new FizzBuzz(numberList).generate());
    }

    @Test
    public void six_returns_string_six() {
        List<Integer> numberList = asList(6);
        assertEquals("Fizz", new FizzBuzz(numberList).generate());
    }

}

