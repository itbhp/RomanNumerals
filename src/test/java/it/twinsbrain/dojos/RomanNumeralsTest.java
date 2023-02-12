package it.twinsbrain.dojos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static it.twinsbrain.dojos.RomanNumerals.romanOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanNumeralsTest {

    @ParameterizedTest(name = "roman number for {0} is {1}")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III"
    })
    void from_1_to_3_works(int arabic, String roman) {
        assertThat(romanOf(arabic), equalTo(roman));
    }

    @Test
    void four_is_IV() {
        assertThat(romanOf(5), equalTo("V"));
    }
    @Test
    void five_is_V() {
        assertThat(romanOf(5), equalTo("V"));
    }

    @ParameterizedTest(name = "roman number for {0} is {1}")
    @CsvSource({
            "6, VI",
            "7, VII",
            "8, VIII"
    })
    void from_6_to_8_works(int arabic, String roman) {
        assertThat(romanOf(arabic), equalTo(roman));
    }

    @Test
    void nine_is_IX() {
        assertThat(romanOf(9), equalTo("IX"));
    }

    @Test
    void ten_is_X() {
        assertThat(romanOf(10), equalTo("X"));
    }

    @ParameterizedTest(name = "roman number for {0} is {1}")
    @CsvSource({
            "11, XI",
            "12, XII",
            "13, XIII"
    })
    void from_11_to_13_works(int arabic, String roman) {
        assertThat(romanOf(arabic), equalTo(roman));
    }

    @Test
    void fourteen_is_XIV() {
        assertThat(romanOf(14), equalTo("XIV"));
    }

    @Test
    void fifty_is_L() {
        assertThat(romanOf(50), equalTo("L"));
    }

    @Test
    void forty_is_XL() {
        assertThat(romanOf(40), equalTo("XL"));
    }

    @ParameterizedTest(name = "roman number for {0} is {1}")
    @CsvSource({
            "45, XLV",
            "46, XLVI",
            "47, XLVII",
            "48, XLVIII",
            "49, XLIX",
    })
    void from_45_to_49_works(int arabic, String roman) {
        assertThat(romanOf(arabic), equalTo(roman));
    }
}
