package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRIME_T {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        int divider = 1;
        int countDividers = 0;

        String[] output = new String[howManyTimes];
        for (int i = 0; i < howManyTimes; i++) {
            double number = Double.parseDouble(input.readLine());
            while (number >= divider && countDividers<=2) {
                if (number % divider == 0) {
                    countDividers++;
                }
                divider++;
            }
            if (countDividers == 2) {
                output[i] = "TAK";
            } else {
                output[i] = "NIE";
            }
            divider = 1;
            countDividers = 0;
        }
        for(String s : output)
            System.out.println(s);
    }
}













