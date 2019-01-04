import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        Integer currentNumber = numberList.get(0);
        if (isDivisibleBy3(currentNumber) && currentNumber % 5 == 0)
            return "FizzBuzz";
        if (currentNumber % 5 == 0)
            return "Buzz";
        if (isDivisibleBy3(currentNumber))
            return "Fizz";
        return currentNumber.toString();
    }

    private boolean isDivisibleBy3(Integer currentNumber) {
        return currentNumber % 3 == 0;
    }
}
