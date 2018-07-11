package PrimeFactorsExercise;

import java.util.ArrayList;

public class PrimeFactors {
    public PrimeFactors() {
    }

    public void generate(int n) {
        if (n > 3) {
            ArrayList<Integer> list = new ArrayList<>();
            int prime = 2;
            while (prime < Math.sqrt(n) + 1){
                if (n % prime == 0) {
                    list.add(prime);
                    n = n / prime;
                }else {
                    prime++;
                }
            }
            list.add(n);
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print("" + list.get(i) + ",");
            }
            System.out.println(list.get(list.size() - 1));
        }else {
            System.out.println(n);
        }
    }
}
