import java.util.List;

public class FizzBuzz {

    private List<Integer> numberList;

    public FizzBuzz(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public String generate() {
        return numberList.get(0).toString();
    }
}
