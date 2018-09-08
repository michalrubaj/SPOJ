package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GLUTTON {
    public static void main(String[] args) throws IOException {
        final int howManySecondInOneDay = 86400;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine()); //  // write how many test cases you want to print out
        for (int i = 0; i < howManyTimes; i++) {
            double howManyCookiesWillBeEaten = 0d;
            double result = 0d;
            int resultInInt = 0;
            String[] howManyPlayershowManyCookies = input.readLine().split(" ");
            int howManyPlayers = Integer.parseInt(howManyPlayershowManyCookies[0]);
            int howManyCookiesInOneBox = Integer.parseInt(howManyPlayershowManyCookies[1]);
            for (int j = 0; j < howManyPlayers; j++) {
                int secondsPerCookie = Integer.parseInt(input.readLine());
                howManyCookiesWillBeEaten += (howManySecondInOneDay / secondsPerCookie);
            }
            result = (howManyCookiesWillBeEaten / howManyCookiesInOneBox);
            if (result - Math.floor(result) > 0) {
                resultInInt = (int) result + 1;
            } else {
                resultInInt = (int) result;
            }
            System.out.println(resultInInt);
        }
    }
}

