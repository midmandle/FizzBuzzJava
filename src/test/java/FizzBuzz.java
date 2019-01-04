import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        List<String> fizzBuzzList = new ArrayList<String>();

        for (Integer number : numberList) {
            if (isDivisibleBy3(number) && isDivisibleBy5(number)) {
                fizzBuzzList.add("FizzBuzz");
                continue;
            }
            if (isDivisibleBy5(number)) {
                fizzBuzzList.add("Buzz");
                continue;
            }
            if (isDivisibleBy3(number)) {
                fizzBuzzList.add("Fizz");
                continue;
            }
            fizzBuzzList.add(number.toString());
        }

        return String.join(", ", fizzBuzzList);
    }

    private boolean isDivisibleBy5(Integer currentNumber) {
        return currentNumber % 5 == 0;
    }

    private boolean isDivisibleBy3(Integer currentNumber) {
        return currentNumber % 3 == 0;
    }
}
