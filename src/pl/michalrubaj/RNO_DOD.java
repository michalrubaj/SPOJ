package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RNO_DOD {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine()); //  // write how many test cases you want to print out
        int[] output = new int[howManyTimes];

        for (int i = 0; i < howManyTimes; i++) {
            int howManyNumbers = Integer.parseInt(input.readLine()); // write how many numbers you want to add
            String[] numberArray;
            String numbers = input.readLine(); // write the numbers
            numberArray = numbers.split(" ");
            int sum = 0;
            int[] numberInt = new int[howManyNumbers];
            for (int j = 0; j < numberArray.length; j++) {
                numberInt[j] = Integer.parseInt(numberArray[j]);
                sum += numberInt[j];
            }
            output[i] = sum;
        }
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println(output[i]);
        }

    }
}
