import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumbersConvertedToFizzBuzzStringTests {
    @Test
    @Parameters(
            method = "parameters_for_converts_list_of_numbers_to_csv_string"
    )
    public void converts_list_of_numbers_to_csv_string(String expectedOutput, List<Integer> numberList) {
        assertEquals(expectedOutput, new FizzBuzz(numberList).generate());
    }

    private Object[] parameters_for_converts_list_of_numbers_to_csv_string() {
        return new Object[]{
                new Object[]{"1, 2", asList(1, 2)},
                new Object[]{"1, 2, Fizz", asList(1, 2, 3)},
                new Object[]{"1, 2, Fizz, 4, Buzz", asList(1, 2, 3, 4, 5)},
                new Object[]{"1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)},
        };
    }
}
