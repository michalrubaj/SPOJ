package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SUMA {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int number = 0;
        while ((s=bufferedReader.readLine())!=null) {
            number+=Integer.parseInt(s);
            System.out.println(number);
        }



    }
}
