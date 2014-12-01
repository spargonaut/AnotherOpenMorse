package com.spargonuat.anotheropenmorse;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class AOMStringTest {



    @Test
    public void shouldCreateAFullyPopulatedOMStringObjectWhenGivenOnlyAnEnglishString() {

        String englishString = "Bar";
        String expectedEnglishString = "Bar";
        String expectedMorseString = "-....-.-.";
        List<MorseCode> expectedMorseCodeString = Arrays.asList(MorseCode.B, MorseCode.A, MorseCode.R);

        AOMString.Builder aomsBuilder = new AOMString.Builder();
        aomsBuilder.setEnglishString(englishString);
        AOMString aomString = aomsBuilder.build();

        assertThat(aomString.getEnglishString(), is(expectedEnglishString));
        assertThat(aomString.getMorseCodeString(), is(expectedMorseCodeString));
        assertThat(aomString.getMorseString(), is(expectedMorseString));
    }
}