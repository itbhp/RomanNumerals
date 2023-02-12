package it.twinsbrain.dojos;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class RomanNumerals {

    private static final Map<Integer, String> romanDictionary = new TreeMap<>(Comparator.reverseOrder()) {{
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public static String romanOf(int number) {
        if (romanDictionary.containsKey(number)) {
            return romanDictionary.get(number);
        }
        for (var key : romanDictionary.keySet()) {
            if (number > key) {
                return romanOf(key) + romanOf(number - key);
            }
        }
        return "";
    }
}
