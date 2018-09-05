package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nwd {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        int[] numberInt = new int[2];
        int[] output = new int[howManyTimes];
        for (int i = 0; i < howManyTimes; i++) {
            String inputString = input.readLine();
            String[] numbersString = inputString.split(" ");
            for (int j = 0; j < 2; j++) {
                numberInt[j] = Integer.parseInt(numbersString[j]);
            }
            output[i] = nwd(numberInt[0], numberInt[1]);
        }
        for (int i : output) {
            System.out.println(i);
        }
    }

    private static int nwd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}

