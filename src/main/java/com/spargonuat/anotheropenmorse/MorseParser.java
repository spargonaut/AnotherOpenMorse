package com.spargonuat.anotheropenmorse;

import java.util.ArrayList;
import java.util.List;

public class MorseParser {
    public static List<MorseCode> parseString(String stringToParse) {
        List<MorseCode> morseCharList = new ArrayList<MorseCode>();
        for (Character characterString : stringToParse.toCharArray()) {
            String morseCharacter = characterString.toString();
            morseCharList.add(MorseCode.valueOf(morseCharacter));
        }
        return morseCharList;
    }
}