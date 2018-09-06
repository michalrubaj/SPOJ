package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        String[] output = new String[howManyTimes];
        for (int i = 0; i < howManyTimes; i++) {
            int number = Integer.parseInt(input.readLine());
            switch (number) {
                case 0:
                    output[i]="0 1";
                    break;
                case 1:
                    output[i] = "0 1";
                    break;
                case 2:
                    output[i] = "0 2";
                    break;
                case 3:
                    output[i] = "0 6";
                    break;
                case 4:
                    output[i] = "2 4";
                    break;
                case 5:
                    output[i] = "2 0";
                    break;
                case 6:
                    output[i] = "2 0";
                    break;
                case 7:
                    output[i] = "4 0";
                    break;
                case 8:
                    output[i] = "2 0";
                    break;
                case 9:
                    output[i] = "8 0";
                    break;
                default:
                    output[i] = "0 0";
            }
        }
        for (String s : output) {
            System.out.println(s);
        }

    }

}

