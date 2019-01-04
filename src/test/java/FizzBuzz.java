import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        Integer currentNumber = numberList.get(0);
        if (isDivisibleBy3(currentNumber) && isDivisibleBy5(currentNumber))
            return "FizzBuzz";
        if (isDivisibleBy5(currentNumber))
            return "Buzz";
        if (isDivisibleBy3(currentNumber))
            return "Fizz";
        return currentNumber.toString();
    }

    private boolean isDivisibleBy5(Integer currentNumber) {
        return currentNumber % 5 == 0;
    }

    private boolean isDivisibleBy3(Integer currentNumber) {
        return currentNumber % 3 == 0;
    }
}
