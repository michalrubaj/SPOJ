package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class STOS {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        String s;
        int count = 0;
        while ((s = bufferedReader.readLine()) != null) {
            if (s.equals("+")) {
                int number = Integer.parseInt(bufferedReader.readLine());
                try {
                    array[count] = number;
                    System.out.println(":)");
                    count++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(":(");
                }
            }
            if (s.equals("-")) {
                try {
                    count--;
                    System.out.println(array[count]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(":(");
                }
            }
        }

    }
}
