public class Fibonacci {
    public int calculate(int index) {

        if (index < 0) {
            throw new IllegalArgumentException("Fibonnaci series does not have negative numbers");
        }

        if (index == 0 || index ==1) {
            return 1;
        }
        return calculate(index - 1) + calculate(index - 2);
    }
}
