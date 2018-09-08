package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EUCGAME {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine()); //  // write how many test cases you want to print out
        for (int i = 0; i < howManyTimes; i++) {
            String[] inputStringArray = input.readLine().split(" ");
            int amountCoinsPlayerA = Integer.parseInt(inputStringArray[0]);
            int amountCcoinsPlayerB = Integer.parseInt(inputStringArray[1]);
            while (amountCoinsPlayerA != amountCcoinsPlayerB) {
                if (amountCoinsPlayerA > amountCcoinsPlayerB) {
                    amountCoinsPlayerA -= amountCcoinsPlayerB;
                } else {
                    amountCcoinsPlayerB -= amountCoinsPlayerA;
                }
            }
            int result = amountCoinsPlayerA+amountCcoinsPlayerB;
            System.out.println(result);
        }
    }
}
