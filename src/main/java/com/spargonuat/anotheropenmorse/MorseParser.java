package com.spargonuat.anotheropenmorse;

import java.util.ArrayList;
import java.util.List;

public class MorseParser {
    public static List<MorseCode> parseString(String stringToParse) {
        List<MorseCode> morseCharList = new ArrayList<MorseCode>();
        for(Character characterString : stringToParse.toCharArray()) {
            if (characterString.equals(' ')) {
                morseCharList.add(MorseCode.SPACE);
            } else {
                morseCharList.add(MorseCode.valueOf(characterString.toString()));
            }
        }
        return morseCharList;
    }
}