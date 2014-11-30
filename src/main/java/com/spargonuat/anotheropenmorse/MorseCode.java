package com.spargonuat.anotheropenmorse;

import java.util.Arrays;
import java.util.List;

public enum MorseCode {

    ZERO ("-----", '0', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH)),
    ONE (".----", '1', Arrays.asList(MorseChar.DOT, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH)),
    TWO ("..---", '2', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH)),
    THREE ("...--", '3', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DASH, MorseChar.DASH)),
    FOUR ("....-", '4', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DASH)),
    FIVE (".....", '5', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    SIX ("-....", '6', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    SEVEN ("--...", '7', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    EIGHT ("---..", '8', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DASH, MorseChar.DOT, MorseChar.DOT)),
    NINE ("----.", '9', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH, MorseChar.DOT)),
    A (".-", 'A', Arrays.asList(MorseChar.DOT, MorseChar.DASH)),
    B ("-...", 'B', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    C ("-.-.", 'C', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DASH, MorseChar.DOT)),
    D ("-..", 'D', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DOT)),
    E (".", 'E', Arrays.asList(MorseChar.DOT)),
    F ("..-.", 'F', Arrays.asList(MorseChar.DOT, MorseChar.DOT)),
    G ("--.", 'G', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DOT)),
    H ("....", 'H', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    I ("..", 'I', Arrays.asList(MorseChar.DOT, MorseChar.DOT)),
    J (".---", 'J', Arrays.asList(MorseChar.DOT, MorseChar.DASH, MorseChar.DASH, MorseChar.DASH)),
    K ("-.-", 'K', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DASH)),
    L (".-..", 'L', Arrays.asList(MorseChar.DOT, MorseChar.DASH, MorseChar.DOT, MorseChar.DOT)),
    M ("--", 'M', Arrays.asList(MorseChar.DASH, MorseChar.DASH)),
    N ("-.", 'N', Arrays.asList(MorseChar.DASH, MorseChar.DOT)),
    O ("---", 'O', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DASH)),
    P (".--.", 'P', Arrays.asList(MorseChar.DOT, MorseChar.DASH, MorseChar.DASH)),
    Q ("--.-", 'Q', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DOT, MorseChar.DASH)),
    R (".-.", 'R', Arrays.asList(MorseChar.DOT, MorseChar.DASH, MorseChar.DOT)),
    S ("...", 'S', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    T ("-", 'T', Arrays.asList(MorseChar.DASH)),
    U ("..-", 'U', Arrays.asList(MorseChar.DOT, MorseChar.DASH)),
    V ("...-", 'V', Arrays.asList(MorseChar.DOT, MorseChar.DOT, MorseChar.DOT)),
    W (".--", 'W', Arrays.asList(MorseChar.DOT, MorseChar.DASH, MorseChar.DASH)),
    X ("-..-", 'X', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DOT, MorseChar.DASH)),
    Y ("-.--", 'Y', Arrays.asList(MorseChar.DASH, MorseChar.DOT, MorseChar.DASH, MorseChar.DASH)),
    Z ( "--..", 'Z', Arrays.asList(MorseChar.DASH, MorseChar.DASH, MorseChar.DOT, MorseChar.DOT)),
    SPACE (" ", ' ', Arrays.asList(MorseChar.GAP_WORD));

    private final String morseString;
    private final char englishCharacter;
    private final List<MorseChar> morseChars;

    private MorseCode(String morseString, char englishCharacter, List<MorseChar> morseChars) {
        this.morseString = morseString;
        this.englishCharacter = englishCharacter;
        this.morseChars = morseChars;
    }

    public String getMorseString() {
        return morseString;
    }

    public char getEnglishCharacter() {
        return englishCharacter;
    }

    public List<MorseChar> getMorseChars() {
        return morseChars;
    }
}
