import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        Integer currentNumber = numberList.get(0);
        if (currentNumber % 3 == 0 && currentNumber % 5 == 0)
            return "FizzBuzz";
        if (currentNumber % 5 == 0)
            return "Buzz";
        if (currentNumber % 3 == 0)
            return "Fizz";
        return currentNumber.toString();
    }
}
