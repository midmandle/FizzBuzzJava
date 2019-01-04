import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberEvenlyDivisibleByThreeAndFiveTests {
    @Test
    @Parameters({
            "15",
            "30",
            "45",
            "60"
    })
    public void fifteen_returns_fizzbuzz(int actualNumber) {
        List<Integer> numberList = asList(actualNumber);
        assertEquals("FizzBuzz", new FizzBuzz(numberList).generate());
    }

}
