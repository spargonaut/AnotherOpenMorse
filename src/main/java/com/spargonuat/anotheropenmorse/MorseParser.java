package com.spargonuat.anotheropenmorse;

import java.util.ArrayList;
import java.util.List;

public class MorseParser {
    public static List<MorseCode> parseString(String stringToParse) {
        List<MorseCode> morseCharList = new ArrayList<MorseCode>();
        for (Character characterString : stringToParse.toCharArray()) {
            if (characterString.equals(' ')) {
                morseCharList.add(MorseCode.SPACE);
            } else if (Character.isDigit(characterString)) {
                morseCharList.add(parseNumber(characterString));
            } else {
                morseCharList.add(MorseCode.valueOf(characterString.toString().toUpperCase()));
            }
        }
        return morseCharList;
    }

    private static MorseCode parseNumber(Character character) {
        MorseCode morseCharacter = null;
        Integer characterAsInteger = Integer.decode(character.toString());

        // switches are bad, mmmmkay?
        // premature optimization is worse
        switch (characterAsInteger) {
            case 0:
                morseCharacter =  MorseCode.ZERO;
                break;
            case 1:
                morseCharacter =  MorseCode.ONE;
                break;
            case 2:
                morseCharacter =  MorseCode.TWO;
                break;
            case 3:
                morseCharacter =  MorseCode.THREE;
                break;
            case 4:
                morseCharacter =  MorseCode.FOUR;
                break;
            case 5:
                morseCharacter =  MorseCode.FIVE;
                break;
            case 6:
                morseCharacter =  MorseCode.SIX;
                break;
            case 7:
                morseCharacter =  MorseCode.SEVEN;
                break;
            case 8:
                morseCharacter =  MorseCode.EIGHT;
                break;
            case 9:
                morseCharacter =  MorseCode.NINE;
                break;
            default:
                throw new IllegalArgumentException(character + " is not a digit understood by the MorseParser");
        }
        return morseCharacter;
    }
}