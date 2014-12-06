package com.spargonuat.anotheropenmorse;

import java.util.List;

public class AOMString {

    private String englishString;
    private List<MorseCode> morseCodeString;
    private String morseString;

    private AOMString(String englishString, List<MorseCode> morseCodeString, String morseString) {
        this.englishString = englishString;
        this.morseCodeString = morseCodeString;
        this.morseString = morseString;
    }

    public String getEnglishString() {
        return englishString;
    }

    public List<MorseCode> getMorseCodeString() {
        return morseCodeString;
    }

    public String getMorseString() {
        return morseString;
    }

    public static class Builder {
        private String englishString;
        private String morseString;
        private List<MorseCode> morseCodeString;

        public Builder(String englishString) {
            this.englishString = englishString;
            morseCodeString = MorseParser.parseString(englishString);
            morseString = MorseParser.getMorseString(morseCodeString);
        }

        public Builder setEnglishString(String englishString) {
            this.englishString = englishString;
            return this;
        }

        public AOMString build() {
            if (morseCodeString == null) {
                morseCodeString = MorseParser.parseString(englishString);
                morseString = MorseParser.getMorseString(morseCodeString);
            }
            if (morseString == null) {
                morseString = MorseParser.parseToMorseString(englishString);
            }
            return new AOMString(englishString, morseCodeString, morseString);
        }
    }
}