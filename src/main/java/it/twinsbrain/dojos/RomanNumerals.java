package it.twinsbrain.dojos;

public class RomanNumerals {
    public static String romanOf(int number) {
        if (number == 5) {
            return "V";
        }
        if (number == 1) {
            return "I";
        }
        return "I" + romanOf(number - 1);
    }
}
