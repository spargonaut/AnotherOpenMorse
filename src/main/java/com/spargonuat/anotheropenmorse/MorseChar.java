package com.spargonuat.anotheropenmorse;

public enum MorseChar {
    DASH ('_', 3),
    DOT ('.', 1),
    GAP_MORSE_CHAR(' ', 1),
    GAP_CHAR(' ', 3),
    GAP_WORD(' ', 7);

    private final Character character;
    private final int durationUnits;

    private MorseChar (Character character, int durationUnits) {
        this.character = character;
        this.durationUnits = durationUnits;
    }

    public Character getCharacter() {
        return character;
    }

    public int getUnitDurationMilliseconds(int unitDurationMilliseconds) {
        return unitDurationMilliseconds * durationUnits;
    }
}
