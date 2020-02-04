package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {78, 15, 105,25};
        primeFac(num);
    }

    public static void primeFac(int[] n) {
        String[] result=new String[n.length];
        for (int j = 0; j < n.length; j++) {
            int num=n[j];
          
            List<Integer> setPrimeFactors = new ArrayList<>();
            for (int i = 2; i <= n[j] / i; i++) {
                while (n[j] % i == 0) {
                    setPrimeFactors.add(i);
                    n[j] /= i;
                }
            }
            if (n[j] > 1) {
                setPrimeFactors.add(n[j]);
            }
            //System.out.println(setPrimeFactors);
            result[j]="Prime Factors of " +num +":" + setPrimeFactors.toString();
            System.out.println(result[j]);

        }
    }
}

