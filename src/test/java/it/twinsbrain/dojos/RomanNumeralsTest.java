package it.twinsbrain.dojos;

import org.junit.jupiter.api.Test;

import static it.twinsbrain.dojos.RomanNumerals.romanOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanNumeralsTest {

    @Test
    void one_is_I() {
        assertThat(romanOf(1), equalTo("I"));
    }
}
