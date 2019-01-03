import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class NonSpecialNumberReturnsStringTests {
    @Test
    public void one_returns_string_one() {
        List<Integer> numberList = asList(1);
        assertEquals("1", new FizzBuzz(numberList).generate());
    }

    @Test
    public void two_returns_string_two() {
        List<Integer> numberList = asList(2);
        assertEquals("2", new FizzBuzz(numberList).generate());
    }
}

