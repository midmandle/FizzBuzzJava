import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        if(numberList.get(0) == 3)
            return "Fizz";
        return numberList.get(0).toString();
    }
}
