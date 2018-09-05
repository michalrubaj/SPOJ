package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Half_of_the_half {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howMany = Integer.parseInt(input.readLine());
        String[] list = new String[howMany];
        for (int i = 0; i < howMany; i++) {
            list[i] = input.readLine();
        }
        String a = "";
        for (int i = 0; i < howMany; i++) {
            for (int j = 0; j < list[i].length() / 2; j += 2) {
                a += list[i].substring(0, list[i].length() / 2).charAt(j);

            }
            a += "\n";
        }
        System.out.println(a);
    }
}

