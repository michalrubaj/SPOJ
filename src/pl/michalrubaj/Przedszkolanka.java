package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Przedszkolanka {
    public static void main(String[] args) throws IOException {


        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        int[] howManyChildren= new int[2];
        int[] output = new int[howManyTimes];
        for (int i = 0; i < howManyTimes; i++) {
            String inputString = input.readLine();
            String[] amountOfChildrenString = inputString.split(" ");
            for (int j = 0; j < 2 ; j++) {
                howManyChildren[j] = Integer.parseInt(amountOfChildrenString[j]);
            }
            output[i]=(howManyChildren[0]*howManyChildren[1])/NWD(howManyChildren[0],howManyChildren[1]);
        }
        for(int i : output) {
            System.out.println(i);
        }
    }


    private static int NWD(int firstNumber, int secondNumber) { // Algorytm Euklidesa
        while (firstNumber!=secondNumber) {
            if(firstNumber>secondNumber) {
                firstNumber-=secondNumber;
            } else {
                secondNumber-=firstNumber;
            }
        }
        return firstNumber;
    }
}
