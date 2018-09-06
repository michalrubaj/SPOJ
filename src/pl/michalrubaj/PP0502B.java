package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PP0502B {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            String numbers = input.readLine(); // write the numbers
            numbers = numbers.substring(2);
            String[] numberArray = numbers.split(" ");
            for (int j = numberArray.length - 1; j >= 0; j--) {
                System.out.print(numberArray[j] + " ");
            }
            System.out.println("\n");
        }
    }
}