package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

public class STOS_QUEUE {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Vector<Integer> stos = new Vector<>();
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            if (s.equals("+")) {
                int number = Integer.parseInt(bufferedReader.readLine());
                if(stos.size()<10) {
                    stos.add(number);
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            } else if (s.equals("-") && stos.size()>0) {
                System.out.println(stos.lastElement());
                stos.remove(stos.size()-1);
            } else {
                System.out.println(":(");
            }
        }
    }
}
