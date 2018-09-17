package pl.michalrubaj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SKARBI {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int howManyTimes = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < howManyTimes; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0, 0);
            map.put(1, 0);
            map.put(2, 0);
            map.put(3, 0);
            int howManySteps = Integer.parseInt(bufferedReader.readLine());
            for (int j = 0; j < howManySteps; j++) {
                String[] clues = bufferedReader.readLine().split(" ");
                int direction = Integer.parseInt(clues[0]);
                int stepsInThatDirection = Integer.parseInt(clues[1]);
                if (map.containsKey(direction)) {
                    map.put(direction, map.get(direction) + stepsInThatDirection);
                }
            }

            if (map.get(0) == map.get(1) && map.get(2) == map.get(3)) {
                System.out.println("studnia");
            } else if (isNorth(map)) {
                shortStepsSouthNorth(map,0,1);
                map.remove(1);
                shortStepEq(map,2,3);
                show(map);
            } else if (!isNorth(map)) {
                shortStepsSouthNorth(map,1,0);
                map.remove(0);
                shortStepEq(map,2,3);
                show(map);

            }

        }
    }


    private static boolean isNorth(Map<Integer, Integer> map) {
        if (map.get(0) >= map.get(1)) {
            return true;
        }
        return false;
    }

    private static boolean isWest(Map<Integer, Integer> map) {
        if (map.get(2) >= map.get(3)) {
            return true;
        }
        return false;
    }
    private static void show(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
    private static Map<Integer,Integer> shortStepsSouthNorth(Map<Integer,Integer> map, int directionOne, int directionTwo) {

        map.put(directionOne, map.get(directionOne) - map.get(directionTwo));
        map.remove(directionTwo);
        return map;
    }
    private static Map<Integer,Integer> shortStepEq(Map<Integer,Integer> map, int directionOne, int directionTwo) {
        if (isWest(map)) {
            shortStepsSouthNorth(map,directionOne,directionTwo);
        } else {
            shortStepsSouthNorth(map,directionTwo,directionOne);
        }
        return map;
    }
}
