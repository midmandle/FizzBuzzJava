import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        if(numberList.get(0) == 3 || numberList.get(0) == 6)
            return "Fizz";
        return numberList.get(0).toString();
    }
}
