package com.spargonuat.anotheropenmorse;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MorseParserTest {

    @Test
    public void shouldParseStringToMorseCode() {
        String englishString = "FOO";
        List<MorseCode> morseCharList = Arrays.asList(MorseCode.F, MorseCode.O, MorseCode.O);
        assertThat(MorseParser.parseString(englishString), is(morseCharList));
    }

    @Test
    public void shouldParseAnEnglishStringContainingSpaces() {
        String englishString = "F B";
        List<MorseCode> expectedMorseCharList = Arrays.asList(MorseCode.F, MorseCode.SPACE, MorseCode.B);
        assertThat(MorseParser.parseString(englishString), is(expectedMorseCharList));
    }

    @Test
    public void shouldParseAnEnglighStringContainingNumbers() {
        String numberString = "123";
        List<MorseCode> expectedMorseCodeList = Arrays.asList(MorseCode.ONE, MorseCode.TWO, MorseCode.THREE);
        assertThat(MorseParser.parseString(numberString), is(expectedMorseCodeList));
    }

    @Test
    public void shouldParseEnglishStringsContainingLowerCaseLetters() {
        String englishString = "Ping";
        List<MorseCode> expectedMorseCharList = Arrays.asList(MorseCode.P, MorseCode.I, MorseCode.N, MorseCode.G);
        assertThat(MorseParser.parseString(englishString), is(expectedMorseCharList));
    }

    @Test
    public void shouldParseEnglishStringToMorseString() {
        String englishString = "Tux";
        String expectedMorseString = "-..--..-";
        assertThat(MorseParser.parseToMorseString(englishString), is(expectedMorseString));
    }
}