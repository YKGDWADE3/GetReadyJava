package FizzBuzzExercise;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    public FizzBuzz() {
    }

    public void replaceNumberToWord(int n) {
        for (int i = 1; i <= n; i++) {
            if (fizz(i) && buzz(i)) {
                System.out.println(FIZZ + BUZZ);
            } else if (fizz(i)) {
                System.out.println(FIZZ);
            } else if (buzz(i)) {
                System.out.println(BUZZ);
            } else {
                System.out.println(i);
            }
        }
    }

    private boolean fizz(int n) {
        return n % 3 ==0;
    }

    private boolean buzz(int n) {
        return n % 5 ==0;
    }

}
