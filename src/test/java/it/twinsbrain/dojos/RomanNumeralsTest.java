package it.twinsbrain.dojos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static it.twinsbrain.dojos.RomanNumerals.romanOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanNumeralsTest {

    /*
      # Test List

      I -> 1
      II -> 2
      III -> 3
      IV -> 4

     */

    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III"
    })
    void from_1_to_3_works(int arabic, String roman) {
        assertThat(romanOf(arabic), equalTo(roman));
    }

    @Test
    void five_is_V() {
        assertThat(romanOf(5), equalTo("V"));
    }
}
