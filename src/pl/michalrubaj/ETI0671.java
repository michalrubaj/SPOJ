package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ETI0671 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String inputString = input.readLine();
        String[] inputArray = inputString.split(" ");
        double radiusFirst = Double.parseDouble(inputArray[0]);
        double distance = Double.parseDouble(inputArray[1]);
        final double PI = 3.141592654d;
        double result = (Math.pow(radiusFirst,2)-(Math.pow(distance,2)/4))*PI;
        System.out.println(result);
    }
}
