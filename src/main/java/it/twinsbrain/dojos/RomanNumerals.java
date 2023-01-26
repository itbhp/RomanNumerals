package it.twinsbrain.dojos;

public class RomanNumerals {
    public static String romanOf(int number) {
        if (number == 5) {
            return "V";
        }
        if (number == 1) {
            return "I";
        }
        return romanOf(number - 1) + "I";
    }
}
