package it.twinsbrain.dojos;

import java.util.Map;

public class RomanNumerals {

    private static final Map<Integer, String> romanDictionary = Map.of(
            1, "I",
            4, "IV",
            5, "V"
    );

    public static String romanOf(int number) {
        if (romanDictionary.containsKey(number)) {
            return romanDictionary.get(number);
        }
        return romanOf(number - 1) + "I";
    }
}
