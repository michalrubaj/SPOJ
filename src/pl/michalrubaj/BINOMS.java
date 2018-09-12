package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BINOMS {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            String[] str = input.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            BigInteger result = BigInteger.valueOf(1);
            // n!/k!
            for (int a = k + 1; a <= n; a++) {
                result = result.multiply(BigInteger.valueOf(a));
            }
            // result/(n-k)!
            for (int j = 1; j <= n - k; j++) {
                result = result.divide(BigInteger.valueOf(j));
            }
            System.out.println(result);
        }
    }


}
