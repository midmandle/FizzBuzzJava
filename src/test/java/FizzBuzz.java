import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        Integer currentNumber = numberList.get(0);
        List<String> fizzBuzzList = new ArrayList<String>();
        if (isDivisibleBy3(currentNumber) && isDivisibleBy5(currentNumber)) {
            fizzBuzzList.add("FizzBuzz");
            return "FizzBuzz";
        }
        if (isDivisibleBy5(currentNumber)) {
            fizzBuzzList.add("Buzz");
            return "Buzz";
        }
        if (isDivisibleBy3(currentNumber)) {
            fizzBuzzList.add("Fizz");
            return "Fizz";
        }
        fizzBuzzList.add(currentNumber.toString());
        return fizzBuzzList.get(0);
    }

    private boolean isDivisibleBy5(Integer currentNumber) {
        return currentNumber % 5 == 0;
    }

    private boolean isDivisibleBy3(Integer currentNumber) {
        return currentNumber % 3 == 0;
    }
}
