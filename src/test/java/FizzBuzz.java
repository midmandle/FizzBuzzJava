import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        if(numberList.get(0) == 5)
            return "Buzz";
        if(numberList.get(0) % 3 == 0)
            return "Fizz";
        return numberList.get(0).toString();
    }
}
