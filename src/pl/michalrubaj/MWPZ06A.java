package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MWPZ06A {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            String[] numbers = input.readLine().split(" ");
            int x = Integer.parseInt(numbers[0]);
            int y = Integer.parseInt(numbers[1]);
            int z = Integer.parseInt(numbers[2]);
            double liczebnik = (z * y - x - y);
            double mianownik = z - 1;
            double result = (liczebnik / mianownik) * 12;
            long resultFinal = Math.round(result);
            System.out.println(resultFinal);
        }
    }
}
