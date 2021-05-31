package lesson3;

import java.util.*;

public class Duplicates {
    private static final String[] INPUT_ARRAY =
            {"Apple", "Apple", "Apple", "Banana", "Pear",
                    "Pear", "Orange", "Orange", "Kiwi", "Mandarin"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(INPUT_ARRAY));
        System.out.println(createMap());
    }

    private static Map<String, Integer> createMap() {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String s : INPUT_ARRAY) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        return map;
    }
}
