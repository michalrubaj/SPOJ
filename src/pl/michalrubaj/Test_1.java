package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test_1 {
    public static void main(String[] args) throws IOException {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int firstNumber = Integer.parseInt(input.readLine());
            int secondNumber = Integer.parseInt(input.readLine());
            System.out.println(firstNumber+secondNumber);
    }
}
