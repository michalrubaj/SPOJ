package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BFN1 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        for (int i = 0; i < howManyTimes; i++) {
            int in = Integer.parseInt(input.readLine());
            int count = 0;
            while (!isPalindrome(intToString(in))) {
                String reversed = "";
                for (int j = intToString(in).length() - 1; j >= 0; j--) {
                    reversed += intToString(in).charAt(j);
                }
                count++;
                int reversedInt = Integer.parseInt(reversed);
                in += reversedInt;
            }
            System.out.println(in+" "+count);
        }
    }


    private static String intToString(int number) {
        return String.valueOf(number);
    }

    private static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        boolean result = true;
        while (right > left) {
            if (input.charAt(left) != input.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }
}
