package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class ZLICZ {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(input.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < howManyTimes; i++) {
            stringBuilder.append(input.readLine());
        }
        String string = stringBuilder.toString().replaceAll(" ", "");
        Map<Character, Integer> mapa = new HashMap<Character, Integer>();
        for (int j = 0; j < string.length(); j++) {
            char letter = string.charAt(j);
            if (!mapa.containsKey(letter)) {
                mapa.put(letter, 0);
            }
            mapa.put(letter, mapa.get(letter) + 1);
        }
        for (Map.Entry<Character, Integer> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}

